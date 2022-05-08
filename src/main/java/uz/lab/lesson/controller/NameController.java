package uz.lab.lesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.lab.lesson.DTO.NameDTO;
import uz.lab.lesson.service.NameService;

import java.util.ArrayList;

@RestController
public class NameController {
    @Autowired
    NameService nameService;

    @GetMapping("api/name")
    public ArrayList<String> names(){
        return  nameService.getNames();
    }
    @PostMapping("api/name")
    public String saveName(@RequestBody NameDTO  nameDTO){
        return nameService.addName(nameDTO);
    }
}
