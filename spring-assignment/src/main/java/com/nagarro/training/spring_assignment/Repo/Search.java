package com.nagarro.training.spring_assignment.Repo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nagarro.training.spring_assignment.data.Tshirt;

public class Search {
	public ArrayList<Tshirt> searchrec(Session session,String hql) {
//		String hql="Select id,productID,name,colour,gender,size,price,rating,availability from Tshirt where colour='"+inputColor+"' and Gender= '"+inputGender+"' and size='"+inputSize+"' ORDER BY "+inputPreference;
//		String hql="Select id,productID,name,colour,gender,size,price,rating,availability from Tshirt ORDER BY "+inputPreference;

		Query query=session.createQuery(hql);
		List<Object[]> outputshirts=(List<Object[]>)query.list();
		ArrayList<Tshirt> searchedTshirtlist=new ArrayList<Tshirt>();
		int sno=1;
		for(Object[] t:outputshirts)
		{	
			System.out.println(t[4]);System.out.println(t[5]);System.out.println(t[6]);System.out.println(t[7]);System.out.println(t[8]);
			Tshirt searchedTshirt = new Tshirt();
			searchedTshirt.setId(sno);
			searchedTshirt.setProductID(t[1].toString());
			searchedTshirt.setName(t[2].toString());
			searchedTshirt.setColour(t[3].toString());
			searchedTshirt.setGender(t[4].toString());
			searchedTshirt.setSize(t[5].toString());
			searchedTshirt.setPrice(Double.parseDouble(t[6].toString()));
			searchedTshirt.setRating(Double.parseDouble(t[7].toString()));
			searchedTshirt.setAvailability(t[8].toString());
			sno++;
			searchedTshirtlist.add(searchedTshirt);
			
		}
		return searchedTshirtlist;
	}
}
