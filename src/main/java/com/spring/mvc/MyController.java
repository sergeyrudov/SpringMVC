package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("askDetails")
    public String askEmployeeDetails(Model model) {
        /*Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setSurname("Petrov");
        employee.setSalary(10);
        employee.setDepartment("IT");*/

        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }
    

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            String name = employee.getName();
            employee.setName("Mr: " + name);

            String surname = employee.getSurname();
            employee.setSurname(surname + " !");

            return "show-emp-details-view";
        }
    }
}
