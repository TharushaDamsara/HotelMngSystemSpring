package com.example.HotelMngmentSystem_Spring.service.impl;

import com.example.HotelMngmentSystem_Spring.entity.Reservation;
import com.example.HotelMngmentSystem_Spring.repository.ReservationRepository;
import com.example.HotelMngmentSystem_Spring.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation Updatedreservation, Long id) {
        Optional<Reservation> existReservation =reservationRepository.findById(id);
        if (existReservation.isPresent()){
            Reservation updateres = existReservation.get();
            updateres.setGuest(Updatedreservation.getGuest());
            updateres.setRoom(Updatedreservation.getRoom());
            updateres.setCheckedInDate(Updatedreservation.getCheckedInDate());
            updateres.setCheckedOutDate(Updatedreservation.getCheckedOutDate());
            updateres.setStatus(Updatedreservation.getStatus());
            return updateres;
        }
        else {
            return null;
        }
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReserveById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public void DeleteById(Long id) {
        reservationRepository.deleteById(id);
    }
}
