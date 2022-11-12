package com.example.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.domain.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
