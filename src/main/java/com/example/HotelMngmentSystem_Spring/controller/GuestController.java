package com.example.HotelMngmentSystem_Spring.controller;


import com.example.HotelMngmentSystem_Spring.entity.Guest;
import com.example.HotelMngmentSystem_Spring.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
@CrossOrigin // Allow frontend (HTML/JS) to access
public class GuestController {

    @Autowired
    private GuestService guestService;

    @PostMapping
    public Guest createGuest(@RequestBody Guest guest) {
        return guestService.saveGuest(guest);
    }

    @GetMapping("/{id}")
    public Guest getGuestById(@PathVariable Long id) {
        return guestService.getGuestById(id);
    }

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @PutMapping("/{id}")
    public Guest updateGuest(@PathVariable Long id, @RequestBody Guest guest) {
        return guestService.updateGuest(id, guest);
    }

    @DeleteMapping("/{id}")
    public void deleteGuest(@PathVariable Long id) {
        guestService.deleteGuest(id);
    }
}

