package uz.lab.lesson.service;

import org.springframework.stereotype.Service;
import uz.lab.lesson.DTO.AnimalDTO;

import java.util.ArrayList;

@Service
public class AnimalService {
    private static final ArrayList<String> animalservcie = new ArrayList<String>() {{
        add("elephant");
        add("cat");
        add("puppies");
        add("panda");
        add("ginger-cat");
    }};

    public ArrayList<String> getAnimalservcie() {
        return animalservcie;
    }

    public String saveAnimal(AnimalDTO name) {
        animalservcie.add(name.getAnimalName());
        return ("daa saved");
    }


    public String deleteAnimal(int index) {
        animalservcie.remove(index);
        return "Data removed";
    }

    public String getAnimal(int index) {
        return animalservcie.get(index);
    }
}




