package colecciones;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Colecciones {
	public static void main(String args[]) {
		
		
		/*
		 * La coleccion SET no puede tener elementos duplicados
		 * solo tiene los metodos heredados de collection
		 * existen diferentes tipos de implementacion
		 * 
		 * hashset: esta implementacion almacena los elementos en una tabla
		 * hash: es la que mejor rentimiento tiene pero no los muestra en orden
		 * TreeSet: ordena de mayor a menor los numeros y las letras en orden alfabetico pero es lento
		 * linkedHasSet
		 * */
		
		//Es como si crearas un arreglo, lo nombras
		Set<String> frutas= new HashSet();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platamp");
		frutas.add("Mango");
		
		for(String f: frutas) {
			System.out.println(f);
		}
		
		List<String> frutas2= new ArrayList<String>();
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		frutas2.add("Guayaba");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Carambola");
		frutas2.add("Maracuya");
		frutas2.add("Platamp");
		frutas2.add("Mango");
		
		for(String f: frutas2) {
			System.out.println(f);
		}
		
		int pera= frutas2.indexOf("Pera");
		System.out.println(pera);
		System.out.println(frutas2.get(pera));
		
		
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(456);
		agenda.add(789);
		
		for(Integer a:agenda) {
			System.out.println(a);
		}
		
		
		List<String> animales = new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		
		
		animales.add("Conejo");
		
		
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
		
		for(String a:animales) {
			System.out.println(a);
		}
		
		
	}

}
