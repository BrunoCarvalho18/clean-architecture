package br.com.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 707025025951095537L;
	
	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno nao encontrado com CPF: " + cpf.getNumero());
	}

}
