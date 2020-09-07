package com.algaworks.aula01.cadastrocliente.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		//Inserindo um registro com persist.
		//Cliente cliente = new Cliente();
		//cliente.setNome("Eletro Silva");
		//entityManager.getTransaction().begin();
		//entityManager.persist(cliente);
		//entityManager.getTransaction().commit();

		
		//Buscando um registro.
		Cliente clienteBuscar = entityManager.find(Cliente.class, 1);
		System.out.println(clienteBuscar.getNome());


		//Removendo o registro.
		//Cliente clienteRemover = entityManager.find(Cliente.class, 2);
		//entityManager.getTransaction().begin();
		//entityManager.remove(clienteRemover);
		//entityManager.getTransaction().commit();


		//Usando o cache de primeiro nivel.
		Cliente cliente1 = entityManager.find(Cliente.class, 1);
		Cliente cliente2 = entityManager.find(Cliente.class, 1);
		System.out.println(cliente1.getNome());
		System.out.println(cliente2.getNome());


		//        Atualizando o registro j gerenciado.
		//        Cliente cliente = entityManager.find(Cliente.class, 1);
		//        entityManager.getTransaction().begin();
		//        cliente.setNome(cliente.getNome() + " Alterado");
		//        entityManager.getTransaction().commit();


		//        Atualizando um objeto (que não nasceu gerenciado) com o merge.
		//        Cliente cliente = new Cliente();
		//        cliente.setId(1);
		//        cliente.setNome("Construtora Medeiros");
		//        entityManager.getTransaction().begin();
		//        entityManager.merge(cliente);
		//        entityManager.getTransaction().commit();


		//        Inserindo com o merge.
		//        Cliente cliente = new Cliente();
		//        cliente.setNome("Construtora Medeiros");
		//        entityManager.getTransaction().begin();
		//        entityManager.merge(cliente);
		//        entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
