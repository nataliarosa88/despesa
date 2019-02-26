package br.com.andretecnologia.example.teste;

import javax.persistence.EntityManager;

import br.com.andretecnologia.example.model.Expense;
import br.com.andretecnologia.example.util.JPAUtil;

public class RemoveExpenseTest {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		Expense e = em.find(Expense.class, 1);
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		em.close();

	}

}
