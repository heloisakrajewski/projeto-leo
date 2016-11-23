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

@NamedQuery(name="Cartao.buscaPorNome", query="SELECT c FROM Cartao c where c.nome = :nome ") 
@Entity
public class Cartao implements IBean {

	@Id
	@GeneratedValue
	private Long id;
	private String numero;
	@Temporal(TemporalType.DATE)
	private Date validade;
	private String nome;
	private String cpf;
	@Temporal(TemporalType.DATE)
	private Date dataNascmento;
	@ManyToOne
	private Usuario usuario;
	
	public Cartao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cartao(Long id, String numero, Date validade, String nome,
			String cpf, Date dataNascmento, Usuario usuario) {
		super();
		this.id = id;
		this.numero = numero;
		this.validade = validade;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascmento = dataNascmento;
		this.usuario = usuario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascmento() {
		return dataNascmento;
	}
	public void setDataNascmento(Date dataNascmento) {
		this.dataNascmento = dataNascmento;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

}
