package br.com.pyrafilms.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.pyrafilms.model.Usuario;

public class UsuarioDao extends JpaDaoBase<Usuario> implements IDao<Usuario> {

	public Usuario buscaPorId(Long id) {
		Query query = em.createNamedQuery("Usuario.buscaPorId").setParameter("id", id);
		List<Usuario> usuarios = query.getResultList();
		if (!usuarios.isEmpty())
			return usuarios.get(0);
		return null;
	}
	
	public void remove(Long id) {
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM Usuario c WHERE c.id = :id ").setParameter("id", id);
		query.executeUpdate();
		em.getTransaction().commit();
	}
	
	
	
}
