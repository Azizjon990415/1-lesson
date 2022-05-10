package uz.lab.lesson.service;

import org.springframework.stereotype.Service;
import uz.lab.lesson.DTO.NameDTO;

import java.util.ArrayList;

@Service
public class NameService {
    private final ArrayList<String> names =new ArrayList<String>(){{
        add("Asadbek");
        add("Shirina");
        add("Safia");
        add("Abdulaziz");
    }};

    public ArrayList<String> getNames(){
        return names;
    }


    public String addName(NameDTO nameDTO) {
        names.add(nameDTO.getName());
        if (names.contains(nameDTO.getName())){
            return "Saved new name " + nameDTO.getName();
        } else {
            return "New name not saved " + nameDTO.getName();
        }
    }

    public String updateName(Integer index, NameDTO nameDTO) {
        names.remove(index.intValue());
        names.add(index,nameDTO.getName());
        return "the data updated";
    }

    public String deleteName(int index) {
        names.remove(index);
        return "Data removed";
    }
}
