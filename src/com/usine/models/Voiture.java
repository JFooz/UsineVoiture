package com.usine.models;

/**
 *
 * @author utilisateur5
 *
 */
public class Voiture {

	public String marque;
	private String couleur;
	private long kilometrage;
	private long prix;
	private String moteur;


	public Voiture() {

	}
	/**
	 *
	 * @param marque String
	 * @param couleur String
	 * @param prix long
	 * @param moteur String
	 */
	public Voiture(String marque, String couleur, long prix, String moteur) {

		this.marque = marque;
		this.couleur = couleur;
		this.prix = prix;
		this.moteur = moteur;
		this.kilometrage = 5;
	}

	public void rouler(int nombreKm) {

		System.out.println(this.marque+ ": Je roule sur "+ nombreKm);
		this.kilometrage += nombreKm;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voiture [marque=");
		builder.append(this.marque);
		builder.append(", couleur=");
		builder.append(this.couleur);
		builder.append(", kilometrage=");
		builder.append(this.kilometrage);
		builder.append(", prix=");
		builder.append(this.prix);
		builder.append(", moteur=");
		builder.append(this.moteur);
		builder.append("]");
		return builder.toString();
	}
	// Getters et Setters
	public long getKilometrage() {
		return this.kilometrage;
	}
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
	public String getMoteur() {
		return this.moteur;
	}
	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}
}
