package br.com.pyrafilms.model.rest;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import br.com.pyrafilms.model.Filme;

@XmlRootElement
public class Filmes {

	private List<Filme> filmes = new ArrayList<>();

	public Filmes() {
	}

	public Filmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	@XmlTransient
	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	
	@XmlElement(name="link")
	public List<Link> getLinks() {
		List<Link> links = new ArrayList<>();
		for (Filme filme : getFilmes()) {
			
			Link link = Link.fromPath("filmes/{nome}")
					.rel("usuario")
					.title(filme.getNome())
					.build(filme.getNome());
			
			
			links.add(link);
		}
		return links;
	}
	
	public void setLinks (List<Link> links) {
		
	}

}
