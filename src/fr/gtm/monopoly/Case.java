package fr.gtm.monopoly;

public class Case {
   private String nom;
   private Case suivante;
   

   
   public Case(String nom) {
	   this.nom=nom;
   }
   
   public Case getSuivante() {
	return suivante;
}
   public void setSuivante(Case suivante) {
	this.suivante = suivante;
}
   
   public String getNom() {
	return nom;
}
   public void setNom(String nom) {
     this.nom=nom;
   }
   
   public void arreter(Pion pion) {
   System.out.println( "ARRET sur "+this.nom+" par "+pion.getName());
   }
   
   public  void survoler(Pion pion) {
   System.out.println( "SURVOL de "+this.nom+" par "+pion.getName());
   }
   
   
}
