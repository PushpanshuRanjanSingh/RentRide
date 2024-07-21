package com.crio.rentread.service;

import com.crio.rentread.entity.RentalBook;
import com.crio.rentread.entity.User;
import com.crio.rentread.model.CustomUserDetails;
import com.crio.rentread.service.implementation.CustomUserDetailsService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

public interface RentalService {
    RentalBook takeBook(Long rentalBook, User user);
    boolean returnBook(Long rentalBook, User user);
}
