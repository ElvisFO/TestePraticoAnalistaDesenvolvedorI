package com.analista.desenvolvedor.exerciciodois;

import com.analista.desenvolvedor.exerciciodois.util.Util;

public class Aplicacao {

	public static void main(String[] args) {
		
		Integer[] array = {1, 3, 4, 2, 5 };
		
		Integer valorRetornado = Util.segundoMaiorValor(array);
		
		System.out.println(valorRetornado);

	}

}
