package fr.gtm.monopoly;

public class Impots extends Case {

	public Impots (String nom) {
		super(nom);
	}
	
	@Override
	public void arreter (Pion pion) {
		System.out.println( "ARRET sur "+this.getNom()+" par "+pion.getName());
		int temp = pion.getJoueur().getSolde();
		pion.getJoueur().setSolde(temp>5000 ? temp-500:temp-(temp/10));
		System.out.println("Le joueur est débité, il a maintenant "+ temp);
	}
}
