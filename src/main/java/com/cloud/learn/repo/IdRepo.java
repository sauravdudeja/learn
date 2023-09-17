package com.cloud.learn.repo;

import com.cloud.learn.entities.IdGen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface IdRepo extends CrudRepository<IdGen, Long> {

}
