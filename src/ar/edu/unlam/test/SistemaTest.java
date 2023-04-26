package ar.edu.unlam.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.EstadoDeLaCuenta;
import ar.edu.unlam.dominio.Sistema;
import ar.edu.unlam.dominio.Usuario;

public class SistemaTest {

	@Test
	public void validarAgregarUsuario() {
		
		Sistema sis=new Sistema("UNLAM-2023");
		
		String nombreDelUsuario="Alfredo";
		EstadoDeLaCuenta estadoDeLaCuenta=EstadoDeLaCuenta.NO_LOGUEADO;
		Integer edadDelUsuario=0;
		String contraseniaDelUsuario="ContraseñA123";
		

		Usuario usu=new Usuario(nombreDelUsuario,estadoDeLaCuenta,edadDelUsuario,contraseniaDelUsuario);
		Boolean evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		assertTrue(evaluarAgregarUsuario);
		
	}

	@Test
	public void validarNombreUnicoDeUsuario() {
		
	//_LOS USUARIOS DEBEN TENER UN NOMBRE UNICO. (YA SEA EN MAYUS O EN MINUS)
		Sistema sis=new Sistema("UNLAM-2023");
		
		Boolean nombrePermitido=sis.evaluarNombre("nombre uno");
		assertTrue(nombrePermitido);
		Usuario usu=new Usuario("nombre uno",EstadoDeLaCuenta.LOGUEADO,16,"contraseña123");
		Boolean evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		
		
		nombrePermitido=sis.evaluarNombre("nombre dos");
		assertTrue(nombrePermitido);
		usu=new Usuario("nombre dos",EstadoDeLaCuenta.LOGUEADO,16,"contraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		
		
		nombrePermitido=sis.evaluarNombre("nombre uno");
		assertFalse(nombrePermitido);
		
		nombrePermitido=sis.evaluarNombre("NOMBRE DOS");
		assertFalse(nombrePermitido);
		
		nombrePermitido=sis.evaluarNombre("nombre tres");
		assertTrue(nombrePermitido);
		
		
	}
	
	
	public void validarContraseniaDelUsuario() {
		
		//_LA CONTRASEÑA DEL USUARIO DEBE CONTENER COMO MÍNIMO: 2 MINUSCULAS, 2 MAYUSCULAS Y 2 NÚMEROS.
		Metodos metodo=new Metodos();
		String contraseniaCorrecta="ContraseñA123";
		
		
		Boolean evaluarContrasenia=metodo.evaluarContra(contraseniaCorrecta);
		
		
		
		
	}
	
	
}
