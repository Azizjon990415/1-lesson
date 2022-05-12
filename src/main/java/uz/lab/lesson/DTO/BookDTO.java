package uz.lab.lesson.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class BookDTO {
        private String title;
        private String description;
        private String writer;
        private Integer year;
        private Boolean available;

}
