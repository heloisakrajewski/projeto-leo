package br.com.pyrafilms.model.rest;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.pyrafilms.model.Genero;

@XmlRootElement
public class Generos {

	private List<Genero> generos = new ArrayList<>();

	public Generos() {
	}

	public Generos(List<Genero> generos) {
		this.generos = generos;
	}

	@XmlTransient
	public List<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}
	
	
	public void setLinks (List<Link> links) {
		
	}

}
