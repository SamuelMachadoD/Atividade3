package Dao;

import javax.persistence.EntityManager;

import Modelo.User;

public class UserDAO {
	private EntityManager em;
	public User buscarPorNomeSenha(String nome, String senha) {
		String jpql = "SELECT p FROM users p WHERE p.nome = ?1, p.senha = ?2";
		return em.createQuery(jpql, User.class)
				.setParameter(1, nome)
				.setParameter(2, senha)
				.getSingleResult();
	}
}
