package com.Mindtree.Collage.ServicesImpli;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Mindtree.Collage.Entity.Collage;
import com.Mindtree.Collage.Entity.Student;
import com.Mindtree.Collage.Repository.CollageRepositorys;


@Service
public class CollageServices {
	
	@Autowired
	CollageRepositorys collageRepositorys;
	
	@Autowired
	RestTemplate	restTemplate;
	
	public void addCollagessss() {
		Collage c1 = new Collage(101,"ABC",10);
		Collage c2 = new Collage(102,"BCD",10);
		Collage c3 = new Collage(103,"NGF",10);
		collageRepositorys.save(c1);
		collageRepositorys.save(c2);
		collageRepositorys.save(c3);
		
	}
	

	

	//SBA
	public Collage clgByIdSBA(int id) {
		Collage d=collageRepositorys.findById(id).get();
		try {
		     
			List<Student> l =restTemplate.getForObject("http://STUDENT-SERVICE/StuSBA/"+id,List.class);
			                                      
			d.setStudents(l);
			d.setTotalNorOfStudents(l.size()); 
			collageRepositorys.save(d);
			return d;}
		catch(Exception e) {
		e.printStackTrace();
		}
		return d;
	}
	
	

		public Collage clgByIdSBN(int id) {
			Collage d= collageRepositorys.findById(id).get();
			try {
			
				List<Student> l =restTemplate.getForObject("http://STUDENT-SERVICE/StuSBN/"+id,List.class);

				d.setStudents(l);
				d.setTotalNorOfStudents(l.size()); 
				collageRepositorys.save(d);
				return d;}
			catch(Exception e) {
			e.printStackTrace();
			}
			return null;
		}



// Collage by ID
		public Collage clgById(int id) {
			
			return collageRepositorys.findById(id).get();
		}




		public Collage addcollage(Collage c) {
			collageRepositorys.save(c);
			return c;
		}




		public Collage Updatecollage(Collage c) {
			Collage c1=collageRepositorys.findById(c.getId()).get();
			c1.setName(c.getName());
			c1.setStudents(c.getStudents());
			c1.setTotalNorOfStudents(c.getTotalNorOfStudents());
			collageRepositorys.save(c1);
		
			return c1;
		}




		public Collage deletecollageById(int id) {
			Collage c=collageRepositorys.findById(id).get();
			collageRepositorys.delete(c);
			return c;
		}
	
	
}
