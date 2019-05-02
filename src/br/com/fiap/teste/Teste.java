package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.AnimalDAO;
import br.com.fiap.dao.impl.AnimalDAOImpl;
import br.com.fiap.entity.Animal;
import br.com.fiap.entity.Mamifero;
import br.com.fiap.entity.Reptil;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {
	
	private static AnimalDAO dao;

	@BeforeAll
	public static void init() {
		dao = new AnimalDAOImpl(EntityManagerFactorySingleton
				.getInstance().createEntityManager()); 
	}
	
	@Test
	void cadastrarTest() {
		
		Animal animal = new Animal("Branco", "Pardal");
		Mamifero mamifero = new Mamifero("Amarelo", "Pessoa", 9, true);
		Reptil reptil = new Reptil("Verde", "Camaleão", false, true); 
		
		dao.create(animal);
		dao.create(mamifero);
		dao.create(reptil);
		try {
			dao.commit();
		}catch (Exception e) {
			e.printStackTrace();
			fail("Erro");
		}
	}

}
