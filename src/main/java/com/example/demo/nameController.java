package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/personas")
public class nameController {
    @Autowired
    private nameInterface nameInterface;

    @GetMapping
    public List<nameEntity> personas(){
        return (List <nameEntity>) nameInterface.findAll();
    }


    /*@GetMapping(value ="/grett/{name}/{correo}/{edad}")
    public ResponseEntity<String>grett(@PathVariable ("name") String namePersona, @PathVariable("correo") String correoPersona, @PathVariable("edad") Integer edad){
        nameEntity insertar = new nameEntity();
        return new ResponseEntity<>( "Hello " +namePersona + correoPersona + edad, HttpStatus.OK);
    }*/

}
