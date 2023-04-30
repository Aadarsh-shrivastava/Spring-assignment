package com.nagarro.training.spring_assignment.csvreaderservice;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.nagarro.training.spring_assignment.data.Tshirt;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Readfile {
	
	private String[] record = new String[15];
	public ArrayList<Tshirt> readCSV(String filepath) {
		ArrayList<Tshirt> allTshirtRecord = new ArrayList<Tshirt>();
		try {
			FileReader filereader = new FileReader(filepath);
			CSVReader csvReader = new CSVReader(filereader);
			String[] line;
			try {
				while ((line = csvReader.readNext()) != null) {

					for (String Tshirtdata : line) {
						Tshirtdata = Tshirtdata.replace('|', ',');
						record = (Tshirtdata.split(","));
						if (record[0].equals("ID"))
							continue;

						Tshirt tshirt = new Tshirt(record[0], record[1], record[2], record[3], record[4],
								Double.parseDouble(record[5]), Double.parseDouble(record[6]), record[7]);

						allTshirtRecord.add(tshirt);

					}
				}
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return allTshirtRecord;
	}

	
}