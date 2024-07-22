package com.crio.rentread.service;

import com.crio.rentread.entity.RentalBook;
import com.crio.rentread.entity.User;
import com.crio.rentread.model.CustomUserDetails;
import com.crio.rentread.service.implementation.CustomUserDetailsService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.util.List;
import java.util.Optional;

public interface RentalService {
    RentalBook takeBook(Long rentalBook, User user);
    List<RentalBook> rentedBooks();
    Object rentedBookById(Long id);
    void userRentedBook(Long id);
    Object bookRentedToUser(Long id);
    boolean returnBook(Long rentalBook, User user);
}
