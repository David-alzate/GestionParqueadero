package co.com.park.gp.data.dao.entity.concrete.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.com.park.gp.crosscutting.exceptions.custom.DataGPException;
import co.com.park.gp.crosscutting.helpers.ObjectHelper;
import co.com.park.gp.crosscutting.helpers.TextHelper;
import co.com.park.gp.crosscutting.helpers.UUIDHelper;
import co.com.park.gp.data.dao.entity.PaisDAO;
import co.com.park.gp.data.dao.entity.concrete.SqlConnection;
import co.com.park.gp.entity.PaisEntity;

public class PaisPostgresqlDAO extends SqlConnection implements PaisDAO {

	public PaisPostgresqlDAO(final Connection conexion) {
		super(conexion);
	}

	@Override
	public List<PaisEntity> consultar(PaisEntity data) {
		final StringBuilder sentenciaSql = new StringBuilder();
		sentenciaSql.append("SELECT p.id, p.nombre");
		sentenciaSql.append(" FROM pais p");
		sentenciaSql.append(" WHERE 1=1");

		final List<Object> parametros = new ArrayList<>();

		if (!ObjectHelper.getObjectHelper().isNull(data.getId()) && !data.getId().equals(UUIDHelper.getDefault())) {
			sentenciaSql.append(" AND p.id = ?");
			parametros.add(data.getId());
		}
		if (!TextHelper.isNullOrEmpty(data.getNombre())) {
			sentenciaSql.append(" AND p.nombre = ?");
			parametros.add(data.getNombre());
		}

		final List<PaisEntity> paises = new ArrayList<>();

		try (final PreparedStatement sentenciaSqlPreparada = getConexion().prepareStatement(sentenciaSql.toString())) {
			for (int i = 0; i < parametros.size(); i++) {
				sentenciaSqlPreparada.setObject(i + 1, parametros.get(i));
			}

			try (final ResultSet resultado = sentenciaSqlPreparada.executeQuery()) {
				while (resultado.next()) {
					PaisEntity pais = PaisEntity.build();
					pais.setId(UUIDHelper.convertToUUID(resultado.getString("id")));
					pais.setNombre(resultado.getString("nombre"));

					paises.add(pais);
				}
			}

		} catch (final SQLException excepcion) {
			var mensajeUsuario = "Se ha presentado un problema tratando de consultar los países. Por favor, contacte al administrador del sistema.";
			var mensajeTecnico = "Se ha presentado una SQLException tratando de realizar la consulta de los países en la tabla \"Pais\" de la base de datos.";
			throw new DataGPException(mensajeUsuario, mensajeTecnico, excepcion);

		} catch (final Exception excepcion) {
			var mensajeUsuario = "Se ha presentado un problema tratando de consultar los países. Por favor, contacte al administrador del sistema.";
			var mensajeTecnico = "Se ha presentado un problema INESPERADO con una excepción de tipo Exception tratando de realizar la consulta de los países en la tabla \"Pais\" de la base de datos.";
			throw new DataGPException(mensajeUsuario, mensajeTecnico, excepcion);
		}

		return paises;
	}

}
