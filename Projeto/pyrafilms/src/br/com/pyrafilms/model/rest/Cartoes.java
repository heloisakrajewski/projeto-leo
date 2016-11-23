package br.com.pyrafilms.model.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.pyrafilms.model.Cartao;

@XmlRootElement
public class Cartoes {

	private List<Cartao> cartoes = new ArrayList<>();

	public Cartoes() {
	}

	public Cartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	@XmlTransient
	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	
	public void setLinks (List<Link> links) {
		
	}

}
