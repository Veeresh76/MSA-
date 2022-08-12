package com.Mindtree.Student.Repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.Mindtree.Student.Entity.Student;
@Repository
public interface StudentRepository extends   CrudRepository<Student,Integer> {

	public List<Student> findByCid(Integer id);
}
