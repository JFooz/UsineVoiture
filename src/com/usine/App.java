package com.usine;

import com.usine.models.Voiture;

public class App {
	public static void main(String[] args) {

		Voiture titine = new Voiture("Nissan", "Vert bouteille", 120000l, "V8");
		Voiture tutur = new Voiture("Honda", "Noir", 100000, "V12");
		System.out.println(titine);


		System.out.println("Compteur tutur : "+ tutur.getKilometrage());
		tutur.rouler(15);
		System.out.println("Compteur tutur : "+ tutur.getKilometrage());

		System.out.println("Compteur tutur : "+ tutur.getKilometrage());

		System.out.println(titine.getKilometrage());
	}


}


