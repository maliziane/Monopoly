package fr.gtm.monopoly;

import java.util.ArrayList;
import java.util.List;

public class Monopoly {
private Plateau plateau = new Plateau();
private List<Joueur>joueurs = new ArrayList<Joueur>();
private Gobelet gobelet = new Gobelet();
private Joueur vainqueur;

public void add(Joueur...joueurs) {
	for (Joueur j: joueurs) {
		this.joueurs.add(j);
		j.getPion().setPosition(plateau.getCaseDepart());
	}
}

public void demarrer() {
	System.out.println("Monopoly: lancement du jeu");
	boolean fini= false;
	while(!fini) {		
		//for(Joueur joueur:joueurs) { // marche pas si on veut une fin de partie
		for(int i=0; i<joueurs.size();i++) {
			joueurs.get(i).jouer(gobelet);
			/*
			 *  si le solde de joueur<0
			 *  remettre en jeu les propriete du joueur
			 *  enlever le joueur de la liste des joueurs
			 *  
			 *  si reste que 1 joueur
			 *  arreter jeu 
			 *  declarer le vainqueur
			 * 
			 */
			
			if(joueurs.get(i).getSolde()<=0) {
				for (Propriete propriete: joueurs.get(i).proprietes) {
					propriete.setOwner(null);
									}
				System.out.println("Le joueur est éliminé, ses propriétés sont de nouveau disponibles!");
				joueurs.remove(joueurs.get(i));
				System.out.println("Il reste "+joueurs.size()+" joueurs");
				
			}
			if(joueurs.size()==1) {
				fini=true;
				setVainqueur(joueurs.get(0));
			}
}}
	
	System.out.println("La partie est terminée ! Le vainqueur est "+getVainqueur().getNom()+" !! BRAVO!!");
	}

public Joueur getVainqueur() {
	return vainqueur;
}

public void setVainqueur(Joueur vainqueur) {
	this.vainqueur = vainqueur;
}
	
	
	



//	public  void jouer(Gobelet gobelet) {
//		boolean fini= false;
//				while (!fini) {
//					for(Joueur joueur:joueurs) {
//						joueur.jouer(gobelet);
//						System.out.println(joueur.getNom()+" obtient "+gobelet.getValeur());
//			
//			
//			
//			
//			
//			
//		}
//			if(gobelet.isSame()) {
//				fini=true;
//				vainqueur=joueur;
//				break;
//			     }
//		    }
//	    }
//	}



}
