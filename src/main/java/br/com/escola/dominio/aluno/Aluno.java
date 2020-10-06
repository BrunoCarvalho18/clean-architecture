package br.com.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private CPF cpf;
	private String nome;
	private Email email;
	
	private String senha;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	private List<Telefone> telefones = new ArrayList<>();
	
	public void adicionarTelefone(String ddd,String numero) {
		this.telefones.add(new Telefone(ddd,numero));
	}
	
	public String getCpf() {
		return cpf.getNumero();
	}

	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public void setEmail(Email email) {
		this.email = email;
	}
	
	public List<Telefone> getTelefones(){
		return telefones;
	}
	
	public static void main(String[] args) {
		Aluno a = new Aluno(new CPF("123"),
				"Fulano da Silva", 
				new Email("email"));
	}

}
