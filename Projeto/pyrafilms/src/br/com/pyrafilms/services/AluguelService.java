package br.com.pyrafilms.services;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;

import br.com.pyrafilms.dao.AluguelDao;
import br.com.pyrafilms.dao.CartaoDao;
import br.com.pyrafilms.dao.FilmeDao;
import br.com.pyrafilms.dao.JpaDaoFactory;
import br.com.pyrafilms.dao.UsuarioDao;
import br.com.pyrafilms.model.Aluguel;
import br.com.pyrafilms.model.Cartao;
import br.com.pyrafilms.model.Filme;
import br.com.pyrafilms.model.Usuario;
import br.com.pyrafilms.model.UsuarioJaExisteException;


@Path("/alugueis")
public class AluguelService {

	private AluguelDao aluguelDao = JpaDaoFactory.getInstance().getAluguelDao();

	@POST
	public Response criarAluguel(Aluguel aluguel) {

		try {
			aluguelDao.salva(aluguel);
		} catch (UsuarioJaExisteException e) {
			throw new WebApplicationException(Status.CONFLICT);
		}

		URI uri = UriBuilder.fromPath("alugueis/{id}").build(
				aluguel.getId());

		return Response.created(uri).entity(aluguel).build();
	}	
	
	@GET
	@Path("{id}")
	public Aluguel encontreAluguel(@PathParam("id") Long id) {
		Aluguel aluguel = aluguelDao.buscaPorId(id);
		if (aluguel != null)
			return aluguel;
		
		throw new WebApplicationException(Status.NOT_FOUND);

	}
	
	@PUT
	public void devolverFilme(Aluguel aluguel) {
		Aluguel al = encontreAluguel(aluguel.getId());
		al.setSituacao(false);
		aluguelDao.atualiza(al);
	}
	
}
