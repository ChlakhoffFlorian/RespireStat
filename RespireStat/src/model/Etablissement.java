package model;

public class Etablissement {
		private String identifiant;
		private String nomEtablissement;
		private String lieuEtablissement; 
		
		public Etablissement (String[] nextLine) {
			identifiant = nextLine[0];
			nomEtablissement = nextLine[1];
		}
		
}
