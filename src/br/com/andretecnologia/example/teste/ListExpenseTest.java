package br.com.andretecnologia.example.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.andretecnologia.example.model.Expense;

public class ListExpenseTest {

	public static void main(String[] args) {
		
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("expense");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Expense> q = em.createQuery("select e from Expense e where e.id >= :paramFinalizado", Expense.class);
        q.setParameter("paramFinalizado", 0);
        
        List<Expense> expenses = q.getResultList();
        for (Expense e : expenses) {
        	String supName = e.getSupplier().getName();
        	System.out.print(e.getId()+"-");
        	System.out.print(e.getDescription()+"-");
        	System.out.print(e.getCreated()+"-");
        	System.out.println(supName);
        }
        
        em.close();

	}

}
