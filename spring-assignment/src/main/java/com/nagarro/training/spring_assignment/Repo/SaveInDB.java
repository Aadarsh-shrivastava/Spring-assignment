package com.nagarro.training.spring_assignment.Repo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nagarro.training.spring_assignment.data.Tshirt;

public class SaveInDB {
	
	public void saveRecord(ArrayList<Tshirt> allTshirtCSVRecord,Session session) {
		for(Tshirt tshirt:allTshirtCSVRecord) {
			Tshirt newTshirt = new Tshirt();
			newTshirt.setProductID(tshirt.getProductID());
			newTshirt.setName(tshirt.getName());
			newTshirt.setColour(tshirt.getColour());
			newTshirt.setGender(tshirt.getGender());
			newTshirt.setSize(tshirt.getSize());
			newTshirt.setRating(tshirt.getRating());
			newTshirt.setPrice(tshirt.getPrice());
			newTshirt.setAvailability(tshirt.getAvailability());
			
			Transaction tx =session.beginTransaction();
			session.saveOrUpdate(newTshirt);
			tx.commit();
			
		}
	}
}
