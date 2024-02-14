package org.jsp.companyportal.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.companyportal.dao.Company_Dao;
import org.jsp.companyportal.dto.Address;
import org.jsp.companyportal.dto.Company;
import org.jsp.companyportal.dto.Computer;
import org.jsp.companyportal.dto.Employee;
import org.jsp.companyportal.dto.Skills;

public class Company_Controller {

	public static void main(String[] args) {
		Address address=new Address();
		address.setAddress("sakinaka");
		address.setState("maharshtra");
		address.setCountry("india");
		
		Computer computer=new Computer();
		computer.setBrand("acer");
		computer.setProcessor("intel i5");
		
		Computer computer1=new Computer();
		computer1.setBrand("dell");
		computer1.setProcessor("intel i7");
		
		List<Computer>list=new ArrayList<Computer>();
		list.add(computer);
		list.add(computer1);
		
		Skills skills=new Skills();
		skills.setName("web tech");
		skills.setRating("5");
		
		Skills skills1=new Skills();
		skills1.setName("j2ee");
		skills1.setRating("5");
		
		List<Skills>list2=new ArrayList<Skills>();
		list2.add(skills);
		list2.add(skills1);
		
		Employee employee=new Employee();
		employee.setName("sagar");
		employee.setSal(400000);
		employee.setAddress("mumbai");
		employee.setComputer(computer);
		employee.setSkills(list2);
		
		Employee employee1=new Employee();
		employee1.setName("ashsih");
		employee1.setSal(400000);
		employee1.setAddress("thane");
		employee1.setComputer(computer1);
		employee1.setSkills(list2);
		
		List<Employee>list3=new ArrayList<Employee>();
		list3.add(employee);
		list3.add(employee1);
		
		Company company=new Company();
		company.setName("tcs");
		company.setDomain("IT");
		company.setAddress(address);
		company.setEmployee(list3);
		company.setComputer(list);
		
		Company_Dao dao=new Company_Dao();
//		dao.saveComapny(company);
//		dao.updateCompany(2, list3);
//		dao.updateEmployee(3, list2);
//		dao.deleteSkill(3, 9);
//		dao.deleteEmployee(2, 4);
		
	}

}
