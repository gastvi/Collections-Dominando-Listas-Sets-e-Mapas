package br.com.alura.exercicios.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		
		String aula1= "ciência";
		String aula2= "matemática";
		String aula3= "fisíca";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//aulas.remove(1);
		
		System.out.println(aulas);
		
        System.out.println("O primeiro curso da lista eh o: "+ aulas.get(0));

		
		for (String aula : aulas) {
			System.out.println("aula: "+ aula);
		}
		
        System.out.println("colocando a lista em ordem alfabetica");

        Collections.sort(aulas);
        
		aulas.forEach(aula -> {
			System.out.println("aula: "+ aula);
		});
	}
}
