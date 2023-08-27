package br.com.alura.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
				
		
		Conta conta = new Conta();
		conta.setTitular("Joaozinho");
		conta.setAgencia(4321);
		conta.setNumero(1234);
		// obrigatoriamente dentro de uma transação, senão nao avança
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		em.getTransaction().commit();
		
		
			
	
		

	}

}
