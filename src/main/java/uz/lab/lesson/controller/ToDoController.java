package uz.lab.lesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.lab.lesson.DTO.ToDoDTO;
import uz.lab.lesson.service.ToDoService;

import java.util.ArrayList;

@RestController
public class ToDoController {
    @Autowired
    ToDoService toDoService;
    @PostMapping("api/todo")
    public String createTodo(@RequestBody ToDoDTO toDoDTO){
        return toDoService.addToDO(toDoDTO);
    }

    @GetMapping("api/todo")
    public ArrayList<ToDoDTO> getToDos(){
        return toDoService.getToDos();
    }
}
