package model;

public class Etablissement {
		private String identifiant;
		private String nomEtablissement;
		private Lieu lieuEtablissement; 
		private Type typeEtablissement;
		private CoordGPS coordonneesEtablissement;
		
		public Etablissement (String[] nextLine) {
			identifiant = nextLine[0];
			nomEtablissement = nextLine[1];
			lieuEtablissement = new Lieu(nextLine[2],nextLine[3],nextLine[4]);
			if(nextLine[5].equals("secondaire")) {
				typeEtablissement = Type.SECONDAIRE;
			}
			else {
				typeEtablissement = Type.PRIMAIRE;
			}
			coordonneesEtablissement = new CoordGPS(nextLine[24]);
			
		}
		
}
