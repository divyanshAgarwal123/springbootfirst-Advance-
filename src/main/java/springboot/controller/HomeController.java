package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springboot.domain.Imploy;
import springboot.repository.EmployeeRepository;

@Controller
public class HomeController {
	
	@Autowired EmployeeRepository employeeRepository;
@RequestMapping("/signup")
public String display1()  {
	return "indexq";
}

	@RequestMapping("/home")
	public String show()  {
		return "index";
	}
	
	@RequestMapping(value="/addUser" , method=RequestMethod.POST)
	public String addUser(Model model , Imploy imploy)  {
		employeeRepository.save(imploy);
		model.addAttribute("employee",imploy);
		return "indexq";
	}
}


