package uz.lab.lesson.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {
    private String title;
    private String description;
    private String ownerName;
    private Status status;
}
