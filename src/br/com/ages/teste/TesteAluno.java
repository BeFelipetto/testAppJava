package br.com.ages.teste;

import br.com.ages.negocio.Aluno;

public class TesteAluno {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Carlos");
		aluno.setPeso(1);

		
		Aluno aluno1 = new Aluno();
		validaAluno(aluno);
	}

	private static void validaAluno(Aluno aluno) {
		if (aluno.getNome() == null) {
			System.out.println("Aluno não inicializado");
		} else {
			System.out.println(aluno);

		}
	}
	
	


}
