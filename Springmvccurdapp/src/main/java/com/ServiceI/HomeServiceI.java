package com.ServiceI;

import java.util.List;

import com.model.Student;

public interface HomeServiceI {
	
	public void saveStudent(Student s);
	public List<Student> getStudents();
	public void deleteStudent(int rollno);
	public Student editStudent(int rollno);
	public void updateStudent(Student s);
}
