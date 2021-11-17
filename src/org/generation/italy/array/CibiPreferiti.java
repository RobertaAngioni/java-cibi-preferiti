package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
	String[] ciboPreferito = new String[8];
        
	//inizializzazione cibi
	
	ciboPreferito[0] = "calamari e piselli";
	ciboPreferito [1] = "udon con gamberi e verdure";
	ciboPreferito[2] = "linguine con sugo agli scampi";
	ciboPreferito[3] = "sushi";
	ciboPreferito[4] = "montanara";
	ciboPreferito[5] = "zuppa agropiccante";
	ciboPreferito[6] = "frittura di pesce";
	ciboPreferito[7] = "ramen";
	
	// stampa a schermo
		int lunghezzaArray = ciboPreferito.length;
		System.out.println("Classifica di " + lunghezzaArray + " elementi");
		
		System.out.println("Il primo cibo in classifica è: " + ciboPreferito[0]);
		System.out.println("Il cibo di mezza classifica è: " + ciboPreferito[ciboPreferito.length / 2]);
		System.out.println("L'ultimo cibo in classifica è: " + ciboPreferito[ciboPreferito.length -1]);
		
		
		
		
		
		
	}


	}


