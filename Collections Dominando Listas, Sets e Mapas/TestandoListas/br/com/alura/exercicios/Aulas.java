package br.com.alura.exercicios;

public class Aulas implements Comparable<Aulas>{

	private String titulo;
	private int tempo;

	public Aulas(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}
	
	@Override
    public int compareTo(Aulas outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }
	
	public int getTempo() {
		return tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	

}
