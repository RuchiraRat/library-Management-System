package com.cw.library.dto;

import com.cw.library.entity.Author;
import com.cw.library.entity.Publisher;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO {


    private int bookid;


    private String title;


    private Author author;

    private Publisher publisher;
}
