package br.com.escola.aplicacao;


import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;

public class MatriculaAluno {

	private final RepositorioDeAlunos repositorio;

	public MatriculaAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
    }
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}

}
