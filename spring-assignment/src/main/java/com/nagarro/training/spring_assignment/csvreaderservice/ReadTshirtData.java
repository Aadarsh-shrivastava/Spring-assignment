package com.nagarro.training.spring_assignment.csvreaderservice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.nagarro.training.spring_assignment.data.Tshirt;

public class ReadTshirtData {
	public ArrayList<Tshirt> readdata() {
		final String filepath = "C:\\Users\\arpua\\eclipse-workspace\\spring-assignment\\src\\main\\resources\\";

		ReadAllCsv readAllcsv = new ReadAllCsv();
		Readfile readEachFile = new Readfile();
		final File file = new File(filepath);
		List<String> csvlist = readAllcsv.listFilesForFolder(file);
		ArrayList<Tshirt> allTshirtCSVRecord = new ArrayList<Tshirt>();

		for (String csvfile : csvlist) {
			allTshirtCSVRecord.addAll(readEachFile.readCSV(filepath + csvfile));
		}
		return allTshirtCSVRecord;
	}
}
