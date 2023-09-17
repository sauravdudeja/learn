package com.cloud.learn.controller;


import com.cloud.learn.service.IDGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/generator")
public class IdGeneratorController {

    private final IDGeneratorService idGeneratorService;

    @GetMapping("/generateId")
    public void generateId() {
        idGeneratorService.generateId();
    }

    @GetMapping("/savedData")
    public void savedData() {
        idGeneratorService.savedData();
    }

}
