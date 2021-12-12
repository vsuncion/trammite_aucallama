package com.tramite.app.Servicios.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.tramite.app.Datos.PrincipalDao;
import com.tramite.app.Entidades.Expediente;
import com.tramite.app.Entidades.MensajeRespuesta;
import com.tramite.app.Entidades.Persona;
import com.tramite.app.Entidades.PersonaJuridica;
import com.tramite.app.Entidades.PrePersona;
import com.tramite.app.Entidades.PreRequisitoTupa;
import com.tramite.app.Entidades.RequisitosTupac;
import com.tramite.app.Entidades.Seleccion;
import com.tramite.app.Entidades.Tupac;
import com.tramite.app.Servicios.FijaServicio;
import com.tramite.app.Servicios.MantenimientoServicio;
import com.tramite.app.Servicios.PrincipalServicio;
import com.tramite.app.utilitarios.AutoGenerados;
import com.tramite.app.utilitarios.Constantes; 

@Service
public class PrincipalServicioImpl implements PrincipalServicio {
	
	//Logger logger = LoggerFactory.getLogger(getClass());
	private static final Logger logger = Logger.getLogger(PrincipalServicioImpl.class);
	
	@Autowired
	private PrincipalDao  principalDao;
	
	@Autowired
	private FijaServicio  fijaServicio;
	
	@Autowired
	private MantenimientoServicio  mantenimientoServicio;

	@Override
	public Persona buscarPersona(int tipoPersona, String vnumero) { 
		
		
		return principalDao.buscarPersona(tipoPersona, vnumero);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public MensajeRespuesta guardarPrePersona(PrePersona prePersona) {
		boolean respuesta = false;
		MensajeRespuesta mostrarmensaje = new MensajeRespuesta();
		
		// VERICAMOS QUE LA PERSONA NO SE REPITA
		
		
		
		//GENERAMOS LOS CORRELATIVOS 
		prePersona.setVCODIGOACTIVACION(AutoGenerados.getCorrelativoArchivo());
		
		respuesta = principalDao.guardarPrePersona(prePersona);
		
		if(respuesta==true) {
			mostrarmensaje.setCodigo(Constantes.transaccionCorrecta);
			mostrarmensaje.setMensaje(Constantes.transaccionCorrectaTexto+", Se le envio un correo para confirmar a "+prePersona.getVCORREO()+", por favor confirme el correo");
			
			//ENVIAMOS CORREO
			String  cuerpo = "";
			 cuerpo=fijaServicio.cuerpoCorreo(prePersona.getVNOMBRE()+" "+prePersona.getVAPEMATERNO()+" "+prePersona.getVAPEMATERNO(), prePersona.getVCODIGOACTIVACION());
			 fijaServicio.enviarCorreo(prePersona.getVCORREO(), cuerpo);
		}else {
			mostrarmensaje.setCodigo(Constantes.transaccionIncorrecta);
			mostrarmensaje.setMensaje(Constantes.transaccionIncorrectaTexto);
		}
		return mostrarmensaje;
	}

	@Override
	public MensajeRespuesta activarRegistroPrePersona(String codigoActivacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public MensajeRespuesta confirmacionCodigoActivacion(String codigoActivacion) {
		MensajeRespuesta mostrarmensaje = new MensajeRespuesta(); 
		boolean respuesta = false;
		
		try {
			respuesta = principalDao.confirmacionCodigoActivacion(codigoActivacion);
			if(respuesta==true) {
				mostrarmensaje.setCodigo(Constantes.transaccionCorrecta);
				mostrarmensaje.setMensaje(Constantes.transaccionCorrectaTexto);
			}else {
				mostrarmensaje.setCodigo(Constantes.transaccionIncorrecta);
				mostrarmensaje.setMensaje(Constantes.transaccionIncorrectaTexto);
			}
			
		} catch (Exception e) {
		// TODO: handle exception
		logger.error("ERROR =" + this.getClass().getName()+".confirmacionCodigoActivacion ==Causa==" + e.getCause()+" =Mensage="+e.getMessage());
		}
 
		return mostrarmensaje;
	}

	@Override
	@Transactional(readOnly = true)
	public Persona busquedaSolicitante(Expediente expediente) { 
		Persona persona = new Persona();
		try {
			persona = principalDao.busquedaSolicitante(expediente);
		} catch (Exception e) {
		// TODO: handle exception
		logger.error("ERROR =" + this.getClass().getName()+".busquedaSolicitante ==Causa==" + e.getCause()+" =Mensage="+e.getMessage());
		}
		
		return persona;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public boolean guardarExpedienteSimple(Expediente expediente) {
		return principalDao.guardarExpedienteSimple(expediente);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Long guardarPreTupac(Expediente expediente) { 
		return principalDao.guardarPreTupac(expediente);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Expediente preTupacExpediente(Long idprexpediente) { 
		Expediente expediente = new Expediente();
		try {
			expediente = principalDao.preTupacExpediente(idprexpediente);
		} catch (Exception e) {
		// TODO: handle exception
		logger.error("ERROR =" + this.getClass().getName()+".preTupacExpediente ==Causa==" + e.getCause()+" =Mensage="+e.getMessage());
		}
		
		return expediente;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public MensajeRespuesta guardarPreRequisito(PreRequisitoTupa preRequisitoTupa) { 
		MensajeRespuesta mostrarmensaje = new MensajeRespuesta(); 
		boolean respuesta = principalDao.guardarPreRequisito(preRequisitoTupa);
		if(respuesta==true) {
			mostrarmensaje.setCodigo(Constantes.transaccionCorrecta);
			mostrarmensaje.setMensaje(Constantes.transaccionCorrectaTexto);
		}else {
			mostrarmensaje.setCodigo(Constantes.transaccionIncorrecta);
			mostrarmensaje.setMensaje(Constantes.transaccionIncorrectaTexto);
		}
		return mostrarmensaje; 
	}

	@Override
	@Transactional(readOnly = true)
	public List<PreRequisitoTupa> listaPreRequisitos(Long idprexpediente) { 
		return principalDao.listaPreRequisitos(idprexpediente);
	}

	@Override
	@Transactional(readOnly = true)
	public  List<Seleccion> listasTupacRequisitos() { 
		List<Seleccion> listafinal = new ArrayList<Seleccion>();
		List<Tupac> lista = principalDao.listasTupacRequisitos();
		for (Tupac i : lista) {
			Seleccion item = new Seleccion();
			item.setCodigo(i.getTUPACPK());
			item.setEtiqueta(i.getVNOMBRE());
			listafinal.add(item);
		}
		return listafinal;
	}

	@Override
	@Transactional(readOnly = true)
	public PreRequisitoTupa infoPreRequisitoTupa(PreRequisitoTupa preRequisitoTupa) {
		PreRequisitoTupa preRequisitoTupac = new PreRequisitoTupa();
		try {
			preRequisitoTupac = principalDao.infoPreRequisitoTupa(preRequisitoTupa);
		} catch (Exception e) {
		// TODO: handle exception
		logger.error("ERROR =" + this.getClass().getName()+". ==Causa==" + e.getCause()+" =Mensage="+e.getMessage());
		}
		
		return preRequisitoTupac;
	}

	@Override
	@Transactional(readOnly = true)
	public void guardarDetalleArchivosExpedienteTupa(Expediente formExpediente) {
		principalDao.guardarDetalleArchivosExpedienteTupa(formExpediente);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void eliminarArchivoRequerimeinto(Long idprexpediente, Long idrequisito) {
		principalDao.eliminarArchivoRequerimeinto(idprexpediente, idrequisito);
	}

	@Override
	@Transactional(readOnly = true)
	public List<RequisitosTupac> listaRequerimientosTupac(Long idtupac) {  
		return mantenimientoServicio.listarRequisitosTupacPorIdTupac(idtupac);
	}

	@Override
	@Transactional(readOnly = true)
	public MensajeRespuesta buscarPersonaJuridicaDuplicada(PrePersona prePersona) {
		PersonaJuridica personaJuridica = new PersonaJuridica();
		MensajeRespuesta mostrarmensaje = new MensajeRespuesta(); 
		
		try {
			personaJuridica = principalDao.buscarPersonaJuridicaDuplicada(prePersona);
			
			if(personaJuridica.getVRUC()!=null) {
				mostrarmensaje.setCodigo(Constantes.transaccionIncorrecta);
				mostrarmensaje.setMensaje("EL NUMERO DE RUC :"+prePersona.getVRUC()+" SE ENCUENTRA DUPLICADO");
				
			}else {
				mostrarmensaje.setCodigo(Constantes.transaccionCorrecta);  
			}
		} catch (Exception e) {
		// TODO: handle exception
		logger.error("ERROR =" + this.getClass().getName()+".buscarPersonaJuridicaDuplicada ==Causa==" + e.getCause()+" =Mensage="+e.getMessage());
		}
		
		
		return mostrarmensaje;
	}

	@Override
	@Transactional(readOnly = true)
	public PrePersona buscarPrepersona(PrePersona prePersona) { 
		PrePersona prePersonax = new PrePersona();
		try {
			prePersonax = principalDao.buscarPrepersona(prePersona);
		} catch (Exception e) {
		// TODO: handle exception
		logger.error("ERROR =" + this.getClass().getName()+".buscarPrepersona ==Causa==" + e.getCause()+" =Mensage="+e.getMessage());
		}
		
		return prePersonax;
	}

	 

}
