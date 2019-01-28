package br.com.andretecnologia.exemplo.teste;

import javax.persistence.EntityManager;

import br.com.andretecnologia.exemplo.modelo.Despesa;
import br.com.andretecnologia.exemplo.util.JPAUtil;

public class TestaInsercaoDeDespesa {
	public static void main(String[] args) {
		
		Despesa despesaDeHoje = new Despesa();

		despesaDeHoje.setDescricao("Varejao Tanaka");
		//despesaDeHoje.setData??? getInstance();
		
		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		em.persist(despesaDeHoje);

		em.getTransaction().commit();

		em.close();
	
	}
}
