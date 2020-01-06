package fr.gtm.monopoly;

public class Depart extends Case {

		
	public Depart(String nom) {
		super(nom);
		
	}

	public void arreter (Pion pion) {
		pion.getJoueur().setSolde(pion.getJoueur().getSolde()+200);
	}
	
	public void survoler(Pion pion) {
		pion.getJoueur().setSolde(pion.getJoueur().getSolde()+400);
	}
}
