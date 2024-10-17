package com.cw.library.dto;

import com.cw.library.entity.Book;
import com.cw.library.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class BorrowSaveDTO {

    private int book_id;


    private int user_id;


    private LocalDate borrowDate;
    private LocalDate returnDate;
}
