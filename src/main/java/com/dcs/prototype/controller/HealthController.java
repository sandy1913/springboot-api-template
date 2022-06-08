package com.dcs.prototype.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {


    @GetMapping("/")
    public ResponseEntity<?> ebhealth(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity<?> health(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
