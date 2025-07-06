package com.example.HotelMngmentSystem_Spring.entity;

import com.example.HotelMngmentSystem_Spring.enums.ReserveStatus;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate checkedInDate;
    private LocalDate checkedOutDate;

    @Enumerated(EnumType.STRING)
    private ReserveStatus status;

    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Rooms room;

    public Reservation() {
    }

    public Reservation(LocalDate checkedInDate, LocalDate checkedOutDate, Guest guest,
                       Long id, Rooms room, ReserveStatus status) {
        this.checkedInDate = checkedInDate;
        this.checkedOutDate = checkedOutDate;
        this.guest = guest;
        this.id = id;
        this.room = room;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCheckedInDate() {
        return checkedInDate;
    }

    public void setCheckedInDate(LocalDate checkedInDate) {
        this.checkedInDate = checkedInDate;
    }

    public LocalDate getCheckedOutDate() {
        return checkedOutDate;
    }

    public void setCheckedOutDate(LocalDate checkedOutDate) {
        this.checkedOutDate = checkedOutDate;
    }

    public ReserveStatus getStatus() {
        return status;
    }

    public void setStatus(ReserveStatus status) {
        this.status = status;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }
}
