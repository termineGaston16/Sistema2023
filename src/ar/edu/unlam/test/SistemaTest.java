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
	
	@Test
	public void validarContraseniaDelUsuario() {
		
		//_LA CONTRASEÑA DEL USUARIO DEBE CONTENER COMO MÍNIMO: 2 MINUSCULAS, 2 MAYUSCULAS Y 2 NÚMEROS.
		Metodos metodo=new Metodos();
	
		
		boolean evaluarContrasenia=metodo.evaluarContra("a");
		assertFalse(evaluarContrasenia);
		
		evaluarContrasenia=metodo.evaluarContra("Contraseña123");
		assertFalse(evaluarContrasenia);
		
		evaluarContrasenia=metodo.evaluarContra("CONTRASEÑA123");
		assertFalse(evaluarContrasenia);
		
		evaluarContrasenia=metodo.evaluarContra("ContraseñA123");
		assertTrue(evaluarContrasenia);
		
		evaluarContrasenia=metodo.evaluarContra("Contraseña1");
		assertFalse(evaluarContrasenia);
		
		evaluarContrasenia=metodo.evaluarContra("COntraseña12");
		assertTrue(evaluarContrasenia);
		
		evaluarContrasenia=metodo.evaluarContra("CONTRASEña12");
		assertTrue(evaluarContrasenia);
		
		
	}
	
	@Test
	public void validarCantidadDeUsuariosLogueados(){
		
		Sistema sis=new Sistema("UNLAM-2023");
		boolean evaluarAgregarUsuario=false;
		Integer cantidadDeUsuariosLogueados=0;
		
		
		
		Usuario usu=new Usuario("Nombre 0",EstadoDeLaCuenta.LOGUEADO,28,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 1",EstadoDeLaCuenta.LOGUEADO,20,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 2",EstadoDeLaCuenta.BLOQUEADO,45,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 3",EstadoDeLaCuenta.NO_LOGUEADO,78,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 4",EstadoDeLaCuenta.LOGUEADO,12,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 5",EstadoDeLaCuenta.LOGUEADO,36,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		
		
		cantidadDeUsuariosLogueados=sis.calcularLaCantidadDeUsuariosLogueados();
		assertEquals((Integer) 4, cantidadDeUsuariosLogueados);
		
		
	}

	@Test
	public void validarCantidadDeUsuariosBloqueados(){
		
		Sistema sis=new Sistema("UNLAM-2023");
		boolean evaluarAgregarUsuario=false;
		Integer cantidadDeUsuariosBloqueados=0;
		
		
		
		Usuario usu=new Usuario("Nombre 0",EstadoDeLaCuenta.BLOQUEADO,28,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 1",EstadoDeLaCuenta.LOGUEADO,20,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 2",EstadoDeLaCuenta.BLOQUEADO,45,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 3",EstadoDeLaCuenta.NO_LOGUEADO,78,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 4",EstadoDeLaCuenta.NO_LOGUEADO,12,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 5",EstadoDeLaCuenta.LOGUEADO,36,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		
		
		cantidadDeUsuariosBloqueados=sis.calcularLaCantidadDeUsuariosBloqueados();
		assertEquals((Integer) 2, cantidadDeUsuariosBloqueados);
		
		
	}
	
	@Test
	public void validarPorcentajeDeUsuariosLogueados() {
		
		Sistema sis=new Sistema("UNLAM-2023");
		boolean evaluarAgregarUsuario=false;
		Double porcentajeDeUsuariosLogueados=0.0;
		
		
		Usuario usu=new Usuario("Nombre 0",EstadoDeLaCuenta.LOGUEADO,47,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 1",EstadoDeLaCuenta.BLOQUEADO,25,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 2",EstadoDeLaCuenta.LOGUEADO,15,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 3",EstadoDeLaCuenta.LOGUEADO,12,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 4",EstadoDeLaCuenta.LOGUEADO,63,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		usu=new Usuario("Nombre 5",EstadoDeLaCuenta.NO_LOGUEADO,77,"COntraseña123");
		evaluarAgregarUsuario=sis.agregarUsuario(usu);
		
		
		
		Integer cantidadDeUsuariosLogueados=sis.calcularLaCantidadDeUsuariosLogueados();
		
		porcentajeDeUsuariosLogueados=sis.calcularElPorcentajeDeUsuariosLogueados(cantidadDeUsuariosLogueados);
		assertEquals(0.24,porcentajeDeUsuariosLogueados,0.01);
			
			
			
	
		
		
	}
	
}
