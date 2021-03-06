package com.rutvikpatel.springmvc3.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rutvikpatel.springmvc3.helloworld.bean.Employee;


@Controller
public class EmployeeController {
	
    //url: http://localhost:8080/spring-web/employee
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView employee() {
		return new ModelAndView("employeeForm", "command", new Employee());
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("SpringWeb")Employee employee, ModelMap model) {
		model.addAttribute("name", employee.getName());
		model.addAttribute("age", employee.getAge());
		model.addAttribute("empId", employee.getEmpId());
		model.addAttribute("salary", employee.getSalary());
		return "employeeDetail";
	}
}
