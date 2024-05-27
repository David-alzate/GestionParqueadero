package co.com.park.gp.business.facade.impl.sede;

import co.com.park.gp.business.assembler.dto.impl.SedeAssemblerDTO;
import co.com.park.gp.business.facade.FacadeWhitoutReturn;
import co.com.park.gp.business.usecase.impl.sede.RegistrarSede;
import co.com.park.gp.crosscutting.exceptions.GPException;
import co.com.park.gp.crosscutting.exceptions.custom.BusinessGPException;
import co.com.park.gp.data.dao.factory.DAOFactory;
import co.com.park.gp.dto.SedeDTO;

public final class RegistrarSedeFacade implements FacadeWhitoutReturn<SedeDTO> {

    private DAOFactory daoFactory;

    public RegistrarSedeFacade() {
        daoFactory = DAOFactory.getFactory();
    }

    @Override
    public void execute(SedeDTO dto) {
        daoFactory.iniciarTransaccion();
        
        try {
            var useCase = new RegistrarSede(daoFactory);
            var sedeDomain = SedeAssemblerDTO.getInstance().toDomain(dto);
            
            useCase.execute(sedeDomain);
            
            daoFactory.confirmarTransaccion();
        } catch (GPException excepcion) {
            daoFactory.cancelarTransaccion();
            throw excepcion;
        } catch (Exception excepcion) {
            daoFactory.cancelarTransaccion();
            
            var mensajeUsuario = "Se ha presentado un problema tratando de registrar la información de la sede.";
            var mensajeTecnico = "Se ha presentado un problema INESPERADO tratando de registrar la información de la sede.";
            
            throw new BusinessGPException(mensajeTecnico, mensajeUsuario, excepcion);
        } finally {
            daoFactory.cerrarConexion();
        }
    }
}
