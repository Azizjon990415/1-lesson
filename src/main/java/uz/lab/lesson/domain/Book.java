package uz.lab.lesson.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Book {
        private String title;
        private String description;
        private String writter;
        private Integer year;

    }
