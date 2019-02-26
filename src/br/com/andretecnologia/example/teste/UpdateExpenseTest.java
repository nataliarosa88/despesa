package br.com.andretecnologia.example.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.persistence.EntityManager;

import br.com.andretecnologia.example.model.Expense;
import br.com.andretecnologia.example.util.JPAUtil;

public class UpdateExpenseTest {

	public static void main(String[] args) {
		Expense d = new Expense();
		d.setId(3);
		d.setDescription("oi");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		formatter = formatter.withLocale( Locale.ENGLISH );
		LocalDate date = LocalDate.parse("2019-06-06", formatter);
		
		d.setCreated(date);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.merge(d);
		em.getTransaction().commit();
		em.close();
		

	}

}
