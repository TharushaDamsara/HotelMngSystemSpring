package com.example.HotelMngmentSystem_Spring.service;

import com.example.HotelMngmentSystem_Spring.entity.Guest;
import java.util.List;

public interface GuestService {
    Guest saveGuest(Guest guest);
    Guest getGuestById(Long id);
    List<Guest> getAllGuests();
    Guest updateGuest(Long id, Guest guest);
    void deleteGuest(Long id);
}

