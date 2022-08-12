package com.Mindtree.Student.StudentServicesImpli;

import java.util.Collections;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mindtree.Student.Entity.Student;
import com.Mindtree.Student.Repository.StudentRepository;
import com.Mindtree.Student.Sorting.SortByAge;
import com.Mindtree.Student.Sorting.SortByName;


@Service
public class StudentServices {

	@Autowired
	StudentRepository studentRepository;
	
public 	void test() {
		Student s1=new Student("mark",23,"Male","Arts",101);
		Student s2=new Student("venus",24,"Male","Arts",101);
		Student s3=new Student("jones",27,"Male","Arts",101);
		Student s4=new Student("ravi",29,"Male","Arts",101);
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		studentRepository.save(s4);
		
		
		Student s5=new Student("niru",20,"FeMale","science",102);
		Student s6=new Student("loki",23,"FeMale","science",102);
		Student s7=new Student("vijay",24,"Male","science",102);
		Student s8=new Student("aadi",30,"Male","science",102);
		studentRepository.save(s5);
		studentRepository.save(s6);
		studentRepository.save(s7);
		studentRepository.save(s8);
		
		
		Student s9=new Student("aaru",24,"FeMale","Commerce",103);
		Student s10=new Student("sharan",26,"FeMale","Commerce",103);
		Student s11=new Student("raj",25,"Male","Commerce",103);
		Student s12=new Student("puneet",21,"Male","Commerce",103);
		studentRepository.save(s9);
		studentRepository.save(s10);
		studentRepository.save(s11);
		studentRepository.save(s12);
	}
	
	
	
	
	//returns sorts based on Age
public List<Student>getStudentbyDidSBA(int cid) {
		
	List<Student>ll= studentRepository.findByCid(cid);
	
	Collections.sort(ll,new SortByAge());
	
	return ll;
	}

//returns sorts based on Name
public List<Student>getStudentbyDidSBN(int cid) {
	
List<Student>ll= studentRepository.findByCid(cid);

Collections.sort(ll,new SortByName());

return ll;
}
	
//add student
	public Student addStudent(Student s) {
		
		return studentRepository.save(s);
	}

//grt student by id
	public Student getStuById(int id) {
		studentRepository.findById(id);
		return null;
	}




	public List<Student> getAllStudents() {
		
		List l=  (List) studentRepository.findAll() ;
		return l;
	}




	public Student updateStudentsbyId(int id, Student s) {
		Student s2=studentRepository.findById(id).get();
		if(!s.getName().equals(null))
			s2.setName(s.getName());
		if(s.getAge()>0)
			s2.setAge(s.getAge());
		if(!s.getGender().equals(null))
		s2.setGender(s.getGender());
		
		studentRepository.save(s2);
		return s2;
	}

}
