package com.cw.library.service.IMPL;


import com.cw.library.dto.AuthorDTO;
import com.cw.library.dto.PublisherDTO;
import com.cw.library.dto.PublisherSaveDTO;
import com.cw.library.dto.PublisherUpdateDTO;
import com.cw.library.entity.Author;
import com.cw.library.entity.Publisher;
import com.cw.library.repo.PublisherRepo;
import com.cw.library.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherServiceIMPL implements PublisherService {

    @Autowired
    private PublisherRepo publisherRepo;


    @Override
    public String addPublisher(PublisherSaveDTO publisherSaveDTO) {

        Publisher publisher = new Publisher(
                publisherSaveDTO.getName()

        );
        publisherRepo.save(publisher);
        return publisher.getName();

    }

    @Override
    public List<PublisherDTO> getAllPublisher() {

        List<Publisher> getPublishers = publisherRepo.findAll();
        List<PublisherDTO> PublisherDTOList = new ArrayList<>();

        for (Publisher publisher : getPublishers)
        {
            PublisherDTO publisherDTO = new PublisherDTO(
                    publisher.getPublisherid(),
                    publisher.getName()
            );
            PublisherDTOList.add(publisherDTO);
        }

        return PublisherDTOList;
    }

    @Override
    public String updatePublisher(PublisherUpdateDTO publisherUpdateDTO) {


        if (publisherRepo.existsById(publisherUpdateDTO.getPublisherid()))
        {
            Publisher publisher = publisherRepo.getById(publisherUpdateDTO.getPublisherid());
            publisher.setName(publisherUpdateDTO.getName());

            publisherRepo.save(publisher);
            return publisher.getName();
        } else {
            System.out.println("publisher ID Not Exist");
        }
        return null;

        
    }

    @Override
    public String deletePublisher(int id) {

        if(publisherRepo.existsById(id))
        {
            publisherRepo.deleteById(id);
        }
        else
        {
            System.out.println("ID Not Found");
        }




        return null;
    }
}
