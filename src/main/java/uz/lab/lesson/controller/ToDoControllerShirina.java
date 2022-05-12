package uz.lab.lesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.lab.lesson.DTO.ToDoDTOShirina;
import uz.lab.lesson.service.ToDoService;
import uz.lab.lesson.service.ToDoServiceShirina;

import java.util.ArrayList;
@RestController


public class ToDoControllerShirina {
    @Autowired
    ToDoServiceShirina toDoServiceShirina;
    @PostMapping("api/todo")
    public String createTodo(@RequestBody ToDoDTOShirina toDoDTOShirina){
        return toDoServiceShirina.addToDO(toDoDTOShirina);
    }

    @GetMapping("api/todo")
    public ArrayList<ToDoDTOShirina> getToDos(){
        return toDoServiceShirina.getToDos();
    }

    @DeleteMapping("api/name/{index}")
    public String deleteToDo(@PathVariable int index) {
        return ToDoService.deleteToDo(index);
    }
}