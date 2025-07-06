package com.example.HotelMngmentSystem_Spring.controller;

import com.example.HotelMngmentSystem_Spring.entity.Reservation;
import com.example.HotelMngmentSystem_Spring.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
@CrossOrigin

public class ReservationController {
    @Autowired
    private ReservationService service;

    @GetMapping
    public List<Reservation> getAllReservations(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable Long id){
        return service.getReserveById(id);
    }
    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation){
        return service.saveReservation(reservation);
    }
    @PostMapping("/{id}")
    public Reservation updateReservation(@PathVariable Long id,@RequestBody Reservation reservation){
       return service.updateReservation(reservation,id);
    }
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id){
        service.DeleteById(id);
    }

}
