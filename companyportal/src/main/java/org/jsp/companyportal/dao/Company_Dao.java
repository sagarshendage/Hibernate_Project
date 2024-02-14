package org.jsp.companyportal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.companyportal.dto.Company;
import org.jsp.companyportal.dto.Employee;
import org.jsp.companyportal.dto.Skills;

public class Company_Dao {
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveComapny(Company company) {
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}	
	
	public void updateCompany(int id,List<Employee>emp) {
		Company company=manager.find(Company.class, id);
		if (company!=null) {
			company.getEmployee().addAll(emp);
			transaction.begin();
			manager.persist(company);
			transaction.commit();
		} else {
			System.out.println("company not present");
		}
	}
	
	public void updateEmployee(int id,List<Skills>skill) {
		Employee employee=manager.find(Employee.class, id);
		if (employee!=null) {
			employee.getSkills().addAll(skill);
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
		} else {
			System.out.println("employee not present");
		}
	}
	
	public void deleteSkill(int eid,int sid) {
		Employee employee=manager.find(Employee.class, eid);
		Skills skills=manager.find(Skills.class, sid);
		if (employee!=null) {
			employee.getSkills().remove(skills);
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
		} else {
			System.out.println("employee not present");
		}
	}
	
	public void deleteEmployee(int cid,int eid) {
		Company company=manager.find(Company.class, cid);
		Employee employee=manager.find(Employee.class, eid);
		if (company!=null) {
			company.getEmployee().remove(employee);
			transaction.begin();
			manager.persist(company);
			transaction.commit();
		} else {
			System.out.println("company not present");
		}
	}
}
