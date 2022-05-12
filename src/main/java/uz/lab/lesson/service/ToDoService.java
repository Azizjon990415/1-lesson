package uz.lab.lesson.service;

import org.springframework.stereotype.Service;
import uz.lab.lesson.DTO.ToDoDTO;
import uz.lab.lesson.domain.Status;
import uz.lab.lesson.domain.ToDo;

import java.util.ArrayList;

@Service
public class ToDoService {
    private static final ArrayList<ToDo> todos = new ArrayList<>();

    public static String deleteToDo(int index) {
        return null;
    }


    public String addToDO(ToDoDTO toDoDTO) {
        ToDo toDo=new ToDo(
                toDoDTO.getTitle(),
                toDoDTO.getDescription(),
                toDoDTO.getOwnerName(),
                Status.PLANNED
        );
        todos.add(toDo);
        return "Saved new todo";
    }

    public ArrayList<ToDoDTO> getToDos() {
        ArrayList<ToDoDTO> arrayList=new ArrayList<>();
        for (ToDo toDo:todos) {
            ToDoDTO toDoDTO = new ToDoDTO(
                    toDo.getTitle(),
                    toDo.getDescription(),
                    toDo.getOwnerName()
            );
            arrayList.add(toDoDTO);
        }
        return arrayList;
    }
}
