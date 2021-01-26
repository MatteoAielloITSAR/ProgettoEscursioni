package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtilSingleton {
	
	private static JpaUtilSingleton instance = null;
	
	private EntityManagerFactory emf;
	
	private JpaUtilSingleton() {
		this.emf = Persistence.createEntityManagerFactory("connessione-db");
	}
	
	
	public static JpaUtilSingleton getInstance() {
		if (instance == null) {
			instance = new JpaUtilSingleton();
		}
		return instance;
	}
	
	public EntityManager getEntityManager() {
		return this.emf.createEntityManager();
	}
	
	
}
	
	

