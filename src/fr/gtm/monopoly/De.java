package fr.gtm.monopoly;

import java.util.Random;

public class De {
	private int valeur;
	private static Random random= new Random(); //static car partagé entre toutes les instances
	
	
	public int getValeur() {
		return valeur;
	}
	
	public void lancer() {
		valeur=random.nextInt(6)+1; //voir javadoc de la methode nextInt qui là va donner valeur entre 0 et 5
	}
	
	
	
	}
	
	