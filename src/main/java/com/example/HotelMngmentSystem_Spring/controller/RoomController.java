package com.example.HotelMngmentSystem_Spring.controller;

import com.example.HotelMngmentSystem_Spring.entity.Rooms;
import com.example.HotelMngmentSystem_Spring.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
@CrossOrigin
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping
    public Rooms createRoom(@RequestBody Rooms room){
        return roomService.saveRoom(room);
    }
    @GetMapping("/{id}")
    public Rooms getRoomById(@PathVariable Long id){
        return roomService.getRoomById(id);
    }
    @GetMapping
    public List<Rooms> getAllRooms(){
        return roomService.getAllRooms();
    }
    @PutMapping("/{id}")
    public Rooms updateRoom(@RequestBody Rooms rooms,@PathVariable Long id){
        return roomService.updateRoom(id, rooms);
    }
    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id){
        roomService.deleteRoom(id);
    }
}
