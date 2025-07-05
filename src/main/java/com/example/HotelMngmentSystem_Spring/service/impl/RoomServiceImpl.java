package com.example.HotelMngmentSystem_Spring.service.impl;

import com.example.HotelMngmentSystem_Spring.entity.Rooms;
import com.example.HotelMngmentSystem_Spring.repository.RoomRepository;
import com.example.HotelMngmentSystem_Spring.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository repository;

    @Override
    public Rooms saveRoom(Rooms rooms) {
        return repository.save(rooms);
    }

    @Override
    public Rooms getRoomById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Rooms> getAllRooms() {
        return repository.findAll();
    }

    @Override
    public Rooms updateRoom(Long id, Rooms rooms) {
        Optional<Rooms> isexistRoom = repository.findById(id);
        if (isexistRoom.isPresent()){
            Rooms existroom = isexistRoom.get();
            existroom.setType(rooms.getType());
            existroom.setRoomStatus(rooms.getRoomStatus());
            existroom.setPrice(rooms.getPrice());
            existroom.setFloor(rooms.getFloor());
            return repository.save(existroom);
        }
        else {
            return null;
        }
    }
    @Override
    public void deleteRoom(Long id) {
        repository.deleteById(id);
    }
}
