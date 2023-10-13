package com.example.royaltea.endpoints;

import com.example.royaltea.data.Booking;
import com.example.royaltea.data.BookingRepository;
import com.example.royaltea.data.ListConverter;
import com.example.royaltea.mail.EmailServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class Endpoints {
    BookingRepository bookingRepository;
    ListConverter listConverter = new ListConverter();
    private final EmailServiceImpl mailDing;

    public Endpoints(BookingRepository bookingRepository, EmailServiceImpl mailDing) {
        this.bookingRepository = bookingRepository;
        this.mailDing = mailDing;
    }

    @PostMapping("mail")
    public void sendMail(@RequestBody String to, String name, int amountOfSeats) {
        //---Implementations
        Booking bookingAdd = new Booking(to, name, amountOfSeats);
        //---Database adding stuff
        bookingRepository.save(bookingAdd);
        //---Mail-Stuff
        mailDing.sendSimpleMessage(bookingAdd);
    }
//TODO: FIND OUT WHY POST AND NOTHING SONST
    @PostMapping("login")
    public void loginUser(@RequestBody LoginRequest loginRequest){
        System.out.println(loginRequest.getUsername());
        System.out.println(loginRequest.getPassword());

    }

    @GetMapping("milchkaffee")
    public void allBookings() {
        List<Booking> allBookings = bookingRepository.findAll();
        listConverter.convertToSpreadsheet(allBookings);
    }
}

