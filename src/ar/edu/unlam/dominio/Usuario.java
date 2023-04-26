package ar.edu.unlam.dominio;

public class Usuario {

	private String nombreDelUsuario;
	private EstadoDeLaCuenta estadoDeLaCuenta;
	private Integer edadDelUsuario;
	private String contraseniaDelUsuario;

	public Usuario(String nombreDelUsuario, EstadoDeLaCuenta estadoDeLaCuenta, Integer edadDelUsuario,
			String contraseniaDelUsuario) {
		this.nombreDelUsuario=nombreDelUsuario;
		this.estadoDeLaCuenta=estadoDeLaCuenta;
		this.edadDelUsuario=edadDelUsuario;
		this.contraseniaDelUsuario=contraseniaDelUsuario;
	}

	public String getNombreDelUsuario() {
		return nombreDelUsuario;
	}

	public void setNombreDelUsuario(String nombreDelUsuario) {
		this.nombreDelUsuario = nombreDelUsuario;
	}

	public EstadoDeLaCuenta getEstadoDeLaCuenta() {
		return estadoDeLaCuenta;
	}

	public void setEstadoDeLaCuenta(EstadoDeLaCuenta estadoDeLaCuenta) {
		this.estadoDeLaCuenta = estadoDeLaCuenta;
	}

	public Integer getEdadDelUsuario() {
		return edadDelUsuario;
	}

	public void setEdadDelUsuario(Integer edadDelUsuario) {
		this.edadDelUsuario = edadDelUsuario;
	}

	public String getContraseniaDelUsuario() {
		return contraseniaDelUsuario;
	}

	public void setContraseniaDelUsuario(String contraseniaDelUsuario) {
		this.contraseniaDelUsuario = contraseniaDelUsuario;
	}

}
