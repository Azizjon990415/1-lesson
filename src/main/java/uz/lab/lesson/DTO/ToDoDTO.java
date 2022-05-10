package uz.lab.lesson.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDTO {
    private String title;
    private String description;
    private String ownerName;
}
