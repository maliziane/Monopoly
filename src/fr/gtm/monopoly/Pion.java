package fr.gtm.monopoly;

public class Pion {
 private String nom;
 private Case position;
 private Joueur joueur;
 
 public Pion(String nom) {
	   this.nom=nom ;
 }
 
public String getName() {
	return nom;
}
public void setName(String nom) {
	this.nom = nom;
}
public Case getPosition() {
	return position;
}
public void setPosition(Case position) {
	this.position = position;
}

public Joueur getJoueur() {
	return joueur;
}

public void setJoueur(Joueur joueur) {
	this.joueur = joueur;
}

public void avancer(int r) {
			for (int i=0; i<r-1;i++){
				this.position=position.getSuivante();
				this.position.survoler(this);
			
	} 		this.position=position.getSuivante();
			this.position.arreter(this);
	
}


}
