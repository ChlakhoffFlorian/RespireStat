package model;

public class Lieu {
	private String departement;
	private String ville;
	private String codePostal;
	
	
	
	
	public Lieu (String [] nextLine) {
		
		departement = nextLine[3];
		ville = nextLine[4];
		codePostal = nextLine[5];
	}
}
