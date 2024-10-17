package com.cw.library.dto;

import com.cw.library.entity.Author;
import com.cw.library.entity.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookSaveDTO {

    private String title;


    private int author_id;

    private int publisher_id;
}
