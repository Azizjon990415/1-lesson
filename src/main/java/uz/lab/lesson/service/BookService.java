package uz.lab.lesson.service;

import org.springframework.stereotype.Service;
import uz.lab.lesson.DTO.BookDTO;
import uz.lab.lesson.domain.Book;

import java.util.ArrayList;



    @Service
    public class BookService {
        private static final ArrayList<Book> Books = new ArrayList<>();

        public static String deleteBook(int index) {
            return null;
        }


        public static String addBook(BookDTO BookDTO) {
            Book book=new Book(
                    BookDTO.getTitle(),
                    BookDTO.getDescription(),
                    BookDTO.getWriter(),
                    BookDTO.getYear(),
                    true
            );
            Books.add(book);
            return "Saved new book";
        }

        public static ArrayList<BookDTO> getBooks() {
            ArrayList<BookDTO> arrayList=new ArrayList<>();
            for (Book book:Books) {
                BookDTO bookDTO = new BookDTO(
                        book.getTitle(),
                        book.getDescription(),
                        book.getWritter(),
                        book.getYear(),
                        book.getAvailable()
                        );
                arrayList.add(bookDTO);
            }
            return arrayList;
        }

        public String setAvailable(int index, Boolean available) {
            Book book = Books.remove(index);
            book.setAvailable(available);
            Books.add(index,book);
            if (available){
                return  "Book returned";
            } else {
                return "Book rented";
            }
        }
    }
