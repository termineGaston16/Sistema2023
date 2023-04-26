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

	public Integer calcularLaCantidadDeUsuariosLogueados() {
		Integer usuarioLo=0;
					
		for (Usuario usuario : listaDeUsuarios) {
			if (usuario.getEstadoDeLaCuenta().equals(EstadoDeLaCuenta.LOGUEADO)) {
				usuarioLo++;
			}
		}
		
		return usuarioLo;
	}

	public Integer calcularLaCantidadDeUsuariosBloqueados() {
		Integer usuarioBlo=0;
		
		for (Usuario usuario : listaDeUsuarios) {
			if (usuario.getEstadoDeLaCuenta().equals(EstadoDeLaCuenta.BLOQUEADO)) {
				usuarioBlo++;
			}
		}
		
		return usuarioBlo;
	}

	public Double calcularElPorcentajeDeUsuariosLogueados(Integer cantidadDeUsuariosLogueados2) {
		double porcentaje=0.0;
		
		porcentaje=((cantidadDeUsuariosLogueados2*this.listaDeUsuarios.size())/10);
		
		return porcentaje;
	}

}
