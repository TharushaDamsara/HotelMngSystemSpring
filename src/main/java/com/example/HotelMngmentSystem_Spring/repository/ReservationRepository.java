package com.example.HotelMngmentSystem_Spring.repository;

import com.example.HotelMngmentSystem_Spring.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
