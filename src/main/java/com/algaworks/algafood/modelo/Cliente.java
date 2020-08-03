package com.algaworks.algafood.modelo;

public class Cliente {
	
	private String nome;
	private String email;
	private String telefone;
	private boolean ativo = false;
	
	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public void ativar() {
		this.ativo = true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
