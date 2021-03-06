package com.medicaapp.dto;

import org.springframework.hateoas.ResourceSupport;

import com.medicaapp.model.Medico;
import com.medicaapp.model.Paciente;

//resource support para usar hipermedia
public class ConsultaDto extends ResourceSupport {

	private int idConsulta;
	private Medico medico;
	private Paciente pac;
	
	
	public int getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPac() {
		return pac;
	}
	public void setPac(Paciente pac) {
		this.pac = pac;
	}
	
	
	
}
