package com.Mindtree.Collage.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Collage {

	@Id
private	int id;
	
private	String name;
	
private	int totalNorOfStudents;

@Transient
List<Student> students;

public Collage() {
	super();
	
}

public Collage(int id, String name, int totalNorOfStudents, List<Student> students) {
	super();
	this.id = id;
	this.name = name;
	this.totalNorOfStudents = totalNorOfStudents;
	this.students = students;
}

public Collage(int id, String name, int totalNorOfStudents) {
	super();
	this.id = id;
	this.name = name;
	this.totalNorOfStudents = totalNorOfStudents;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getTotalNorOfStudents() {
	return totalNorOfStudents;
}

public void setTotalNorOfStudents(int totalNorOfStudents) {
	this.totalNorOfStudents = totalNorOfStudents;
}

public List<Student> getStudents() {
	return students;
}

public void setStudents(List<Student> students) {
	this.students = students;
}

@Override
public String toString() {
	return "Collage [id=" + id + ", name=" + name + ", totalNorOfStudents=" + totalNorOfStudents + ", students="
			+ students + "]";
}







}
