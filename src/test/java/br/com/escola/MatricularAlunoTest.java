package br.com.escola;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.escola.aplicacao.MatriculaAluno;
import br.com.escola.aplicacao.MatricularAlunoDto;
import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.infra.aluno.RepositorioDeAlunoEmMemoria;

class MatricularAlunoTest {
	
	@Test
	void alunoDeveriaSerTestado() {
		//MOCK -> Mockito
		RepositorioDeAlunoEmMemoria repositorio = new RepositorioDeAlunoEmMemoria();
		MatriculaAluno useCase = new MatriculaAluno(repositorio);
		
		MatricularAlunoDto dados = new MatricularAlunoDto(
				"Fulano",
				"123.456.789-00",
				"fulano@email.com");
		
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));
		
		assertEquals("Fulano",encontrado.getNome());
		
	}

}
