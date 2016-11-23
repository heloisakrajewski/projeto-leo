package br.com.pyrafilms.model.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.pyrafilms.model.Aluguel;
import br.com.pyrafilms.model.Cartao;

@XmlRootElement
public class Alugueis {

	private List<Aluguel> alugueis = new ArrayList<>();

	public Alugueis() {
	}

	public Alugueis(List<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}

	@XmlTransient
	public List<Aluguel> getAlugueis() {
		return alugueis;
	}

	public void setAlugueis(List<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}
	
	
	public void setLinks (List<Link> links) {
		
	}

}
