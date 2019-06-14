package com.usine.models;

public class Vehicule {

	protected String marque;
	protected String couleur;
	protected long kilometrage = 5;
	protected long prix;

	//Liste constructeurs
	public Vehicule(String marque, String couleur, long prix) {
		this.marque = marque;
		this.couleur = couleur;
		this.prix = prix;
	}

	public Vehicule() {
		this("Marque par défaut", "Couleur par défaut", -1);
	}

	// Liste des méthodes
	public void rouler(int km) {
		System.out.println(this.marque+" : je roule "+this.kilometrage);
		this.kilometrage += km;
	}

	// Liste Getters et Setters
	public String getMarque() {
		return this.marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return this.couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public long getPrix() {
		return this.prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public long getKilometrage() {
		return this.kilometrage;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicule [marque=");
		builder.append(this.marque);
		builder.append(", couleur=");
		builder.append(this.couleur);
		builder.append(", kilometrage=");
		builder.append(this.kilometrage);
		builder.append(", prix=");
		builder.append(this.prix);
		builder.append("]");
		return builder.toString();
	}


}
