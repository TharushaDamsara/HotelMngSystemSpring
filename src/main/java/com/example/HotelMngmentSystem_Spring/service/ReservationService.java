package com.example.HotelMngmentSystem_Spring.service;

import com.example.HotelMngmentSystem_Spring.entity.Reservation;

import java.util.List;

public interface ReservationService {
 Reservation saveReservation(Reservation reservation);
 Reservation updateReservation(Reservation Updatedreservation,Long id);
 List<Reservation>getAll();
 Reservation getReserveById(Long id);
 void DeleteById(Long id);
}
