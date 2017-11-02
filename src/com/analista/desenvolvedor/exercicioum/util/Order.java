package com.analista.desenvolvedor.exercicioum.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
	
	public static Integer[] orderArray(Integer[] ... arrays) {
		
		Integer[] arrayOrdenado = null;
		
		if(arrays != null){
			List<Integer> listaComElemtosDosArrays = new ArrayList<>();
			
			for(int i = 0; i <= arrays.length-1; i++) {
				listaComElemtosDosArrays.addAll(Arrays.asList(arrays[i]));
			}
			
			int size = listaComElemtosDosArrays.size();
			arrayOrdenado = listaComElemtosDosArrays.toArray(new Integer[size]);
			
			Arrays.sort(arrayOrdenado);
		
		}
		
		return arrayOrdenado;	
	}
	

}
