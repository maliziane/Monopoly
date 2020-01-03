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
	  cases[i]= new Case("case"+i);
	  
  }
		
	}
	private void lierCases(Case cases[]) {
		for (int i=0; i<cases.length-1;i++) {
			cases[i].setSuivante(cases[i+1]);
			}
			cases[cases.length-1].setSuivante(cases[0]);
		}
	}

	
	

