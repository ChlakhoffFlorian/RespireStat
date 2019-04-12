package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class ConvertCSV {
	
	public static void lire (String fileName) {
	
		try {
			CSVReader reader = new CSVReader (new FileReader("fileName"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	}

