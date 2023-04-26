package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Sistema {

	private String nombreDelSistema;
	private ArrayList<Usuario> listaDeUsuarios;

	public Sistema(String nombreDelSistema) {
		this.nombreDelSistema=nombreDelSistema;
		this.listaDeUsuarios=new ArrayList<>();
		
	}

	public Boolean agregarUsuario(Usuario usu) {
		return this.listaDeUsuarios.add(usu);
	}

	public Boolean evaluarNombre(String string) {
		for (Usuario usuario : listaDeUsuarios) {
			if (usuario.getNombreDelUsuario().toLowerCase().equals(string.toLowerCase())) {
				return false;
			}
		}
		return true;
	}

}
