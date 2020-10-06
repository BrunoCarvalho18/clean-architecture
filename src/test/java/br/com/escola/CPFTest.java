package br.com.escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				()-> new CPF(null));
		assertThrows(IllegalArgumentException.class,
				()-> new CPF(""));
		assertThrows(IllegalArgumentException.class,
				()-> new CPF("1234567890235"));
	}
	
	@Test
	void deveriaPermitirCriarCPFValidos() {
		String numero = "254.833.250-01";
		CPF cpf = new CPF(numero);
		assertEquals(numero,cpf.getNumero());
		
	}

}
