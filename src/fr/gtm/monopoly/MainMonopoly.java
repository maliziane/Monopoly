package fr.gtm.monopoly;


public class MainMonopoly {

	public static void main(String[] args) {
Monopoly monopoly = new Monopoly();


Pion p1=new Pion("avion");
Pion p2=new Pion("bateau");
Pion p3=new Pion("chapeau");
Joueur j1= new Joueur("Myriam",p1);
Joueur j2= new Joueur("Mona",p2);
Joueur j3= new Joueur ("Georgina",p3 );
p1.setJoueur(j1);
p2.setJoueur(j2);
p3.setJoueur(j3);

monopoly.add(j1,j2,j3);
monopoly.demarrer();


System.out.println(j1.getNom()+" a un solde de "+j1.getSolde());
System.out.println(j2.getNom()+" a un solde de "+j2.getSolde());
System.out.println(j3.getNom()+" a un solde de "+j3.getSolde());

}}
