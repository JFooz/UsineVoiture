package com.usine.models;

public class Moto {

	private String marque;
	private String couleur;
	private int prix;
	private long kilometrage;

	//Liste des constructeurs
	public Moto() {

	}

	public Moto(String marque, String couleur, int prix, long kilometrage) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.prix = prix;
		this.kilometrage = kilometrage;
	}

	// Liste des méthodes
	public void rouler(int km) {
		System.out.println(this.marque+" : je roule "+this.kilometrage);
		this.kilometrage += km;
	}

	// Getters et Setters
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

	public int getPrix() {
		return this.prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public long getKilometrage() {
		return this.kilometrage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Moto [marque=");
		builder.append(this.marque);
		builder.append(", couleur=");
		builder.append(this.couleur);
		builder.append(", prix=");
		builder.append(this.prix);
		builder.append(", kilometrage=");
		builder.append(this.kilometrage);
		builder.append("]");
		return builder.toString();
	}
}