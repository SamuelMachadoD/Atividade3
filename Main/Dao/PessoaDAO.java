package Dao;

import javax.persistence.EntityManager;

import Modelo.Pessoa;

public class PessoaDAO {
	private EntityManager em;
	public PessoaDAO(EntityManager em2) {
		this.em = em2;
	}
	public void cadastrar(Pessoa p) {
		this.em.persist(p);
	}
}
