package br.com.pyrafilms.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.pyrafilms.model.Filme;

public class FilmeDao extends JpaDaoBase<Filme> implements IDao<Filme> {

	public Filme buscaPorNome(String nome) {
		Query query = em.createNamedQuery("Filme.buscaPorNome").setParameter("nome", nome);
		List<Filme> filmes = query.getResultList();
		if (!filmes.isEmpty())
			return filmes.get(0);
		return null;
	}
	
	public void remove(String nome) {
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM Filme c WHERE c.nome = :nome ").setParameter("nome", nome);
		query.executeUpdate();
		em.getTransaction().commit();
	}
	
	
}
