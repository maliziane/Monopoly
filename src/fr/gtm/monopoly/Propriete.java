package fr.gtm.monopoly;

public abstract class Propriete extends Case { // met abstract pour empecher de faire un new Propriete

	private int prixAchat;
	private int loyer;
	private Joueur owner;
	
	public Propriete(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void arreter (Pion pion) {
		System.out.println( "ARRET sur "+this.getNom()+" par "+pion.getName());
		int solde = pion.getJoueur().getSolde();
		if (this.owner==null && solde>=prixAchat) {
			acheter(pion.getJoueur());
			}
		if (this.owner!=null && (pion.getJoueur() != this.owner)) {
					payerLoyer(pion.getJoueur());
				}
			}
	
	
	public void acheter(Joueur joueur) {
				this.setOwner(joueur);
				joueur.setSolde(joueur.getSolde()-prixAchat);
				joueur.addPropriete(this);
		System.out.println("La propriété a maintenant un propriétaire: "+owner.getNom());
		System.out.println(owner.getNom()+" a maintenant un solde de "+owner.getSolde());
		
	}
		
	public void payerLoyer(Joueur joueur) {
		owner.setSolde(owner.getSolde()+loyer);
		joueur.setSolde(joueur.getSolde()-loyer);
		System.out.println(joueur.getNom()+" a payé un loyer de "+loyer+" à "+owner.getNom());
	}

	public int getLoyer() {
		return loyer;
	}

	public void setLoyer(int loyer) {
		this.loyer = loyer;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public Joueur getOwner() {
		return owner;
	}

	public void setOwner(Joueur joueur) {
		this.owner = joueur;
	}

	
}
