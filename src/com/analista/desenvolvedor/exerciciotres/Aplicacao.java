package com.analista.desenvolvedor.exerciciotres;

import com.analista.desenvolvedor.exerciciotres.util.Util;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		String numeroDigitados = "33 8 88 777 66 0 9 33 22 0 33 0 7777 666 333 8 9 2 777 33 0 7777 666 555 88 8 444 666 66";
		
		String frase = Util.fraseDigitada(numeroDigitados);
		System.out.println(frase);
	}

}
