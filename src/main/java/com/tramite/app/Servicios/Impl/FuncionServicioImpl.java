package com.tramite.app.Servicios.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tramite.app.Entidades.Seleccion;
import com.tramite.app.Servicios.FuncionServicio;

@Service
public class FuncionServicioImpl implements FuncionServicio {

	@Override
	@Transactional(readOnly = true)
	public List<Seleccion> listarEstadosRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

}
