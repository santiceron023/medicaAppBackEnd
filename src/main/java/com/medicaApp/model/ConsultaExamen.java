package com.medicaApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ConsultaExamenPk.class)
public class ConsultaExamen {

	
	//llave compuesta y primaria,se recomienda usar otra clase qu define los ids
	@Id
	private Consulta consulta;
	@Id
	private Examen examen;
	
	
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
}
