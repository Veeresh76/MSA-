package com.Mindtree.Collage.Entity;




public class Student {

	private int id;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private String stream;

	
	
	
	
	public Student(int id, String name, int age, String gender, String stream, int cid) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.stream = stream;
		this.cid = cid;
	}

	public Student( String name, int age, String gender, String stream, int cid) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.stream = stream;
		this.cid = cid;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", stream=" + stream
				+ ", cid=" + cid + "]";
	}

	
	private int cid;

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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}
	

	

	
	
}
