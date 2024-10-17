package com.cw.library.service.IMPL;

import com.cw.library.dto.BookDTO;
import com.cw.library.dto.BorrowDTO;
import com.cw.library.dto.BorrowSaveDTO;
import com.cw.library.dto.BorrowUpdateDTO;
import com.cw.library.entity.Book;
import com.cw.library.entity.Borrow;
import com.cw.library.repo.BookRepo;
import com.cw.library.repo.BorrowRepo;
import com.cw.library.repo.UserRepo;
import com.cw.library.service.BookService;
import com.cw.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowServiceIMPL implements BorrowService {


    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BorrowRepo borrowRepo;


    @Override
    public String addBorrow(BorrowSaveDTO borrowSaveDTO) {


        Borrow borrow = new Borrow(


        bookRepo.getById(borrowSaveDTO.getBook_id()),
        userRepo.getById(borrowSaveDTO.getUser_id()),
        borrowSaveDTO.getBorrowDate(),
        borrowSaveDTO.getReturnDate()

        );
        borrowRepo.save(borrow);

        return null;
    }

    @Override
    public List<BorrowDTO> getAllBorrow() {

        List<Borrow> getBorrow = borrowRepo.findAll();
        List<BorrowDTO> borrowDTOList = new ArrayList<>();

        for (Borrow borrow : getBorrow)
        {
            BorrowDTO borrowDTO = new BorrowDTO(
                    borrow.getId(),
                    borrow.getBook(),
                    borrow.getUser(),
                    borrow.getBorrowDate(),
                    borrow.getReturnDate()

            );
            borrowDTOList.add(borrowDTO);
        }


        return borrowDTOList;

    }

    @Override
    public String updateBorrow(BorrowUpdateDTO borrowUpdateDTO) {

        if(borrowRepo.existsById(borrowUpdateDTO.getId())) {
            Borrow borrow = borrowRepo.getById(borrowUpdateDTO.getId());
            borrow.setBook(bookRepo.getById(borrowUpdateDTO.getBook_id()));
            borrow.setUser(userRepo.getById(borrowUpdateDTO.getUser_id()));
            borrow.setBorrowDate(borrowUpdateDTO.getBorrowDate());
                    borrowUpdateDTO.setBorrowDate(borrow.getBorrowDate());

            borrowRepo.save(borrow);

        }
        else
        {
            System.out.println("Borrow ID not found");
        }

        return null;

    }
}
