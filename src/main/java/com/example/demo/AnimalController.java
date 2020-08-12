package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    AnimalRepository repository;

    @GetMapping("/create/{name}")
    public String create(@PathVariable String name) {
        repository.save(new Animal(name));
        return "Animal created successful";
    }

    @GetMapping("/findall")
    public List<Animal> findAll() {
        List<Animal> animals = repository.findAll();
        return animals;
    }
}
