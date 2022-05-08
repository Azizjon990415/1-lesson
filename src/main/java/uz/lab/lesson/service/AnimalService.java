package uz.lab.lesson.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnimalService {
    private static final ArrayList<String> animalservcie =new ArrayList<String>(){{
        add("elephant");
        add("cat");
        add("puppies");
        add("panda");
        add("ginger-cat");
    }};
        public ArrayList<String> getAnimalservcie(){  return animalservcie; }

        }



