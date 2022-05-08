package uz.lab.lesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.lab.lesson.service.AnimalService;

import java.util.ArrayList;

@RestController
public class AnimalController {
@Autowired
    AnimalService animalService;

@GetMapping ("api/animal")
public ArrayList<String> animals(){
    return  animalService.getAnimalservcie();
}

}
