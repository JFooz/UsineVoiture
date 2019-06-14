package com.usine.models;

public class Moto extends Vehicule{


	// Les constructeurs
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String marque, String couleur, long prix) {
		super(marque, couleur, prix);
		// TODO Auto-generated constructor stub
	}

	//Les méthodes
	@Override
	public void rouler(int km) {
		System.out.println(this.marque+" : je roule sur deux roues pendant "+this.kilometrage+ "km");
		this.kilometrage += km;
	}

	public void wheeling() {
		System.out.println(this.marque+" je fais un wheeling");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Moto [marque=");
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