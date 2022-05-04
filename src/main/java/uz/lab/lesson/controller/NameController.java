package uz.lab.lesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.lab.lesson.service.NameService;

import java.util.ArrayList;

@RestController()
public class NameController {
    @Autowired
    NameService nameService;

    @GetMapping("api/name")
    public ArrayList<String> names(){
        return  nameService.getNames();
    }
}
