package br.com.alura.exercicios.teste;

import br.com.alura.exercicios.Alunos;
import br.com.alura.exercicios.Aulas;
import br.com.alura.exercicios.Curso;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
				
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aulas("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aulas("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aulas("Modelando com coleções", 24));
        
        Alunos a1 = new Alunos("Rodrigo Turini", 34672);
        Alunos a2 = new Alunos("Guilherme Silveira", 5617);
        Alunos a3 = new Alunos("Mauricio Aniche", 17645);
        Alunos a4 = new Alunos("Mauricio2 Aniche", 176415);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);        
        
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
        
        System.out.println(javaColecoes);
        
        System.out.println("o aluno" + a1 + " está matriculado");
        System.out.println(javaColecoes.estaMatriculado(a1));
        
        Alunos turini = new Alunos("Rodrigo Turini", 34672);
        System.out.println("esse turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));
        
        System.out.println("o a1 é equals no turini");
        System.out.println(a1.equals(turini));
        
        //obrigatoriamente o seguinte é true;

        System.out.println(a1.hashCode() == turini.hashCode());

	}

}
