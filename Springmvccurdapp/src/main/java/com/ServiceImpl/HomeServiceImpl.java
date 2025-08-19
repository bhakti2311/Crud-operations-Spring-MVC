package com.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.HomeRepository;
import com.ServiceI.HomeServiceI;
import com.model.Student;

@Service
public class HomeServiceImpl implements HomeServiceI {
	
	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveStudent(Student s) {
		
		hr.saveStudent(s);
		
	}
	
	@Override
	public List<Student> getStudents()
	{
		List<Student> l =hr.getStudents();
		return l;
	}

	@Override
	public void deleteStudent(int rollno) 
	{
		hr.deleteStudent(rollno);
		
	}

	@Override
	public Student editStudent(int rollno) 
	{
		
		Student s=hr.editStudent(rollno);
		return s;
	}

	@Override
	public void updateStudent(Student s) 
	{
		
		hr.updateStudent(s);
	}

}
