package br.com.escola;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import br.com.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				()-> new Email(null));
		assertThrows(IllegalArgumentException.class,
				()-> new Email(""));
		assertThrows(IllegalArgumentException.class,
				()-> new Email("emailinvalido"));
		
	}
	
	@Test
	void deveriaCriarEmailValido() {
		String emailUsuario = "fulano@gmail.com";
		Email email = new Email(emailUsuario);
		assertEquals(emailUsuario ,email.getEndereco());
		
	}

}
