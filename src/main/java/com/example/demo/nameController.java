package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/personas")

@CrossOrigin(origins = "http://localhost:4200/")
public class nameController {
    @Autowired
    private nameInterface nameInterface;

    @GetMapping
    public List<nameEntity> personas(){
        return (List <nameEntity>) nameInterface.findAll();
    }

    @PostMapping
    public void insertar (@RequestBody nameEntity nE){
        nameInterface.save(nE);
    }

    @PutMapping
    public void modificar (@RequestBody nameEntity nE){
        nameInterface.save(nE);
    }

    @DeleteMapping (value = "/{id}")
    public void eliminar (@PathVariable("id") Integer id){
        nameInterface.deleteById(id);
    }

}
