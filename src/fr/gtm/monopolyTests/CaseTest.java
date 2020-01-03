package fr.gtm.monopolyTests;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.monopoly.Case;

public class Case{


	@Test
	public void testGetNom() {
		Case c= new Case("toto");
		c.getNom()
		assessEquals("toto",c.getNom());
	}

	@Test
	public void testSetNom() {
		Case c= new Case("toto");
		c.setNom("tata");
		assessEquals("tata",c.getNom());
		}
	
	@Test
	public void testGetSuivante() {
	
	}
	@Test
	public void testSetSuivante() {
		
		}
	
}
