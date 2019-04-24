package com.infotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.infotel.metier.Formation;

import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;

public class DaoImpl implements Idao {

	private Connection conn;
	private PreparedStatement st;
	private ResultSet rs;

	@Override
	public int ajouterStagiaire(Stagiaire s) {
		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("INSERT INTO Stagiaire(nom,prenom,age,fPromo)" + " VALUES(?,?,?,?)");
			st.setString(1, s.getNom());
			st.setString(2, s.getPrenom());
			st.setInt(3, s.getAge());
			st.setInt(4, s.getfPromo());

			st.executeUpdate(); // pour éxécuter une requête sans avoir de retour

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERREUR DE REQUETE");
		}
		return s.getIdStagiaire();
	}

	@Override
	public int supprimerStagiaire(int idStagiaire) {
		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("DELETE FROM Stagiaire WHERE idStagiaire=?");
			st.setInt(1, idStagiaire);

			st.executeUpdate(); // pour éxécuter une requête sans avoir de retour

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERREUR DE REQUETE");
			e.printStackTrace();
		}

		return idStagiaire;
	}

	@Override
	public Stagiaire getStagiaire(int idStagiaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stagiaire> findAllStagiaire() {
		List<Stagiaire> list = new ArrayList<Stagiaire>();

		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("SELECT * FROM Stagiaire");

			rs = st.executeQuery(); // pour éxécuter une requête

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

			while (rs.next()) // tant qu'il y a des choses à récupérer
			{
				Stagiaire s = new Stagiaire();
				s.setIdStagiaire(rs.getInt("idStagiaire"));
				s.setNom(rs.getString("nom"));
				s.setPrenom(rs.getString("prenom"));
				s.setAge(rs.getInt("age"));
				s.setfPromo(rs.getInt("fPromo"));

				list.add(s);
			}

		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println("ERREUR DE REQUETE");
			// e.printStackTrace();
		}

		return list;
	}

	@Override
	public int ajouterPromo(Promo p) {
		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("INSERT INTO Promo(nomPromo,effectif)" + " VALUES(?,?)");
			st.setString(1, p.getNomPromo());

			st.setInt(2, p.getEffectif());

			st.executeUpdate(); // pour éxécuter une requête sans avoir de retour

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERREUR DE REQUETE");
		}
		return p.getIdPromo();
	}

	@Override
	public int supprimerPromo(int idPromo) {
		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("DELETE FROM Promo WHERE idPromo=?");
			st.setInt(1, idPromo);

			st.executeUpdate(); // pour éxécuter une requête sans avoir de retour

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERREUR DE REQUETE");
			e.printStackTrace();
		}

		return idPromo;
	}

	@Override
	public Promo getPromo(int idPromo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Promo> findAllPromo() {
		List<Promo> list = new ArrayList<Promo>();

		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("SELECT * FROM Promo");

			rs = st.executeQuery(); // pour éxécuter une requête

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

			while (rs.next()) // tant qu'il y a des choses à récupérer
			{
				Promo p = new Promo();
				p.setIdPromo(rs.getInt("idPromo"));
				p.setNomPromo(rs.getString("nomPromo"));

				p.setEffectif(rs.getInt("effectif"));

				list.add(p);
			}

		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println("ERREUR DE REQUETE");
			// e.printStackTrace();
		}

		return list;
	}

	@Override
	public int ajouterFormation(Formation f) {
		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("INSERT INTO Formation(nomFormation)" + " VALUES(?)");
			st.setString(1, f.getNomFormation());

			st.executeUpdate(); // pour éxécuter une requête sans avoir de retour

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERREUR DE REQUETE");
			e.printStackTrace();
		}
		return f.getIdFormation();
	}

	@Override
	public int supprimerFormation(int idFormation) {
		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("DELETE FROM Formation WHERE idFormation=?");
			st.setInt(1, idFormation);

			st.executeUpdate(); // pour éxécuter une requête sans avoir de retour

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERREUR DE REQUETE");
			e.printStackTrace();
		}

		return idFormation;
	}

	@Override
	public Formation getFormation(int idFormation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findAllFormation() {
		List<Formation> list = new ArrayList<Formation>();

		try {
			// 1- Se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2- Effectuer la requête
			st = conn.prepareStatement("SELECT * FROM Formation");

			rs = st.executeQuery(); // pour éxécuter une requête

			// 3- Récupérer le résultat en cas de besoin (si la méthode est un SELECT)

			while (rs.next()) // tant qu'il y a des choses à récupérer
			{
				Formation f = new Formation();
				f.setIdFormation(rs.getInt("idFormation"));
				f.setNomFormation(rs.getString("nomFormation"));

				list.add(f);
			}

		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println("ERREUR DE REQUETE");
			// e.printStackTrace();
		}

		return list;
	}

	@Override
	public void ajouterStagiairePromo(Stagiaire s, Promo p) {

		try {
			conn = GestionConnexion.getInstance();
			st = conn.prepareStatement("INSERT INTO Stagiaire (nom,prenom,age,fPromo)"+ "values(?,?,?,?)");
			
			st.setString(1, s.getNom());
			st.setString(2, s.getPrenom());
			st.setInt(3, s.getAge());
			st.setInt(4,s.getfPromo());

			st.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void ajouterPromoFormation(Promo p, Formation f) {
		try {
			conn = GestionConnexion.getInstance();
			st = conn.prepareStatement("UPDATE Promo set fFormation=? where idPromo=?");
			st.setInt(1, f.getIdFormation());
			st.setInt(2, p.getIdPromo());

			st.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
