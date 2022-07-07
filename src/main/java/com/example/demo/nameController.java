package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {
    @GetMapping(value ="/grett/{name}/{correo}/{edad}")
    public ResponseEntity<String>grett(@PathVariable ("name") String name, @PathVariable("correo") String correo, @PathVariable("edad") int edad){
        ConnectionMysql resultSet;
        return new ResponseEntity<>( "Hello " +name + correo + edad, HttpStatus.OK);
    }
}
