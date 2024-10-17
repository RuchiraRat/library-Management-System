package com.cw.library.service;

import com.cw.library.dto.AuthorDTO;
import com.cw.library.dto.PublisherDTO;
import com.cw.library.dto.PublisherSaveDTO;
import com.cw.library.dto.PublisherUpdateDTO;

import java.util.List;

public interface PublisherService {
    String addPublisher(PublisherSaveDTO publisherSaveDTO);

    List<PublisherDTO> getAllPublisher();

    String updatePublisher(PublisherUpdateDTO publisherUpdateDTO);

    String deletePublisher(int id);
}
