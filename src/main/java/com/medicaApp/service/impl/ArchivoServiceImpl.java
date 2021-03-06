package com.medicaapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicaapp.dao.IArchivoDao;
import com.medicaapp.dto.ArchivoDto;
import com.medicaapp.model.Archivo;
import com.medicaapp.service.IArchivoService;

@Service
public class ArchivoServiceImpl implements IArchivoService{

	@Autowired
	private IArchivoDao dao;

	@Override
	public int guardar(Archivo archivo) {
		Archivo ar = dao.save(archivo);
		return ar.getIdArchivo() > 0 ? 1 : 0;
	}

	@Override
	public byte[] leerArchivo(Integer idArchivo) {
		Optional<Archivo> opt = dao.findById(idArchivo);
		return opt.isPresent() ? opt.get().getValue() : new Archivo().getValue();
	}

	@Override
	public List<ArchivoDto> listarArchivos() {
		return dao.listarArchivosSinData();
	}


}
