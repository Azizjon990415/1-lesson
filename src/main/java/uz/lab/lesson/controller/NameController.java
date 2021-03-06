package uz.lab.lesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("api/name/{index}")
    public String getName(@PathVariable int index){
        return  nameService.getName(index);
    }

    @PostMapping("api/name")
    public String saveName(@RequestBody NameDTO  nameDTO){
        return nameService.addName(nameDTO);
    }

    @PutMapping("api/name/{index}")
    public String updateName(@PathVariable Integer index, @RequestBody NameDTO nameDTO){
        return nameService.updateName(index, nameDTO);
    }

    @DeleteMapping("api/name/{index}")
    public String deleteName(@PathVariable int index){
        return  nameService.deleteName(index);
    }
}
