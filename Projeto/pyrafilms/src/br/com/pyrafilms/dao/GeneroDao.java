package br.com.pyrafilms.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.pyrafilms.model.Cartao;
import br.com.pyrafilms.model.Filme;
import br.com.pyrafilms.model.Genero;

public class GeneroDao extends JpaDaoBase<Genero> implements IDao<Genero> {

	public Genero buscaPorId(Long id) {
		Query query = em.createNamedQuery("Genero.buscaPorId").setParameter("id", id);
		List<Genero> generos = query.getResultList();
		if (!generos.isEmpty())
			return generos.get(0);
		return null;
	}
	
	public void remove(Long id) {
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM Genero g WHERE g.id = :id ").setParameter("id", id);
		query.executeUpdate();
		em.getTransaction().commit();
	}
	
	
}
