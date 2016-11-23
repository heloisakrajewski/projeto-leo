package br.com.pyrafilms.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.pyrafilms.model.Aluguel;
import br.com.pyrafilms.model.Cartao;

public class AluguelDao extends JpaDaoBase<Aluguel> implements IDao<Aluguel> {

	public Aluguel buscaPorNome(String nome) {
		Query query = em.createNamedQuery("Aluguel.buscaPorNome").setParameter("nome", nome);
		List<Aluguel> alugueis = query.getResultList();
		if (!alugueis.isEmpty())
			return alugueis.get(0);
		return null;
	}
	
	public void remove(String nome) {
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM Aluguel c WHERE c.nome = :nome ").setParameter("nome", nome);
		query.executeUpdate();
		em.getTransaction().commit();
	}
	
	
}
