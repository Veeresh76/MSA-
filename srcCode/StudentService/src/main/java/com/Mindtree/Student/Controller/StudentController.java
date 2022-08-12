package com.Mindtree.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mindtree.Student.Entity.Student;
import com.Mindtree.Student.StudentServicesImpli.StudentServices;

@RestController
public class StudentController {

	@Autowired
	StudentServices studentServices;


	@GetMapping("/test")
	public String test() {
		studentServices.test();
		return "done";
	}

	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student s) {
		return new ResponseEntity<Student> (studentServices.addStudent(s),HttpStatus.OK);
	}
	//Update student by id
	@PostMapping("/upStudent/{id}")
	public ResponseEntity<Student> updateStudentbyId(@PathVariable ("id") int id,@RequestBody Student s ) {
		return new ResponseEntity<Student> (studentServices.updateStudentsbyId(id, s),HttpStatus.OK);
	}

	@GetMapping("/Student/{id}")
	public ResponseEntity<Student> getStudentbyId(@PathVariable ("id") int id) {
		return new ResponseEntity<Student> (studentServices.getStuById(id),HttpStatus.OK);
	}
	@GetMapping("/allStudent")
	public ResponseEntity<List<Student>> getSAllStudent() {
		return new ResponseEntity<List<Student> >(studentServices.getAllStudents(),HttpStatus.OK);
	}

	//returns sorts based on Age
	@GetMapping("/StuSBA/{cid}")
	public ResponseEntity<List<Student>> getStudentSBA(@PathVariable ("cid") int cid) {
		return new ResponseEntity<List<Student> >(studentServices.getStudentbyDidSBA(cid),HttpStatus.OK);
	}


	//returns sorts based on Name
	@GetMapping("/StuSBN/{cid}")
	public ResponseEntity<List<Student>> getStudentSBN(@PathVariable ("cid") int cid) {
		return new ResponseEntity<List<Student> >(studentServices.getStudentbyDidSBN(cid),HttpStatus.OK);
	}




}
