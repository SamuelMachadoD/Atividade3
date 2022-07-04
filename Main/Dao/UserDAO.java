package Dao;

import javax.persistence.EntityManager;

import Modelo.User;
import Util.JPAUtil;

public class UserDAO {
	private EntityManager em;
	public UserDAO(EntityManager em2) {
		this.em = em2;
	}
	public User buscarPorNomeSenha(String login, String senha) {
		String jpql = "SELECT p FROM User p WHERE p.login = :login";
		return this.em.createQuery(jpql, User.class)
				.setParameter("login", login)
				.getSingleResult();
	}
}
