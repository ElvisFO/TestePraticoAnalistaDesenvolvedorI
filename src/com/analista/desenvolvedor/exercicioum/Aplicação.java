package com.analista.desenvolvedor.exercicioum;

import com.analista.desenvolvedor.exercicioum.util.Order;

public class Aplicação {

	public static void main(String[] args) {
		
		/*Integer[] arrayUm = {10,50,3,35,22};
		Integer[] arrayDois = {7,11,9};
		Integer[] arrayTres = {1,2,4, 7};
		
		Integer[] arrayOrdenado = Order.orderArray(arrayUm, arrayDois, arrayTres);*/
		
		Integer[] arrayUm = {1, 2, 4, 5, 7};
		Integer[] arrayDois = {2, 3, 5, 6};
		
		Integer[] arrayOrdenado = Order.orderArray(arrayUm, arrayDois);
		
			
		//exibir os elementos
		for(Integer item : arrayOrdenado)
		{
			System.out.print(item);
		}

	}

}
