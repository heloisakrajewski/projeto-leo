package br.com.pyrafilms.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.pyrafilms.model.Cartao;
import br.com.pyrafilms.model.Usuario;

public class CartaoDao extends JpaDaoBase<Cartao> implements IDao<Cartao> {

	public Usuario buscaPorId(Long id) {
		Query query = em.createNamedQuery("Usuario.buscaPorId").setParameter("id", id);
		List<Usuario> usuarios = query.getResultList();
		if (!usuarios.isEmpty())
			return usuarios.get(0);
		return null;
	}
	
	public void remove(Long id) {
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM Cartao c WHERE c.id = :id ").setParameter("id", id);
		query.executeUpdate();
		em.getTransaction().commit();
	}
	
	
}
