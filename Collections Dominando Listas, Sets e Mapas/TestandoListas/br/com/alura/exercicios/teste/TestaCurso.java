package br.com.alura.exercicios.teste;

import java.util.List;

import br.com.alura.exercicios.Aulas;
import br.com.alura.exercicios.Curso;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "gabriel");

		List<Aulas> aulas = javaColecoes.getAula();

		System.out.println(aulas);

		javaColecoes.adiciona(new Aulas("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aulas("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aulas("Modelando com colecoes", 24));

		System.out.println(aulas);

	}

}
