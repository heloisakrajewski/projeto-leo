package br.com.pyrafilms.dao;

public class JpaDaoFactory {

	public static JpaDaoFactory instance = new JpaDaoFactory();
	
	private CartaoDao cartaoDao;
	private UsuarioDao usuarioDao;

	private JpaDaoFactory() {}
		
	public static JpaDaoFactory getInstance(){
		return instance;
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

}
