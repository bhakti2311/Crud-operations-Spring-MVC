package com.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class HomeRepository {
	
	List<Student> l =  new ArrayList();
	
	public void saveStudent(Student s)
	{
		l.add(s);
	}
	
	public List<Student> getStudents()
	{
		return l;
	}
	
	public void deleteStudent(int rollno) 
	{
		int d = 0;
		for (Student s : l) {
			 if(s.getRollno() == rollno)
			 {
				d = l.indexOf(s);
			 }
		}
		l.remove(d);
		
	}
	
	public Student editStudent(int rollno) 
	{
		Student s1 = null;
		for (Student s : l) {
			if(s.getRollno()==rollno)
			{
				int d =l.indexOf(s);
				s1 =l.get(d);
			}
			
		}
		
		return s1;
	}
	
	public void updateStudent(Student s) 
	{
		for (Student s1 : l) {
			if (s1.getRollno()==s.getRollno()) {
				
			int d =l.indexOf(s1);
			l.set(d, s);
			break;
				
			}
		}
		
	}
}
