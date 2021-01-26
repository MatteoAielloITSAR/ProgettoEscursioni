package main;

import util.JpaUtilSingleton;

public class App {

	public static void main(String[] args) {
		
		var em = JpaUtilSingleton.getInstance().getEntityManager();
		
	}

}
