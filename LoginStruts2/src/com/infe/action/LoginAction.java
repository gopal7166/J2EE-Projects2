package com.infe.action;

import com.info.model.Employee;
import com.info.service.EmployeeService;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction implements ModelDriven<Employee>
{
	private Employee emp=new Employee();
	
	public String execute()
	{        
		if(EmployeeService.verifyEmployee(emp))
			return "success";
		else
			return "failure";
	}
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return emp;
	}	
}
