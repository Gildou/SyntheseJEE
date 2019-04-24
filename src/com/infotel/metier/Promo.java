package com.infotel.metier;

public class Promo {
	private int idPromo;
	private String nomPromo;
	private int effectif;
	private Formation fFormation;
	public int getIdPromo() {
		return idPromo;
	}
	public void setIdPromo(int idPromo) {
		this.idPromo = idPromo;
	}
	public String getNomPromo() {
		return nomPromo;
	}
	public void setNomPromo(String nomPromo) {
		this.nomPromo = nomPromo;
	}
	public int getEffectif() {
		return effectif;
	}
	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}
	public Formation getfFormation() {
		return fFormation;
	}
	public void setfFormation(Formation fFormation) {
		this.fFormation = fFormation;
	}
	@Override
	public String toString() {
		return "Promo [idPromo=" + idPromo + ", nomPromo=" + nomPromo + ", effectif=" + effectif + ", fFormation="
				+ fFormation + "]";
	}

	
}
