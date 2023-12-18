package onetomanybie3.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybie3.dao.CompanyDao;
import onetomanybie3.dao.EmployeeDao;
import onetomanybie3.dto.Company;
import onetomanybie3.dto.Employee;

public class CompanyEmpCont {
	public static void main(String[] args) {
//	Company company=new Company();
//	company.setId(2);
//	company.setName("TYSS");
//	company.setGst("tyss@123");
//	
//	Employee employee1=new Employee();
//	employee1.setId(11);
//	employee1.setName("Ravali");
//	employee1.setAddress("chennai");
//	employee1.setCompany(company);
//	
//	Employee employee2=new Employee();
//	employee2.setId(12);
//	employee2.setName("hima");
//	employee2.setAddress("bangalore");
//	employee2.setCompany(company);
//	
//	List<Employee> employees=new ArrayList<Employee>();
//	employees.add(employee1);
//	employees.add(employee2);
//	
//	company.setEmployees(employees);
//	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.saveCompany(company);
//	
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.saveEmployee(employee2);
//	employeeDao.saveEmployee(employee1);

		EmployeeDao employeeDao = new EmployeeDao();
//		employeeDao.findEmployee(1);

		CompanyDao companyDao = new CompanyDao();
//		companyDao.findCompany(1);
		
//		employeeDao.deleteEmployee(1);
		companyDao.deleteCompany(1);

	}
}
