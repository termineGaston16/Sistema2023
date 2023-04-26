package ar.edu.unlam.test;

public class Metodos {

	public Boolean evaluarContra(String contraseniaCorrecta) {
		char[] mayusculas= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] minusculas= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] numeros= {'0','1','2','3','4','5','6','7','8','9'};		
		
		int cantidadDeMayusculas=0;
		int cantidadDeMinusculas=0;
		int cantidadDeNumeros=0;
		
		for (int i = 0; i < contraseniaCorrecta.length(); i++) {
			for (int j = 0; j < mayusculas.length; j++) {
				if (contraseniaCorrecta.charAt(i)==mayusculas[j]) {
					cantidadDeMayusculas++;
				}
			}
		}
		
		for (int i = 0; i < contraseniaCorrecta.length(); i++) {
			for (int j = 0; j < minusculas.length; j++) {
				if (contraseniaCorrecta.charAt(i)==minusculas[j]) {
					cantidadDeMinusculas++;
				}
			}
		}
		
		for (int i = 0; i < contraseniaCorrecta.length(); i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (contraseniaCorrecta.charAt(i)==numeros[j]) {
					cantidadDeNumeros++;
				}
			}
		}
		
		return (cantidadDeMayusculas>=2&&cantidadDeMinusculas>=2&&cantidadDeNumeros>=2)?true:false;
			

	}

}
