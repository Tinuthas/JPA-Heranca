package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="T_MAMIFERO")
@PrimaryKeyJoinColumn(name="cd_animal")
public class Mamifero extends Animal {
	
	@Column(name="ds_gestacao")
	private int gestacao;
	
	@Column(name="st_pelos")
	private boolean pelos;
	
	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String cor, String nome) {
		super(cor, nome);
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String cor, String nome, int gestacao, boolean pelos) {
		super(cor, nome);
		this.gestacao = gestacao;
		this.pelos = pelos;
	}

	public int getGestacao() {
		return gestacao;
	}

	public void setGestacao(int gestacao) {
		this.gestacao = gestacao;
	}

	public boolean isPelos() {
		return pelos;
	}

	public void setPelos(boolean pelos) {
		this.pelos = pelos;
	}
	
	

}
