package uz.lab.lesson.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {
    @GetMapping("car")
    public String car() {
        return "Get mapping used for getting data";
    }

    @PostMapping("car")
    public String saveData() {
        return "POST mapping used for saving data";
    }

    @PutMapping("car")
    public String editData() {
        return "PUT mapping used for editing data";
    }

    @DeleteMapping("car")
    public String deleteData() {
        return "Delete mapping used for delete or remove data";
    }
}

