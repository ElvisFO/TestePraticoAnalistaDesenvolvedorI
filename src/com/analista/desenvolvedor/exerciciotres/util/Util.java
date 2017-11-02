package com.analista.desenvolvedor.exerciciotres.util;

import java.util.HashMap;
import java.util.Map;

public class Util {

	public static String fraseDigitada(String numeros) {
		String frase = "";
		Map<Integer, Character> baseComLetras = sequenciaDeCaracteres();
		String[] numeroDigitados = numeros.split(" ");

		for (int i = 0; i <= numeroDigitados.length - 1; i++) {

			Integer key = Integer.parseInt(numeroDigitados[i]);

			Character letra = baseComLetras.get(key);
			frase += letra;
		}

		return frase;
	}

	private static Map<Integer, Character> sequenciaDeCaracteres() {

		Map<Integer, Character> sequenciaChaveValor = new HashMap<>();
		sequenciaChaveValor.put(0, ' ');
		sequenciaChaveValor.put(2, 'A');
		sequenciaChaveValor.put(22, 'B');
		sequenciaChaveValor.put(222, 'C');
		sequenciaChaveValor.put(3, 'D');
		sequenciaChaveValor.put(33, 'E');
		sequenciaChaveValor.put(333, 'F');
		sequenciaChaveValor.put(4, 'G');
		sequenciaChaveValor.put(44, 'H');
		sequenciaChaveValor.put(444, 'I');
		sequenciaChaveValor.put(5, 'J');
		sequenciaChaveValor.put(55, 'K');
		sequenciaChaveValor.put(555, 'L');
		sequenciaChaveValor.put(6, 'M');
		sequenciaChaveValor.put(66, 'N');
		sequenciaChaveValor.put(666, 'O');
		sequenciaChaveValor.put(7, 'P');
		sequenciaChaveValor.put(77, 'Q');
		sequenciaChaveValor.put(777, 'R');
		sequenciaChaveValor.put(7777, 'S');
		sequenciaChaveValor.put(8, 'T');
		sequenciaChaveValor.put(88, 'U');
		sequenciaChaveValor.put(888, 'V');
		sequenciaChaveValor.put(9, 'W');
		sequenciaChaveValor.put(99, 'X');
		sequenciaChaveValor.put(999, 'Y');
		sequenciaChaveValor.put(9999, 'Z');

		return sequenciaChaveValor;
	}

}
