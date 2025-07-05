package com.example.HotelMngmentSystem_Spring.repository;

import com.example.HotelMngmentSystem_Spring.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}

