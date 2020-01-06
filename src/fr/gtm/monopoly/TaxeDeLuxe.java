package fr.gtm.monopoly;

public class TaxeDeLuxe extends Case {

	public TaxeDeLuxe(String nom) {
		super(nom);
	}
	
	@Override
	public void arreter (Pion pion) {
		System.out.println( "ARRET sur "+this.getNom()+" par "+pion.getName());
		pion.getJoueur().setSolde(pion.getJoueur().getSolde()-350);
		int temp = pion.getJoueur().getSolde();
		System.out.println("Le joueur est débité, il a maintenant "+ temp);
	}
}
