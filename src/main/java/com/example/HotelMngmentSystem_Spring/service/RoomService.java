package com.example.HotelMngmentSystem_Spring.service;

import com.example.HotelMngmentSystem_Spring.entity.Rooms;

import java.util.List;

public interface RoomService {
    Rooms saveRoom(Rooms rooms);
    Rooms getRoomById(Long id);
    List<Rooms> getAllRooms();
    Rooms updateRoom(Long id, Rooms rooms);
    void deleteRoom(Long id);

}
