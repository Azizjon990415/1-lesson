package uz.lab.lesson.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "Get mapping used for getting data";
    }
    @PostMapping("hello")
    public String saveData(){
        return "POST mapping used for saving data";
    }
    @PutMapping("hello")
    public String editData(){
        return "PUT mapping used for editing data";
    }
    @DeleteMapping("hello")
    public String deleteData(){
        return "Delete mapping used for delete or remove data";
    }
}
