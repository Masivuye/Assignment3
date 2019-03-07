package com.persistance;

import com.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {
    private HotelRepository hotelRepository;

    @Autowired
    public DBSeeder(HotelRepository hotelRepository) {

        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Hotel mariot = new Hotel("Marriot",5,true);
        Hotel ibis = new Hotel("Ibis",3,false);
        Hotel goldenTulip = new Hotel("Golden Tulip",4 ,true);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(mariot);
        hotels.add(ibis);
        hotels.add(goldenTulip);

         //this.hotelRepository.save(hotels);
    }
}
