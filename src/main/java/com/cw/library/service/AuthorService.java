package com.cw.library.service;

import com.cw.library.dto.AuthorDTO;
import com.cw.library.dto.AuthorSaveDTO;
import com.cw.library.dto.AuthorUpdateDTO;

import java.util.List;

public interface AuthorService {

    String addAuthor(AuthorSaveDTO authorSaveDTO);

    List<AuthorDTO> getAllAuthor();

    String updateAuthor(AuthorUpdateDTO authorUpdateDTO);

    String deleteAuthor(int id);
}
