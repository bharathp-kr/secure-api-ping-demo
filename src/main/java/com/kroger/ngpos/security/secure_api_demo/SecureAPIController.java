package com.kroger.ngpos.security.secure_api_demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureAPIController {


    @GetMapping("/getinfo")
    public ResponseEntity<String> info(){
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }
}
