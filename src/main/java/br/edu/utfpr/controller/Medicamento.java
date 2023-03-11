package br.edu.utfpr.controller;

public class Medicamento {
	
	static int idClass = 0;
	private int id;
	private String nome;
	private String tipo;
	
	
	public Medicamento(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		idClass += 1;
		this.setId(idClass);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
