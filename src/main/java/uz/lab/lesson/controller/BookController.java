package uz.lab.lesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.lab.lesson.DTO.BookDTO;
import uz.lab.lesson.service.BookService;

import java.util.ArrayList;


    @RestController
    public class BookController {
        @Autowired
        BookService bookService;

        @PostMapping("api/book")
        public String createBook(@RequestBody BookDTO BookDTO) {
            return BookService.addBook(BookDTO);
        }

        @GetMapping("api/book")
        public ArrayList<BookDTO> getBooKs() {
            return BookService.getBooks();
        }

        @GetMapping("api/book/change-status/{index}")
        public String changeBookAvailableStatus(@RequestParam Boolean available,@PathVariable int index){
            return bookService.setAvailable(index,available);
        }

    }

