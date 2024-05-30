package co.com.park.gp.crosscutting.exceptions.messageCatalog.impl;

import java.util.HashMap;
import java.util.Map;

import co.com.park.gp.crosscutting.exceptions.custom.CroscuttingGPException;
import co.com.park.gp.crosscutting.exceptions.messageCatalog.MessageCatalog;
import co.com.park.gp.crosscutting.exceptions.messageCatalog.data.CodigoMensaje;
import co.com.park.gp.crosscutting.exceptions.messageCatalog.data.Mensaje;
import co.com.park.gp.crosscutting.helpers.ObjectHelper;

public class MessageCatalogBase implements MessageCatalog {
	
	private final Map<String,Mensaje> mensajes = new HashMap<>();

	@Override
	public void inicializar() {
		mensajes.clear();
		mensajes.put(CodigoMensaje.M00001.getIdentificador(), new Mensaje(CodigoMensaje.M00001,
				"El código del mensaje que quiere obtener del catálogo mensajes llegó nulo..."));
		mensajes.put(CodigoMensaje.M00002.getIdentificador(), new Mensaje(CodigoMensaje.M00002,
				"Se ha presentado un problema tratando de llevar a cabo la operación deseada..."));
		mensajes.put(CodigoMensaje.M00003.getIdentificador(), new Mensaje(CodigoMensaje.M00003,
				"El identificador del mensaje \"${1}\" que se intentó obtener, no está en el catálogo de mensajes base..."));
		mensajes.put(CodigoMensaje.M00004.getIdentificador(), new Mensaje(CodigoMensaje.M00004,
				"El mensaje con identificador \"${1}\" que se intentó obtener, no está configurado para residir en el catálogo de mensajes base..."));
		mensajes.put(CodigoMensaje.M00005.getIdentificador(), new Mensaje(CodigoMensaje.M00005,
				"El mensaje con identificador \"${1}\" que se intentó obtener, no está configurado para residir en el catálogo de mensajes externo..."));
		mensajes.put(CodigoMensaje.M00006.getIdentificador(), new Mensaje(CodigoMensaje.M00006,
				"El identificador del mensaje \"${1}\" que se intentó obtener, no está en el catálogo de mensajes externo..."));
		mensajes.put(CodigoMensaje.M00007.getIdentificador(), new Mensaje(CodigoMensaje.M00007,
				"Se ha presentado un problema tratando de validar si la conexión SQL con la fuente de información deseada estaba cerrada..."));
		mensajes.put(CodigoMensaje.M00008.getIdentificador(), new Mensaje(CodigoMensaje.M00008,
				"Se ha presentado un problema INESPERADO tratando de validar si la conexión SQL con la fuente de información deseada estaba cerrada..."));
		mensajes.put(CodigoMensaje.M00009.getIdentificador(), new Mensaje(CodigoMensaje.M00009,
				"Se ha intentado realizar el cierre de una conexión SQL que ya estaba cerrada..."));
		mensajes.put(CodigoMensaje.M00010.getIdentificador(), new Mensaje(CodigoMensaje.M00010,
				"Se ha presentado un problema tratando de cerrar la conexión SQL con la fuente de información deseada..."));
		mensajes.put(CodigoMensaje.M00011.getIdentificador(), new Mensaje(CodigoMensaje.M00011,
				"Se ha presentado un problema INESPERADO tratando de cerrar la conexión SQL con la fuente de información deseada..."));
		mensajes.put(CodigoMensaje.M00012.getIdentificador(), new Mensaje(CodigoMensaje.M00012,
				"Se ha intentado confirmar una transacción con una conexión SQL cerrada..."));
		mensajes.put(CodigoMensaje.M00013.getIdentificador(), new Mensaje(CodigoMensaje.M00013,
				"Se ha intentado confirmar una transacción cuando el autocommit de la conexión con la base de datos estaba activado..."));
		mensajes.put(CodigoMensaje.M00014.getIdentificador(), new Mensaje(CodigoMensaje.M00014,
				"Se ha presentado un problema tratando de confirmar una transacción SQL con la fuente de información deseada..."));
		mensajes.put(CodigoMensaje.M00015.getIdentificador(), new Mensaje(CodigoMensaje.M00015,
				"Se ha presentado un problema INESPERADO tratando de confirmar una transacción SQL con la fuente de información deseada..."));
		mensajes.put(CodigoMensaje.M00016.getIdentificador(), new Mensaje(CodigoMensaje.M00016,
				"Se ha intentado cancelar una transacción con una conexión SQL cerrada..."));
		mensajes.put(CodigoMensaje.M00017.getIdentificador(), new Mensaje(CodigoMensaje.M00017,
				"Se ha intentado cancelar una transacción cuando el autocommit de la conexión con la base de datos estaba activado..."));
		mensajes.put(CodigoMensaje.M00018.getIdentificador(), new Mensaje(CodigoMensaje.M00018,
				"Se ha presentado un problema tratando de cancelar una transacción SQL con la fuente de información deseada..."));
		mensajes.put(CodigoMensaje.M00019.getIdentificador(), new Mensaje(CodigoMensaje.M00019,
				"Se ha presentado un problema INESPERADO tratando de cancelar una transacción SQL con la fuente de información deseada..."));
 
		mensajes.put(CodigoMensaje.M00020.getIdentificador(), new Mensaje(CodigoMensaje.M00020,
				"Se ha intentado iniciar una transacción con una conexión SQL cerrada..."));
		mensajes.put(CodigoMensaje.M00021.getIdentificador(), new Mensaje(CodigoMensaje.M00022,
				"Se ha presentado un problema tratando de iniciar una transacción SQL con la fuente de información deseada..."));
		mensajes.put(CodigoMensaje.M00022.getIdentificador(), new Mensaje(CodigoMensaje.M00022,
				"Se ha presentado un problema INESPERADO tratando de iniciar una transacción SQL con la fuente de información deseada..."));
		mensajes.put(CodigoMensaje.M00023.getIdentificador(), new Mensaje(CodigoMensaje.M00023,
				"Se ha presentado un problema consultar la informacion de las ciudad"));
		mensajes.put(CodigoMensaje.M00024.getIdentificador(), new Mensaje(CodigoMensaje.M00024,
				"Se ha presentado un problema INESPERADO tratando de consultar la ciudad"));
		mensajes.put(CodigoMensaje.M00025.getIdentificador(), new Mensaje(CodigoMensaje.M00025,
				"Se ha presentado un problema al consultar la información del departamento"));
		mensajes.put(CodigoMensaje.M00026.getIdentificador(), new Mensaje(CodigoMensaje.M00026,
				"Se ha presentado un problema INESPERADO tratando de consultar el departamento"));
		mensajes.put(CodigoMensaje.M00027.getIdentificador(), new Mensaje(CodigoMensaje.M00027,
				"Se ha presentado un problema al consultar la información de los países."));
		mensajes.put(CodigoMensaje.M00028.getIdentificador(), new Mensaje(CodigoMensaje.M00028,
				"Se ha presentado un problema INESPERADO tratando de consultar los países."));
		mensajes.put(CodigoMensaje.M00029.getIdentificador(), new Mensaje(CodigoMensaje.M00029,
				 "Se ha presentado un problema al consultar la información del parqueadero"));
		mensajes.put(CodigoMensaje.M00030.getIdentificador(), new Mensaje(CodigoMensaje.M00030,
				"Se ha presentado un problema INESPERADO tratando de consultar los parqueaderos"));
		mensajes.put(CodigoMensaje.M00031.getIdentificador(), new Mensaje(CodigoMensaje.M00031,
				"Se ha presentado un problema al consultar la información de las sedes"));
		mensajes.put(CodigoMensaje.M00032.getIdentificador(), new Mensaje(CodigoMensaje.M00032,
				"Se ha presentado un problema INESPERADO tratando de consultar las sedes"));
		mensajes.put(CodigoMensaje.M00033.getIdentificador(), new Mensaje(CodigoMensaje.M00033,
				"Se ha presentado un problema tratando de registrar la información de la sede."));
		mensajes.put(CodigoMensaje.M00034.getIdentificador(), new Mensaje(CodigoMensaje.M00034,
				"Se ha presentado un problema INESPERADO tratando de registrar la información de la sede."));
		mensajes.put(CodigoMensaje.M00035.getIdentificador(), new Mensaje(CodigoMensaje.M00035,
				"Se ha presentado un problema tratando de llevar a cabo la consulta de las sedes..."));
		mensajes.put(CodigoMensaje.M00036.getIdentificador(), new Mensaje(CodigoMensaje.M00036,
				"El dao factory para consultar la sede llegó nulo..."));
		mensajes.put(CodigoMensaje.M00037.getIdentificador(), new Mensaje(CodigoMensaje.M00037,
				 "Se ha presentado un problema tratando de llevar a cabo la consulta de los tipos de sede..."));
		mensajes.put(CodigoMensaje.M00038.getIdentificador(), new Mensaje(CodigoMensaje.M00038,
				"El dao factory para consultar el tipo de sede llegó nulo..."));
		mensajes.put(CodigoMensaje.M00039.getIdentificador(), new Mensaje(CodigoMensaje.M00039,
				"ciudades consultadas exitosamente"));
		mensajes.put(CodigoMensaje.M00040.getIdentificador(), new Mensaje(CodigoMensaje.M00040,
				"departamentos consultados exitosamente"));
		mensajes.put(CodigoMensaje.M00041.getIdentificador(), new Mensaje(CodigoMensaje.M00041,
				"paises consultados exitosamente"));
		mensajes.put(CodigoMensaje.M00042.getIdentificador(), new Mensaje(CodigoMensaje.M00042,
				"parqueaderos consultados exitosamente"));
		mensajes.put(CodigoMensaje.M00043.getIdentificador(), new Mensaje(CodigoMensaje.M00043,
				"sedes consultados exitosamente"));
		mensajes.put(CodigoMensaje.M00044.getIdentificador(), new Mensaje(CodigoMensaje.M00044,
				"tipoSedes consultadas exitosamente"));
		mensajes.put(CodigoMensaje.M00045.getIdentificador(), new Mensaje(CodigoMensaje.M00045,
				"Se ha presentado un problema tratando de llevar un registro de la sede..."));
		mensajes.put(CodigoMensaje.M00046.getIdentificador(), new Mensaje(CodigoMensaje.M00046,
				"El DAO factory para crear la sede llegó nulo..."));
		mensajes.put(CodigoMensaje.M00047.getIdentificador(), new Mensaje(CodigoMensaje.M00047,
				"No es posible crear el DAO deseado con una conexion cerrada"));
		mensajes.put(CodigoMensaje.M00048.getIdentificador(), new Mensaje(CodigoMensaje.M00048,
				"Se ha presentado una SQLException tratando de realizar la consulta de las ciudades en la tabla \"Ciudad\" de la base de datos PostgresSQL"));
		mensajes.put(CodigoMensaje.M00049.getIdentificador(), new Mensaje(CodigoMensaje.M00049,
				"Se ha presentado una SQLException tratando de realizar la consulta de los departamentos en la tabla \"Departamento\" de la base de datos."));
		mensajes.put(CodigoMensaje.M00050.getIdentificador(), new Mensaje(CodigoMensaje.M00050,
				"Se ha presentado una SQLException tratando de realizar la consulta de los países en la tabla \"Pais\" de la base de datos."));
		mensajes.put(CodigoMensaje.M00051.getIdentificador(), new Mensaje(CodigoMensaje.M00051,
				 "Se ha presentado una SQLException tratando de realizar la consulta de los parqueaderos en la tabla \"Parqueadero\" de la base de datos."));
		mensajes.put(CodigoMensaje.M00052.getIdentificador(), new Mensaje(CodigoMensaje.M00052,
				"Se ha presentado una SQLException tratando de realizar el insert de la sede en la tabla \"Sede\" de la base de datos."));
		mensajes.put(CodigoMensaje.M00053.getIdentificador(), new Mensaje(CodigoMensaje.M00053,
				"Se ha presentado una SQLException tratando de realizar la consulta de las sedes en la tabla 'Sede' de la base de datos."));
		mensajes.put(CodigoMensaje.M00054.getIdentificador(), new Mensaje(CodigoMensaje.M00054,
				"Se ha presentado una SQLException tratando de realizar la consulta de los tipos de sede en la tabla \"TipoSede\" de la base de datos."));
		mensajes.put(CodigoMensaje.M00055.getIdentificador(), new Mensaje(CodigoMensaje.M00055,
				"Se ha presentado un problema tratando de obtener la conexión con la base de datos PostgreSQL. Por favor revise la traza de errores para identificar y solucionar el problema..."));
	
	}
		
	

	@Override
	public String obtenerContenidoMensaje(CodigoMensaje codigo, String... parametros) {
		return obtenerMensaje(codigo, parametros).getContenido();
	}

	@Override
	public final Mensaje obtenerMensaje(CodigoMensaje codigo, String... parametros) {
		if (ObjectHelper.getObjectHelper().isNull(codigo)) {
			var mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M00001);
			throw new CroscuttingGPException(mensajeTecnico, mensajeUsuario);
		}
		
		if (!codigo.isBase()) {
			var mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M00004,codigo.getIdentificador());
			throw new CroscuttingGPException(mensajeTecnico, mensajeUsuario);
		}
		
		if (!mensajes.containsKey(codigo.getIdentificador())) {
			var mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M00002);
			var mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M00003,codigo.getIdentificador());
			throw new CroscuttingGPException(mensajeTecnico, mensajeUsuario);
		}
		return mensajes.get(codigo.getIdentificador());
	}

}
