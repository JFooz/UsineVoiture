package com.usine.models;

/**
 *
 * @author utilisateur5
 *
 */
public class Voiture extends Vehicule {

	//Liste constructeurs
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String marque, String couleur, long prix) {
		super(marque, couleur, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rouler(int km) {
		System.out.println(this.marque+" : je roule sur 4 roues pendant "+this.kilometrage+"km");
		this.kilometrage += km;
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
		builder.append("]");
		return builder.toString();
	}



}
