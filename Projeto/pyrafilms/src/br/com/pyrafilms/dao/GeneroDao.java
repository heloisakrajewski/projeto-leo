package br.com.pyrafilms.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.pyrafilms.model.Cartao;
import br.com.pyrafilms.model.Genero;

public class GeneroDao extends JpaDaoBase<Genero> implements IDao<Genero> {

	public Genero buscaPorNome(String nome) {
		Query query = em.createNamedQuery("Cartao.buscaPorNome").setParameter("nome", nome);
		List<Genero> generos = query.getResultList();
		if (!generos.isEmpty())
			return generos.get(0);
		return null;
	}
	
	public void remove(String nome) {
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM Genero c WHERE c.nome = :nome ").setParameter("nome", nome);
		query.executeUpdate();
		em.getTransaction().commit();
	}
	
	
}
