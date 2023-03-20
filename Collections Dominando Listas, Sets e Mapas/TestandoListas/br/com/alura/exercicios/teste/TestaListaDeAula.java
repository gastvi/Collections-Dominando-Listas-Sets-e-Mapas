package br.com.alura.exercicios.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.exercicios.Aulas;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aulas a1 = new Aulas("Revistando as ArrayLists", 21);
		Aulas a2 = new Aulas("Listas de objetos", 20);
		Aulas a3 = new Aulas("Relacionamento de listas e objetos", 15);

		ArrayList<Aulas> aulas = new ArrayList<>();

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
		
		Collections.sort(aulas);//necessario o compareTo na classe aulas pra funcionar essa parte
		
		System.out.println(aulas);

		aulas.sort(Comparator.comparing(Aulas::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aulas::getTitulo));
		
		System.out.println(aulas);



	}

}
