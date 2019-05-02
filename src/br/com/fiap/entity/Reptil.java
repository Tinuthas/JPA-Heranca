package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="T_REPTIL")
@PrimaryKeyJoinColumn(name="cd_animal")
public class Reptil extends Animal{
	
	@Column(name="st_venenoso")
	private boolean venenoso;
	
	@Column(name="st_escamas")
	private boolean escamas;

	public Reptil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reptil(String cor, String nome) {
		super(cor, nome);
		// TODO Auto-generated constructor stub
	}

	public Reptil(String cor, String nome, boolean venenoso, boolean escamas) {
		super(cor, nome);
		this.venenoso = venenoso;
		this.escamas = escamas;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public boolean isEscamas() {
		return escamas;
	}

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}
	
	

}
