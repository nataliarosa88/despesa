package br.com.andretecnologia.example.teste;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import br.com.andretecnologia.example.model.Expense;
import br.com.andretecnologia.example.model.Supplier;
import br.com.andretecnologia.example.util.JPAUtil;

public class InsertExpenseTest {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		
		Expense d = new Expense();
		d.setDescription("test J");
		d.setCreated(LocalDate.now());
		
		Supplier s = new Supplier();
		s.setName("joao");
		
		//Supplier s = em.find(Supplier.class, 2);
		
		
		d.setSupplier(s);
		
		
		em.getTransaction().begin();
		em.persist(s);
		em.persist(d);
		em.getTransaction().commit();
		em.close();	
	}
}
