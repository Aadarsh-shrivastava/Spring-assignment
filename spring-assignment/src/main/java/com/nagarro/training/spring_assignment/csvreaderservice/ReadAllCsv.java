package com.nagarro.training.spring_assignment.csvreaderservice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadAllCsv {
	private List<String> filenames = new ArrayList<String>();
	
	public List<String> listFilesForFolder(final File folder) {
		try {
			for (final File fileEntry : folder.listFiles()) {
				if (fileEntry.isDirectory()) {
					listFilesForFolder(fileEntry);
				} else {
					if (fileEntry.getName().contains(".csv"))
						filenames.add(fileEntry.getName());
				}
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Files not found");
		}
		return filenames;
	}

	public List<String> getFilenames() {
		return filenames;
	}

	public void setFilenames(List<String> filenames) {
		this.filenames = filenames;
	}

}

