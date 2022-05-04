package uz.lab.lesson.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NameService {
    private static final ArrayList<String> names =new ArrayList<String>(){{
        add("Asadbek");
        add("Shirina");
        add("Safia");
        add("Abdulaziz");
    }};
    public ArrayList<String> getNames(){
        return names;
    }
}
