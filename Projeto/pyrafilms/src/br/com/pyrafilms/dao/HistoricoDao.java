package br.com.pyrafilms.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.pyrafilms.model.Historico;

public class HistoricoDao extends JpaDaoBase<Historico> implements IDao<Historico> {

	public Historico buscaPorNome(String nome) {
		Query query = em.createNamedQuery("Historico.buscaPorNome").setParameter("nome", nome);
		List<Historico> historicos = query.getResultList();
		if (!historicos.isEmpty())
			return historicos.get(0);
		return null;
	}
	
	public void remove(String nome) {
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM Historico c WHERE c.nome = :nome ").setParameter("nome", nome);
		query.executeUpdate();
		em.getTransaction().commit();
	}
	
	
}
