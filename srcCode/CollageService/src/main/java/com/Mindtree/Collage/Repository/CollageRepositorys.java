package com.Mindtree.Collage.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Mindtree.Collage.Entity.Collage;

@Repository
public interface CollageRepositorys  extends CrudRepository<Collage, Integer> {

}
