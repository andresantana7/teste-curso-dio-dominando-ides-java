package br.com.dio.model;

import java.util.Objects;

public class Gato {
	
	private String nome;
	private String cor;
	private String sexo;
	
	
	public Gato() {
		
	}


	public Gato(String nome, String cor, String sexo) {
		this.nome = nome;
		this.cor = cor;
		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cor, nome, sexo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
	}


	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", sexo=" + sexo + "]";
	}

	
}
