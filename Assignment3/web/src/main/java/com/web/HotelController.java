package com.web;

import com.domain.Hotel;
import com.persistance.HotelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    @GetMapping("/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotels = this.hotelRepository.findAll();
        return hotels;
    }
}

