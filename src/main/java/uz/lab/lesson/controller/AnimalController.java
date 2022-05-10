package uz.lab.lesson.controller;

import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.lab.lesson.DTO.AnimalDTO;
import uz.lab.lesson.service.AnimalService;

import java.util.ArrayList;

@RestController
public class AnimalController {
    @Autowired
    AnimalService animalService;

    @GetMapping("api/animal")
    public ArrayList<String> animals() {
        return animalService.getAnimalservcie();
    }

    @PostMapping("api/animal")
    public String saveAnimal(@RequestBody AnimalDTO name){
        return animalService.saveAnimal(name);
    }
    @DeleteMapping("api/animal/{index}")
    public String deleteAnimal(@PathVariable int index) {
        return animalService.deleteAnimal(index);

    }
    }
