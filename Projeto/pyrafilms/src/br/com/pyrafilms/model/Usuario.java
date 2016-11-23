package br.com.pyrafilms.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@NamedQuery(name="Usuario.buscaPorId", query="SELECT u FROM Usuario u where u.id = :id ") 

@Entity
public class Usuario implements IBean {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	@OneToMany(mappedBy="usuario",orphanRemoval=true)
	@XmlTransient
	private Collection<Cartao> cartoes;
	
	public Usuario() {
		super();
	}
	
	public Usuario(Long id, String nome, String cpf, String email,
			String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Collection<Cartao> getCartoes() {
		return cartoes;
	}

	public void setCartoes(Collection<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
}