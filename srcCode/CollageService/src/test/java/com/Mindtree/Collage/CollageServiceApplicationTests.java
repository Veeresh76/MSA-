package com.Mindtree.Collage;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.Mindtree.Collage.Repository.CollageRepositorys;
import com.Mindtree.Collage.ServicesImpli.CollageServices;

@SpringBootTest
class CollageServiceApplicationTests {

	 @Autowired
		CollageServices collageServices;
	 
	 @MockBean
		CollageRepositorys collageRepository;
	
	@Test
	void contextLoads() {
	List ll=	(List) collageRepository.findAll();
		assertEquals(ll.size(),0);
	}
}
