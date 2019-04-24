package com.infotel.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GestionConnexion {

	private String url = "jdbc:postgresql://localhost:5432/SyntheseJEE";
	private String user = "postgres";
	private String password = "javaJee";
	// Objet connection
	private static Connection connect;

	// Constructeur privé
	private GestionConnexion() {
		try {
			Class.forName("org.postgresql.Driver");
			connect = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Erreur de connexion");
		}
	}

	// Méthode d'attribution de connection
	public static Connection getInstance() {
		if (connect == null) {
			new GestionConnexion();
		}
		return connect;
	}

}
