package fr.gtm.monopoly;

public class Plateau {
	private Case[] cases= new Case[40];
	
	
	public Case getCaseDepart() {
	 return cases[0]	;
	}
	
	public Plateau() {
		creerCases(cases);
		lierCases(cases);
	}
	/*
	 * chargée de creer 40cases
	 * case 0 case 1 etc
	 */
	
	private void creerCases(Case cases[]) {
		
  for(int i=0;i<cases.length;i++) {
	  if(i==0) {
		  cases[i]=new Depart("Case Depart");
	  }else if (i==4) {
		  cases[i]=new Impots("Case Impots");
  	  }else if (i==38){
  		  cases[i]=new TaxeDeLuxe("Case Taxe De Luxe");
  	  }else if (i==5 || i==15 || i==25 || i==35 ) {
  		  cases[i]=new Gare("Case Gare");
  	  }else if (i==12 || i==28) {
		  cases[i]=new Compagnie("Case Compagnie");
      } else{
	      cases[i]= new Terrain("case"+i);
	  }
	  
  }
		
	}
	private void lierCases(Case cases[]) {
		for (int i=0; i<cases.length-1;i++) {
			cases[i].setSuivante(cases[i+1]);
			}
			cases[cases.length-1].setSuivante(cases[0]);
		}
	
	
	
	
	
	}

	
	

