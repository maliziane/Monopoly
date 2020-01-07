package fr.gtm.monopoly;
//a une liste de ses proprietés, propriete type case a une instance de proprietaire type joueur. 
//Si s'arrete et a le solde il achete si deja acheté paye le loyer si pas proprietaire

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	
		List<Propriete> proprietes= new ArrayList<Propriete>();
		
		private String nom;
		private int solde=1500;
		private Pion pion;
		
		
		public Joueur(String nom) {
			this.nom= nom;
		}
		public Joueur(String nom, Pion pion) {
			this.nom= nom;
			this.pion=pion;
		}
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getSolde() {
			return solde;
		}
		public void setSolde(int solde) {
			this.solde = solde;
		}
		
		
		public Pion getPion() {
			return pion;
		}
		public void setPion(Pion pion) {
			this.pion = pion;
		}
		
		public void jouer(Gobelet gobelet) {
			gobelet.lancer(); //Gobelet a deja été créé par Monopoly
			System.out.println(">> "+nom+" a obtenu "+ gobelet.getValeur());
			pion.avancer(gobelet.getValeur());
		}
		
		public void addPropriete(Propriete propriete) {
			proprietes.add(propriete);
		}
		
}
