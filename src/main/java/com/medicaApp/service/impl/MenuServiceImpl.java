package com.medicaapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicaapp.dao.IMenuDAO;
import com.medicaapp.model.Menu;
import com.medicaapp.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService {

	@Autowired
	private IMenuDAO dao;

	@Override
	public Menu registrar(Menu menu) {
		return dao.save(menu);
	}

	@Override
	public Menu modificar(Menu menu) {
		return dao.save(menu);
	}

	@Override
	public void eliminar(Integer idMenu) {
		dao.deleteById(idMenu);
	}

	@Override
	public Menu listarPorId(Integer idMenu) {
		Optional<Menu> opt = dao.findById(idMenu);
		return opt.isPresent() ? opt.get() : new Menu();
	}

	@Override
	public List<Menu> listar() {
		return dao.findAll();
	}

	@Override
	public List<Menu> listarMenuPorUsuario(String nombre) {		
		List<Menu> menus = new ArrayList<>();
		dao.listarMenuPorUsuario(nombre).forEach( x -> {
			Menu m = new Menu();
			m.setIdMenu((Integer.parseInt(String.valueOf(x[0]))));
			m.setIcono(String.valueOf(x[1]));
			m.setNombre(String.valueOf(x[2]));
			m.setUrl(String.valueOf(x[3]));		
	
			menus.add(m);
		});
		return menus;			
	}

}
