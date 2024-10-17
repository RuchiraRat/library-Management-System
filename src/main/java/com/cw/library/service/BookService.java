package com.cw.library.service;

import com.cw.library.dto.BookDTO;
import com.cw.library.dto.BookSaveDTO;
import com.cw.library.dto.BookUpdateDTO;

import java.util.List;

public interface BookService {
    String addBook(BookSaveDTO bookSaveDTO);

    List<BookDTO> getAllBook();

    String updateBook(BookUpdateDTO bookUpdateDTO);

    String deleteBook(int id);
}
