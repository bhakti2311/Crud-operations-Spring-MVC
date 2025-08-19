package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ServiceI.HomeServiceI;
import com.model.Student;

@Controller
public class HomeController {
	
	@Autowired
	HomeServiceI hsi;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/openreg")
	public String preregister()
	{
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveStudent(@ModelAttribute Student s)
	{
		hsi.saveStudent(s);
		return "login";
	}
	
	@RequestMapping("/log")
	public String login(@RequestParam("username") String username,@RequestParam("password") String password,Model m)
	{
		if(username.equals("admin") && password.equals("admin"))
		{
			List<Student> l=hsi.getStudents();
			m.addAttribute("data", l);
			return "Success";
		}
		else
		{
			return "login";
		}
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("rollno") int rollno,Model m)
	{
		hsi.deleteStudent(rollno);
		List<Student> l = hsi.getStudents();
		
		m.addAttribute("data", l);
		return "Success";
	}
	
	@RequestMapping("/edit")
	public String editStudent(@RequestParam("rollno") int rollno,Model m)
	{
		Student s=hsi.editStudent(rollno);
		m.addAttribute("stu", s);
		return "update";
	}
	
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s,Model m)
	{
		hsi.updateStudent(s);
		List<Student> l = hsi.getStudents();
		m.addAttribute("data", l);
		return "Success";
	}
	
}
