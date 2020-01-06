package fr.gtm.monopoly;

public class Depart extends Case {

		
	public Depart(String nom) {
		super(nom);
		
	}

	public void arreter (Pion pion) {
		System.out.println( "ARRET sur "+this.getNom()+" par "+pion.getName());
		pion.getJoueur().setSolde(pion.getJoueur().getSolde()+200);
		int temp = pion.getJoueur().getSolde();
		System.out.println("Le joueur est crédité, il a maintenant "+ temp);
	}
	
	public void survoler(Pion pion) {
		System.out.println( "SURVOL de "+this.getNom()+" par "+pion.getName());
		pion.getJoueur().setSolde(pion.getJoueur().getSolde()+400);
		int temp = pion.getJoueur().getSolde();
		System.out.println("Le joueur est crédité, il a maintenant "+ temp);
	}
}
