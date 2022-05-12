package uz.lab.lesson.service;

import org.springframework.stereotype.Service;
import uz.lab.lesson.DTO.ToDoDTOShirina;
import uz.lab.lesson.domain.Status;
import uz.lab.lesson.domain.ToDo;

import java.util.ArrayList;

@Service
public class ToDoServiceShirina {
    private static final ArrayList<ToDo> todos = new ArrayList<>();


    public String addToDO(ToDoDTOShirina toDoDTOShirina) {
        ToDo toDo = new ToDo(
                toDoDTOShirina.getTitle(),
                toDoDTOShirina.getDescription(),
                toDoDTOShirina.getOwnerName(),
                Status.PLANNED
        );
        todos.add(toDo);
        return "Saved new todo";
    }

    public ArrayList<ToDoDTOShirina> getToDos() {
        ArrayList<ToDoDTOShirina> arrayList = new ArrayList<>();
        for (ToDo toDo : todos) {
            ToDoDTOShirina toDoDTOShirina = new ToDoDTOShirina(
                    toDo.getTitle(),
                    toDo.getDescription(),
                    toDo.getOwnerName()
            );
            arrayList.add(new ToDoDTOShirina());
        }
        return arrayList;
    }

    public String deleteToDo(int index) {
        todos.remove(index);
        return "Data removed";
    }
}
