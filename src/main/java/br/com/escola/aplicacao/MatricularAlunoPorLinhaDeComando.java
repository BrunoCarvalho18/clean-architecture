package br.com.escola.aplicacao;

import br.com.escola.infra.aluno.RepositorioDeAlunoEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatriculaAluno matricular = new MatriculaAluno(new RepositorioDeAlunoEmMemoria()); 
		matricular.executa(
				new MatricularAlunoDto(nome,cpf,email));
		
	}

}
