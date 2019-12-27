package com.medicaApp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicaApp.dao.IMedicoDao;
import com.medicaApp.model.Medico;
import com.medicaApp.service.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService{


	@Autowired
	IMedicoDao medicoDao;

	@Override
	public Medico registrar(Medico t) {
		return medicoDao.save(t);
	}

	@Override
	public Medico modificar(Medico t) {
		return medicoDao.save(t);
	}

	@Override
	public void eliminar(Integer id) {
		medicoDao.deleteById(id);

	}

	@Override
	public List<Medico> listar() {
		return medicoDao.findAll();
	}

	@Override
	public Medico listarPorId(Integer id) {
		Optional<Medico> opt = medicoDao.findById(id);
		return opt.isPresent() ? opt.get() : new Medico();
				
	}

}
