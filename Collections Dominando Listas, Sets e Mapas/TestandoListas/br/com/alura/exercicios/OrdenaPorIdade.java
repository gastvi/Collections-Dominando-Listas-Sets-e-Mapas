package br.com.alura.exercicios;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>{

//	@Override
//	public int compare(Funcionario o1, Funcionario o2) {
//		
//		boolean teste = o1.getIdade() > o2.getIdade();
//		if(teste == true) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
	
	@Override
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }

}
