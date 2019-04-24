package com.infotel.dao;

import java.util.List;

import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;



public interface Idao {
	
	//Métodes Classe Stagiaire
	public int ajouterStagiaire(Stagiaire s);

	public int supprimerStagiaire(int idStagiaire);

	public Stagiaire getStagiaire(int idStagiaire);

	public List<Stagiaire> findAllStagiaire();
	
	public void ajouterStagiairePromo(Stagiaire s, Promo p);
	
	//Métodes Classe Promo
	public int ajouterPromo(Promo p);

	public int supprimerPromo(int idPromo);

	public Promo getPromo(int idPromo);

	public List<Promo> findAllPromo();
	
	public void ajouterPromoFormation(Promo p, Formation f);
	
	//Métodes Classe Formation
	public int ajouterFormation(Formation f);

	public int supprimerFormation(int idFormation);

	public Formation getFormation(int idFormation);

	public List<Formation> findAllFormation();
	
	

}
