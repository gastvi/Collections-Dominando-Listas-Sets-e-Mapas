package br.com.alura.exercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aulas> aula = new LinkedList<>();
	private Set<Alunos> aluno = new HashSet<>();
	private Map<Integer, Alunos> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		if(nome == null) {
		 throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aulas> getAula() {
        return Collections.unmodifiableList(aula);
	}
	
	public Set<Alunos> getAlunos() {
	    return Collections.unmodifiableSet(aluno);
	}

	public void adiciona(Aulas aula) {
		this.aula.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aulas aulas : aula) {
			int tempoAula = aulas.getTempo();
			tempoTotal += tempoAula;
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + ", tempo total: " + getTempoTotal() + 
				", aulas: " + this.aula + "tento os seguintes alunos: " + this.aluno ;
	}
	
	public void matricula(Alunos aluno){
	    this.aluno.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}
	
	public Alunos buscaMatriculado(int numeroMatricula) {
		return this.matriculaParaAluno.get(numeroMatricula);

	}
	
	public Boolean estaMatriculado(Alunos aluno) {
		return this.aluno.contains(aluno);

	}
	
	@Override
	public boolean equals(Object obj) {
	Alunos outroAluno = (Alunos) obj;
	return this.nome.equals(outroAluno.getNome());
	}
	
	@Override
	public int hashCode() {
	return this.nome.hashCode();
	}

}
