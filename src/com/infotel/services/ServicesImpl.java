package com.infotel.services;

import java.util.List;

import com.infotel.dao.DaoImpl;
import com.infotel.dao.Idao;
import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;

public class ServicesImpl implements Iservices  {
	
	private Idao dao = new DaoImpl(); // synthaxe pour appeler la couche DAO

	@Override
	public int ajouterStagiaire(Stagiaire s) {
		return dao.ajouterStagiaire(s);
	}

	@Override
	public int supprimerStagiaire(int idStagiaire) {
		return dao.supprimerStagiaire(idStagiaire);
	}

	@Override
	public Stagiaire getStagiaire(int idStagiaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stagiaire> findAllStagiaire() {
		return dao.findAllStagiaire();
	}

	

	@Override
	public int ajouterPromo(Promo p) {
		return dao.ajouterPromo(p);
	}

	@Override
	public int supprimerPromo(int idPromo) {
		return dao.supprimerPromo(idPromo);
	}

	@Override
	public Promo getPromo(int idPromo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Promo> findAllPromo() {
		return dao.findAllPromo();
	}

	

	@Override
	public int ajouterFormation(Formation f) {
		return dao.ajouterFormation(f);
	}

	@Override
	public int supprimerFormation(int idFormation) {
		return dao.supprimerFormation(idFormation);
	}

	@Override
	public Formation getFormation(int idFormation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Formation> findAllFormation() {
		return dao.findAllFormation();
	}

	@Override
	public void ajouterStagiairePromo(Stagiaire s, Promo p) {
		dao.ajouterStagiairePromo(s, p);
	}

	@Override
	public void ajouterPromoFormation(Promo p, Formation f) {
		dao.ajouterPromoFormation(p, f);
	}

	
}
