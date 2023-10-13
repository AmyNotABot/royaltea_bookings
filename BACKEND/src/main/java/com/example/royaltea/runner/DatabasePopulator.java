package com.example.royaltea.runner;

import com.example.royaltea.data.Booking;
import com.example.royaltea.data.BookingRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabasePopulator {
    @Bean
    public ApplicationRunner populate(BookingRepository amyRepo){

        return args -> {

            amyRepo.save(new Booking("Andrea Dörler", "andi@gmail.com", 4));
            amyRepo.save(new Booking ("Maikl D.", "maikimaki@m.at", 5));
            amyRepo.save(new Booking("Sally Sarah Schwertgans", "no Email", 2));
            System.out.println(amyRepo.findAll());
        };
    }
}
