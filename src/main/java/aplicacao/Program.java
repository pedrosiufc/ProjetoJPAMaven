package aplicacao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		/*
		 * Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com"); Pessoa
		 * p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com"); Pessoa p3 = new
		 * Pessoa(null, "Ana Maria", "ana@gmail.com");
		 */

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em= emf.createEntityManager();

		//buscando por id, somente consultas não necessitam abrir e fechar transações
		Pessoa p=em.find(Pessoa.class, 2); //tem que monitorar o objeto para remover
		em.getTransaction().begin();
		em.remove(p); //remove a pessoa do banco
		em.getTransaction().commit();
		//System.out.println(p);
		
		/*
		 * em.getTransaction().begin(); em.persist(p1); em.persist(p2); em.persist(p3);
		 * em.getTransaction().commit();
		 */
				
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}
