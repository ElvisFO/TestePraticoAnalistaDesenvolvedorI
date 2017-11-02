package com.analista.desenvolvedor.exerciciodois.util;

import java.util.Arrays;

public class Util {

	public static Integer segundoMaiorValor(Integer[] array)
	{
		Integer segundoMaiorValor = null;
		
		if(array != null) {
			Arrays.sort(array);
			int size = array.length;
			
			//Evitando a exception ArrayIndexOutOfBoundsException caso seja passado um array 
			//com somente um elemeto. Nesse caso estou retornando null, pois não existe segundo maior valor
			if(size >= 2)
				segundoMaiorValor = array[size - 2];
		}
		
		return segundoMaiorValor;
	}
}
