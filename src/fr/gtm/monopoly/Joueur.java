package fr.gtm.monopoly;

public class Joueur {
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
}
