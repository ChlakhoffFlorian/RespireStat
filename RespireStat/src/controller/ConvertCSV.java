package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

import model.Etablissement;
import model.Lieu;
import model.CoordGPS;
import model.Type;

@SuppressWarnings("unused")
public class ConvertCSV {
	
	public static void lire (String fileName) {
	
		try {
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader (new FileReader(fileName));
			String[] nextLine;
			while((nextLine = reader.readNext()) != null) {
				
				for(int i=0; i<nextLine.length; i++) {
					System.out.print(nextLine[i] + " ");
				}
				System.out.println();
				new Etablissement(nextLine);
			
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	}

