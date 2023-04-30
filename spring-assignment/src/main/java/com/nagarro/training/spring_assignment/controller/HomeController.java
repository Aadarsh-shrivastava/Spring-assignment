package com.nagarro.training.spring_assignment.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.training.spring_assignment.Repo.SaveInDB;
import com.nagarro.training.spring_assignment.Repo.Search;
import com.nagarro.training.spring_assignment.csvreaderservice.ReadAllCsv;
import com.nagarro.training.spring_assignment.csvreaderservice.ReadTshirtData;
import com.nagarro.training.spring_assignment.csvreaderservice.Readfile;
import com.nagarro.training.spring_assignment.data.Tshirt;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/add" , method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request ,HttpServletResponse response,Model model) throws IOException{
		
		
		final Session session = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tshirt.class).buildSessionFactory().openSession();
		
		ReadTshirtData rtd=new ReadTshirtData();
		ArrayList<Tshirt> allTshirtCSVRecord=rtd.readdata();
		
		SaveInDB saveInDb=new SaveInDB();
		saveInDb.saveRecord(allTshirtCSVRecord,session);
		
		String inputColor=request.getParameter("color");
		String inputSize=request.getParameter("size");
		String inputGender=request.getParameter("gender");
		String inputPreference=request.getParameter("preference");
		
		
//		String hql="Select id,productID,name,colour,gender,size,price,rating,availability from Tshirt where colour='"+inputColor+"' and Gender= '"+inputGender+"' and size='"+inputSize+"' ORDER BY "+inputPreference;
		String hql="Select id,productID,name,colour,gender,size,price,rating,availability from Tshirt ORDER BY "+inputPreference;
		Search searchRecord=new Search();
		ArrayList<Tshirt> searchedTshirtlist=searchRecord.searchrec(session, hql);
				
		model.addAttribute("t",searchedTshirtlist);
		return new ModelAndView("afteradd");
	}
}
