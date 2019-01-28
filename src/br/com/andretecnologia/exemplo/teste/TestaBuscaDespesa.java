package br.com.andretecnologia.exemplo.teste;

import javax.persistence.EntityManager;

import br.com.andretecnologia.exemplo.modelo.Despesa;
import br.com.andretecnologia.exemplo.util.JPAUtil;


public class TestaBuscaDespesa {
	public static void main(String[] args) {
		
		//change request cr001
		
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

	        Despesa despesaDoBancoDeDados = em.find(Despesa.class, 3);
	        								//recuperar registros entity manager ArrayList ou List<Despesa>
	        
	        System.out.println(despesaDoBancoDeDados.getDescricao());
	        //System.out.println(despesaDoBancoDeDados.getData());
	        
	        //Lista de despesas do banco de dados
	        //vai vir objeto List<Despesa> despesas = new List<Despesa>;
	        //for(Despesa d : despesas){
	        	//sysout(d.getDescricao);
	        	//sysout(d.getData);
	       //}

        em.getTransaction().commit();
        em.close();
	}
}
