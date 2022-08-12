package com.Mindtree.Collage.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mindtree.Collage.Entity.Collage;
import com.Mindtree.Collage.ServicesImpli.CollageServices;


@RestController
public class CollageServiceController {

	@Autowired
	CollageServices collageServices;
	
	
	@GetMapping("/test")
	public String test() {
	collageServices.addCollagessss();
		return "done";
	}
	
	//Collage by id
	@GetMapping("/Collage/{id}")
	public ResponseEntity<Collage> getCollageById(@PathVariable ("id") int id){
		return new ResponseEntity<Collage>(collageServices.clgById(id),HttpStatus.OK);
	}
	//Add Collage
	@PostMapping("/addCollage")
	public ResponseEntity<Collage> addCollage(@RequestBody Collage c){
		return new ResponseEntity<Collage>(collageServices.addcollage(c),HttpStatus.OK);
	}
	
	//Update Collage by Id
	@PutMapping("/upCollage/{id}")
	public ResponseEntity<Collage> addCollage(@RequestBody Collage c,@PathVariable ("id") int id){
		return new ResponseEntity<Collage>(collageServices.Updatecollage(c),HttpStatus.OK);
	}
	//Delete Collage by Id
	@DeleteMapping("/Collage/{id}")
	public ResponseEntity<Collage> deleteCollage(@PathVariable ("id") int id){
		return new ResponseEntity<Collage>(collageServices.deletecollageById(id),HttpStatus.OK);
	}
	
	//ordered by Age
	@GetMapping("/CollageSBA/{id}")
	public ResponseEntity<Collage> CollageSBA(@PathVariable ("id") int id){
		return new ResponseEntity<Collage>(collageServices.clgByIdSBN(id),HttpStatus.OK);
	}
	
	//Ordered by Name
		@GetMapping("/CollageSBN/{id}")
		public ResponseEntity<Collage> CollageSBN(@PathVariable ("id") int id){
			return new ResponseEntity<Collage>(collageServices.clgByIdSBA(id),HttpStatus.OK);
		}
	
	
}
