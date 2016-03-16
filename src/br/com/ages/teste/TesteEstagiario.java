package br.com.ages.teste;

import br.com.ages.negocio.Estagiario;

public class TesteEstagiario {

	public static void main(String[] args) {
		Estagiario estagiario = new Estagiario();
		estagiario.setNome("Sendo Felipetto");
		estagiario.setDataInicio(null);
		
		validaEstagiario(estagiario);

		Estagiario estagiario1 = new Estagiario();
		validaEstagiario(estagiario1);
	}

	private static void validaEstagiario(Estagiario estagiario) {
		if (estagiario.getNome() == null) {
			System.out.println("estagiario não inicializado");
		} else {
			System.out.println(estagiario);

		}
	}

}
