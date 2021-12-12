package com.tramite.app.Entidades;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Expediente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long NIDEXPEDIENTEPK;
	private String VCODIGO_EXPEDIENTE;
	private Long TIPO_DOCUMENTOFK;
	private String VNUMERODOCUMENTO;
	private String VNUMEROFOLIO;
	private String VASUNTO;
	private Date DFECHADOCUMENTO;
	private String VNOMBRE_ARCHIVO;
	private String VUBICACION_ARCHIVO;
	private String VEXTENSION;
	private Long TUPACFK;
	private Long NTIPOPERSONA;
	private Long PERSONAFK;
	private Date DFECHATERMINO;
	private int NDIASPLAZO;
	private int NDIASRESTANTES;
	private Long NESTADODOCUMENTOFK;
	private int NESTADO;
	private int NORDEN;
	private Date DFECREGISTRO;
	private Long NUSUREGISTRA;
	private Date DFECMODIFICA;
	private Long NUSUMODIFICA;
	private Date DFECELIMINA;
	private Long NUSUELIMINA;
	private Long NIDPERSONAPK;

	private Long TIPODOCUMENTOBUSCAR;
	private String CAJABUSQUEDA;
	private String ESTADODOCUMENTO;
	private String VREMITENTE;

	private String VRUC;
	private String VRAZON_SOCIAL;
	private String VNOMBRE;
	private String VAPELLIDO_PATERNO;
	private String VAPELLIDO_MATERNO;
	private String VDIRECCION;
	private String VCORREO;
	private String VTELEFONO;
	private String VFECHADOCUMENTO;
	private String VOBSERVACION;
	private Long OFICINA_DESTINOFK;
	private Long NIDMOVIMIENTOFK;
	private Long OFICINA_ORIGENFK;
	private String VDFECREGISTRO;
	private String VDIRECCION_SOLICITANTE;
	private Long IDPREEXPEDIENTEPK;
	private String VTIPO_DOCUMENTOS;
	private String VNOMBRETUPAC;
	private Long VREQUISITO;
	private String VCARGO;
	private int NANIO;
	private Long NITEM;
	private String VNOMBRE_OFICINA_ORIGEN;
	private String VNOMBRE_OFICINA_ACTUAL;
	private String USUARIO_OFICINA;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date DFECHAINICIO;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date DFECHAFIN;

	public Expediente() {
	}

	public String getESTADODOCUMENTO() {
		return ESTADODOCUMENTO;
	}

	public void setESTADODOCUMENTO(String eSTADODOCUMENTO) {
		ESTADODOCUMENTO = eSTADODOCUMENTO;
	}

	public String getVREMITENTE() {
		return VREMITENTE;
	}

	public void setVREMITENTE(String vREMITENTE) {
		VREMITENTE = vREMITENTE;
	}

	public Long getNIDEXPEDIENTEPK() {
		return NIDEXPEDIENTEPK;
	}

	public void setNIDEXPEDIENTEPK(Long nIDEXPEDIENTEPK) {
		NIDEXPEDIENTEPK = nIDEXPEDIENTEPK;
	}

	public String getVCODIGO_EXPEDIENTE() {
		return VCODIGO_EXPEDIENTE;
	}

	public void setVCODIGO_EXPEDIENTE(String vCODIGO_EXPEDIENTE) {
		VCODIGO_EXPEDIENTE = vCODIGO_EXPEDIENTE;
	}

	public Long getTIPO_DOCUMENTOFK() {
		return TIPO_DOCUMENTOFK;
	}

	public void setTIPO_DOCUMENTOFK(Long tIPO_DOCUMENTOFK) {
		TIPO_DOCUMENTOFK = tIPO_DOCUMENTOFK;
	}

	public String getVNUMERODOCUMENTO() {
		return VNUMERODOCUMENTO;
	}

	public void setVNUMERODOCUMENTO(String vNUMERODOCUMENTO) {
		VNUMERODOCUMENTO = vNUMERODOCUMENTO;
	}

	public String getVNUMEROFOLIO() {
		return VNUMEROFOLIO;
	}

	public void setVNUMEROFOLIO(String vNUMEROFOLIO) {
		VNUMEROFOLIO = vNUMEROFOLIO;
	}

	public String getVASUNTO() {
		return VASUNTO;
	}

	public void setVASUNTO(String vASUNTO) {
		VASUNTO = vASUNTO;
	}

	public Date getDFECHADOCUMENTO() {
		return DFECHADOCUMENTO;
	}

	public void setDFECHADOCUMENTO(Date dFECHADOCUMENTO) {
		DFECHADOCUMENTO = dFECHADOCUMENTO;
	}

	public String getVNOMBRE_ARCHIVO() {
		return VNOMBRE_ARCHIVO;
	}

	public void setVNOMBRE_ARCHIVO(String vNOMBRE_ARCHIVO) {
		VNOMBRE_ARCHIVO = vNOMBRE_ARCHIVO;
	}

	public String getVUBICACION_ARCHIVO() {
		return VUBICACION_ARCHIVO;
	}

	public void setVUBICACION_ARCHIVO(String vUBICACION_ARCHIVO) {
		VUBICACION_ARCHIVO = vUBICACION_ARCHIVO;
	}

	public String getVEXTENSION() {
		return VEXTENSION;
	}

	public void setVEXTENSION(String vEXTENSION) {
		VEXTENSION = vEXTENSION;
	}

	public String obtenerRutaAbsoluArchivo() {

		return this.getVUBICACION_ARCHIVO() + this.getVNOMBRE_ARCHIVO() + "." + this.getVEXTENSION();
	}

	public Long getTUPACFK() {
		return TUPACFK;
	}

	public void setTUPACFK(Long tUPACFK) {
		TUPACFK = tUPACFK;
	}

	public Long getNTIPOPERSONA() {
		return NTIPOPERSONA;
	}

	public void setNTIPOPERSONA(Long nTIPOPERSONA) {
		NTIPOPERSONA = nTIPOPERSONA;
	}

	public Long getPERSONAFK() {
		return PERSONAFK;
	}

	public void setPERSONAFK(Long pERSONAFK) {
		PERSONAFK = pERSONAFK;
	}

	public Date getDFECHATERMINO() {
		return DFECHATERMINO;
	}

	public void setDFECHATERMINO(Date dFECHATERMINO) {
		DFECHATERMINO = dFECHATERMINO;
	}

	public int getNDIASPLAZO() {
		return NDIASPLAZO;
	}

	public void setNDIASPLAZO(int nDIASPLAZO) {
		NDIASPLAZO = nDIASPLAZO;
	}

	public int getNDIASRESTANTES() {
		return NDIASRESTANTES;
	}

	public void setNDIASRESTANTES(int nDIASRESTANTES) {
		NDIASRESTANTES = nDIASRESTANTES;
	}

	public Long getNESTADODOCUMENTOFK() {
		return NESTADODOCUMENTOFK;
	}

	public void setNESTADODOCUMENTOFK(Long nESTADODOCUMENTOFK) {
		NESTADODOCUMENTOFK = nESTADODOCUMENTOFK;
	}

	public int getNESTADO() {
		return NESTADO;
	}

	public void setNESTADO(int nESTADO) {
		NESTADO = nESTADO;
	}

	public int getNORDEN() {
		return NORDEN;
	}

	public void setNORDEN(int nORDEN) {
		NORDEN = nORDEN;
	}

	public Date getDFECREGISTRO() {
		return DFECREGISTRO;
	}

	public void setDFECREGISTRO(Date dFECREGISTRO) {
		DFECREGISTRO = dFECREGISTRO;
	}

	public Long getNUSUREGISTRA() {
		return NUSUREGISTRA;
	}

	public void setNUSUREGISTRA(Long nUSUREGISTRA) {
		NUSUREGISTRA = nUSUREGISTRA;
	}

	public Date getDFECMODIFICA() {
		return DFECMODIFICA;
	}

	public void setDFECMODIFICA(Date dFECMODIFICA) {
		DFECMODIFICA = dFECMODIFICA;
	}

	public Long getNUSUMODIFICA() {
		return NUSUMODIFICA;
	}

	public void setNUSUMODIFICA(Long nUSUMODIFICA) {
		NUSUMODIFICA = nUSUMODIFICA;
	}

	public Date getDFECELIMINA() {
		return DFECELIMINA;
	}

	public void setDFECELIMINA(Date dFECELIMINA) {
		DFECELIMINA = dFECELIMINA;
	}

	public Long getNUSUELIMINA() {
		return NUSUELIMINA;
	}

	public void setNUSUELIMINA(Long nUSUELIMINA) {
		NUSUELIMINA = nUSUELIMINA;
	}

	public Long getNIDPERSONAPK() {
		return NIDPERSONAPK;
	}

	public void setNIDPERSONAPK(Long nIDPERSONAPK) {
		NIDPERSONAPK = nIDPERSONAPK;
	}

	public Long getTIPODOCUMENTOBUSCAR() {
		return TIPODOCUMENTOBUSCAR;
	}

	public void setTIPODOCUMENTOBUSCAR(Long tIPODOCUMENTOBUSCAR) {
		TIPODOCUMENTOBUSCAR = tIPODOCUMENTOBUSCAR;
	}

	public String getCAJABUSQUEDA() {
		return CAJABUSQUEDA;
	}

	public void setCAJABUSQUEDA(String cAJABUSQUEDA) {
		CAJABUSQUEDA = cAJABUSQUEDA;
	}

	public String getVRUC() {
		return VRUC;
	}

	public void setVRUC(String vRUC) {
		VRUC = vRUC;
	}

	public String getVRAZON_SOCIAL() {
		return VRAZON_SOCIAL;
	}

	public void setVRAZON_SOCIAL(String vRAZON_SOCIAL) {
		VRAZON_SOCIAL = vRAZON_SOCIAL;
	}

	public String getVNOMBRE() {
		return VNOMBRE;
	}

	public void setVNOMBRE(String vNOMBRE) {
		VNOMBRE = vNOMBRE;
	}

	public String getVAPELLIDO_PATERNO() {
		return VAPELLIDO_PATERNO;
	}

	public void setVAPELLIDO_PATERNO(String vAPELLIDO_PATERNO) {
		VAPELLIDO_PATERNO = vAPELLIDO_PATERNO;
	}

	public String getVAPELLIDO_MATERNO() {
		return VAPELLIDO_MATERNO;
	}

	public void setVAPELLIDO_MATERNO(String vAPELLIDO_MATERNO) {
		VAPELLIDO_MATERNO = vAPELLIDO_MATERNO;
	}

	public String getVDIRECCION() {
		return VDIRECCION;
	}

	public void setVDIRECCION(String vDIRECCION) {
		VDIRECCION = vDIRECCION;
	}

	public String getVCORREO() {
		return VCORREO;
	}

	public void setVCORREO(String vCORREO) {
		VCORREO = vCORREO;
	}

	public String getVTELEFONO() {
		return VTELEFONO;
	}

	public void setVTELEFONO(String vTELEFONO) {
		VTELEFONO = vTELEFONO;
	}

	public String getVFECHADOCUMENTO() {
		return VFECHADOCUMENTO;
	}

	public void setVFECHADOCUMENTO(String vFECHADOCUMENTO) {
		VFECHADOCUMENTO = vFECHADOCUMENTO;
	}

	public Long getOFICINA_DESTINOFK() {
		return OFICINA_DESTINOFK;
	}

	public void setOFICINA_DESTINOFK(Long oFICINA_DESTINOFK) {
		OFICINA_DESTINOFK = oFICINA_DESTINOFK;
	}

	public String getVOBSERVACION() {
		return VOBSERVACION;
	}

	public void setVOBSERVACION(String vOBSERVACION) {
		VOBSERVACION = vOBSERVACION;
	}

	public Long getNIDMOVIMIENTOFK() {
		return NIDMOVIMIENTOFK;
	}

	public void setNIDMOVIMIENTOFK(Long nIDMOVIMIENTOFK) {
		NIDMOVIMIENTOFK = nIDMOVIMIENTOFK;
	}

	public Long getOFICINA_ORIGENFK() {
		return OFICINA_ORIGENFK;
	}

	public void setOFICINA_ORIGENFK(Long oFICINA_ORIGENFK) {
		OFICINA_ORIGENFK = oFICINA_ORIGENFK;
	}

	public String getVDFECREGISTRO() {
		return VDFECREGISTRO;
	}

	public void setVDFECREGISTRO(String vDFECREGISTRO) {
		VDFECREGISTRO = vDFECREGISTRO;
	}

	public String getVDIRECCION_SOLICITANTE() {
		return VDIRECCION_SOLICITANTE;
	}

	public void setVDIRECCION_SOLICITANTE(String vDIRECCION_SOLICITANTE) {
		VDIRECCION_SOLICITANTE = vDIRECCION_SOLICITANTE;
	}

	public Long getIDPREEXPEDIENTEPK() {
		return IDPREEXPEDIENTEPK;
	}

	public void setIDPREEXPEDIENTEPK(Long iDPREEXPEDIENTEPK) {
		IDPREEXPEDIENTEPK = iDPREEXPEDIENTEPK;
	}

	public String getVTIPO_DOCUMENTOS() {
		return VTIPO_DOCUMENTOS;
	}

	public void setVTIPO_DOCUMENTOS(String vTIPO_DOCUMENTOS) {
		VTIPO_DOCUMENTOS = vTIPO_DOCUMENTOS;
	}

	public String getVNOMBRETUPAC() {
		return VNOMBRETUPAC;
	}

	public void setVNOMBRETUPAC(String vNOMBRETUPAC) {
		VNOMBRETUPAC = vNOMBRETUPAC;
	}

	public Long getVREQUISITO() {
		return VREQUISITO;
	}

	public void setVREQUISITO(Long vREQUISITO) {
		VREQUISITO = vREQUISITO;
	}

	public Date getDFECHAINICIO() {
		return DFECHAINICIO;
	}

	public void setDFECHAINICIO(Date dFECHAINICIO) {
		DFECHAINICIO = dFECHAINICIO;
	}

	public Date getDFECHAFIN() {
		return DFECHAFIN;
	}

	public void setDFECHAFIN(Date dFECHAFIN) {
		DFECHAFIN = dFECHAFIN;
	}

	public String getVCARGO() {
		return VCARGO;
	}

	public void setVCARGO(String vCARGO) {
		VCARGO = vCARGO;
	}

	public int getNANIO() {
		return NANIO;
	}

	public void setNANIO(int nANIO) {
		NANIO = nANIO;
	}

	public Long getNITEM() {
		return NITEM;
	}

	public void setNITEM(Long nITEM) {
		NITEM = nITEM;
	}

	public String getVNOMBRE_OFICINA_ORIGEN() {
		return VNOMBRE_OFICINA_ORIGEN;
	}

	public void setVNOMBRE_OFICINA_ORIGEN(String vNOMBRE_OFICINA_ORIGEN) {
		VNOMBRE_OFICINA_ORIGEN = vNOMBRE_OFICINA_ORIGEN;
	}

	public String getUSUARIO_OFICINA() {
		return USUARIO_OFICINA;
	}

	public void setUSUARIO_OFICINA(String uSUARIO_OFICINA) {
		USUARIO_OFICINA = uSUARIO_OFICINA;
	}

	public String getVNOMBRE_OFICINA_ACTUAL() {
		return VNOMBRE_OFICINA_ACTUAL;
	}

	public void setVNOMBRE_OFICINA_ACTUAL(String vNOMBRE_OFICINA_ACTUAL) {
		VNOMBRE_OFICINA_ACTUAL = vNOMBRE_OFICINA_ACTUAL;
	}

}
