package br.com.andretecnologia.example.teste;

import java.time.LocalDate;


import javax.persistence.EntityManager;

import br.com.andretecnologia.example.model.Expense;
import br.com.andretecnologia.example.util.JPAUtil;

public class FindByIdExpenseTest {

	public static void main(String[] args) {
		
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

	        Expense d = em.find(Expense.class, 1);

	        System.out.println(d.getDescription());
	        
	        LocalDate date = d.getCreated();
	        System.out.println(date);
	        
	        System.out.println(d.getSupplier().getName());
	        
        em.getTransaction().commit();
        em.close();
	}
}
