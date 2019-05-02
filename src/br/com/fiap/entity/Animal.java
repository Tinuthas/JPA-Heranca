package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_ANIMAL")
@Inheritance(strategy=InheritanceType.JOINED)
@SequenceGenerator(name="animal", sequenceName="SQ_T_ANIMAL", allocationSize=1)
public class Animal {
	
	@Id
	@Column(name="cd_animal")
	@GeneratedValue(generator="animal", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_cor")
	private String cor;
	
	@Column(name="nm_animal")
	private String nome;
	
	

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String cor, String nome) {
		super();
		this.cor = cor;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
