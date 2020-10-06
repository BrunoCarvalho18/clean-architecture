package br.com.escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
	}
	
	@Test
	void naoDeveriaCriarTelefoneComDDDENumerosValidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("15389", "1895"));

		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123"));
	}
	
	@Test
	void deveriaPermitirCriarTelefoneComDDDENumerosValidos() {
		String ddd = "11";
		String numero = "123456789";
		Telefone telefone = new Telefone(ddd,numero);
		assertEquals(ddd,telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
	}

}
