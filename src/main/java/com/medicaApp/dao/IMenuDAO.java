package com.medicaApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medicaApp.model.Menu;

public interface IMenuDAO extends JpaRepository<Menu, Integer>{

	@Query(value="select m.* from menu_rol mr "
			+ "inner join usuario_rol ur on ur.id_rol = mr.id_rol "
			+ "inner join menu m on m.id_menu = mr.id_menu "
			+ "inner join usuario u on u.id_usuario = ur.id_usuario "
			+ "where u.nombre = :nombre", nativeQuery = true)
	List<Object[]> listarMenuPorUsuario(@Param("nombre") String nombre);
	
	//0 | [ 1, 'search', 'buscar', '/buscar']
	//1 | [ 2, 'register', 'registrar', '/consulta']
}
