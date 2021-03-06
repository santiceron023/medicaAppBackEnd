package com.medicaapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.medicaapp.dao.IConsultaExamenDao;
import com.medicaapp.dao.IPacienteDao;
import com.medicaapp.model.Paciente;
import com.medicaapp.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{


	@Autowired
	IPacienteDao pacienteDao;
	
	@Autowired
	IConsultaExamenDao con;

	@Override
	public Paciente registrar(Paciente t) {
		return pacienteDao.save(t);
	}

	@Override
	public Paciente modificar(Paciente t) {
		return pacienteDao.save(t);
	}

	@Override
	public void eliminar(Integer id) {
		pacienteDao.deleteById(id);

	}

	@Override
	public List<Paciente> listar() {
		return pacienteDao.findAll();
	}

	@Override
	public Paciente listarPorId(Integer id) {
		Optional<Paciente> opt = pacienteDao.findById(id);
		return opt.isPresent() ? opt.get() : new Paciente();
	}

	@Override
	public Page<Paciente> listarPageable(Pageable pageable) {
		return pacienteDao.findAll(pageable);
	}

}
