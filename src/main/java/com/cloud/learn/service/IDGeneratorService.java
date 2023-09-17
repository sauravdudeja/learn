package com.cloud.learn.service;

import com.cloud.learn.entities.IdGen;
import com.cloud.learn.repo.IdRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@Slf4j
public class IDGeneratorService {

    @Autowired
    private IdRepo idRepo;

    public void generateId() {
        idRepo.save(new IdGen(2L, new Date()));
    }

    public void savedData() {
        Optional<IdGen> storedKV = idRepo.findById(2L);
        log.info("Get key :{}, value :{}", storedKV.get().getId(), storedKV.get().getCreated());
    }

}
