package br.com.pyrafilms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@NamedQuery(name="Aluguel.buscaPorId", query="SELECT a FROM Aluguel a where a.id = :id ")

@Entity
public class Aluguel implements IBean{

	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Filme filme;
	@Temporal(TemporalType.DATE)
	private Date dataAluguel;
	private int diasAluguel;
	private Boolean situacao;
	
	public Aluguel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluguel(Long id, Usuario usuario, Filme filme, Date dataAluguel,
			int diasAluguel, Boolean situacao) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.filme = filme;
		this.dataAluguel = dataAluguel;
		this.diasAluguel = diasAluguel;
		this.situacao = situacao;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Date getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(Date dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public int getDiasAluguel() {
		return diasAluguel;
	}
	public void setDiasAluguel(int diasAluguel) {
		this.diasAluguel = diasAluguel;
	}
	public Boolean getSituacao() {
		return situacao;
	}
	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}
	
}
