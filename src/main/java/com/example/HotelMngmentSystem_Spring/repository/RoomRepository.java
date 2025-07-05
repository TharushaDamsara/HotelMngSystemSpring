package com.example.HotelMngmentSystem_Spring.repository;

import com.example.HotelMngmentSystem_Spring.entity.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository <Rooms,Long>{
}
