package com.example.HotelMngmentSystem_Spring.entity;

import com.example.HotelMngmentSystem_Spring.enums.RoomStatus;
import com.example.HotelMngmentSystem_Spring.enums.RoomType;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "rooms")

public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Enumerated
    private RoomType type;

    @Enumerated
    private RoomStatus roomStatus;

    private double price;
    private int floor;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservations;

    public Rooms(int floor, double price, Long roomId, RoomStatus roomStatus, RoomType type) {
        this.floor = floor;
        this.price = price;
        this.roomId = roomId;
        this.roomStatus = roomStatus;
        this.type = type;
    }

    public Rooms() {
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }
}