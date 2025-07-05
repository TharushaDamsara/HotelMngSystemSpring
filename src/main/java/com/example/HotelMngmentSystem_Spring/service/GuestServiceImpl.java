package com.example.HotelMngmentSystem_Spring.service;

import com.example.HotelMngmentSystem_Spring.entity.Guest;
import com.example.HotelMngmentSystem_Spring.repository.GuestRepository;
import com.example.HotelMngmentSystem_Spring.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public Guest getGuestById(Long id) {
        return guestRepository.findById(id).orElse(null);
    }

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @Override
    public Guest updateGuest(Long id, Guest updatedGuest) {
        Optional<Guest> existingGuestOpt = guestRepository.findById(id);
        if (existingGuestOpt.isPresent()) {
            Guest existingGuest = existingGuestOpt.get();
            existingGuest.setFullName(updatedGuest.getFullName());
            existingGuest.setEmail(updatedGuest.getEmail());
            existingGuest.setPhone(updatedGuest.getPhone());
            existingGuest.setAddress(updatedGuest.getAddress());
            existingGuest.setNationality(updatedGuest.getNationality());
            existingGuest.setCheckInDate(updatedGuest.getCheckInDate());
            existingGuest.setCheckOutDate(updatedGuest.getCheckOutDate());
            return guestRepository.save(existingGuest);
        } else {
            return null;
        }
    }

    @Override
    public void deleteGuest(Long id) {
        guestRepository.deleteById(id);
    }
}

