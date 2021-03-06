package br.com.pyrafilms.dao;

public class JpaDaoFactory {

	public static JpaDaoFactory instance = new JpaDaoFactory();
	
	private AluguelDao aluguelDao;
	private CartaoDao cartaoDao;
	private UsuarioDao usuarioDao;
	private FilmeDao filmeDao;
	private GeneroDao generoDao;

	private JpaDaoFactory() {}
		
	public static JpaDaoFactory getInstance(){
		return instance;
	}
	
	public AluguelDao getAluguelDao(){
		if(this.aluguelDao == null)
			this.aluguelDao = new AluguelDao();
		return this.aluguelDao;
	}
	
	public CartaoDao getCartaoDao(){
		if(this.cartaoDao == null)
			this.cartaoDao = new CartaoDao();
		return this.cartaoDao;
	}
	
	public UsuarioDao getUsuarioDao(){
		if(this.usuarioDao == null)
			this.usuarioDao = new UsuarioDao();
		return this.usuarioDao;
	}

	public FilmeDao getFilmeDao(){
		if(this.filmeDao == null)
			this.filmeDao = new FilmeDao();
		return this.filmeDao;
	}
	
	public GeneroDao getGeneroDao(){
		if(this.generoDao == null)
			this.generoDao = new GeneroDao();
		return this.generoDao;
	}
	
}
