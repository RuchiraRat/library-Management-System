package com.cw.library.service;

import com.cw.library.dto.BorrowDTO;
import com.cw.library.dto.BorrowSaveDTO;
import com.cw.library.dto.BorrowUpdateDTO;

import java.util.List;

public interface BorrowService {
    String addBorrow(BorrowSaveDTO borrowSaveDTO);

    List<BorrowDTO> getAllBorrow();

    String updateBorrow(BorrowUpdateDTO borrowUpdateDTO);
}
