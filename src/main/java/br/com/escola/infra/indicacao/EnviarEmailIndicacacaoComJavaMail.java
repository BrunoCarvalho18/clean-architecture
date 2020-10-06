package br.com.escola.infra.indicacao;

import br.com.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
		
	}

}
