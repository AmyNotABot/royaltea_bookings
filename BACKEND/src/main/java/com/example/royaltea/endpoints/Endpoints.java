package com.example.royaltea.endpoints;

import com.example.royaltea.data.Booking;
import com.example.royaltea.data.BookingRepository;
import com.example.royaltea.data.ListConverter;
import com.example.royaltea.mail.EmailServiceImpl;
import com.example.royaltea.mail.MailSenderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class Endpoints {
    BookingRepository bookingRepository;
    MailSenderConfig mailConfDing = new MailSenderConfig();
    ListConverter listConverter = new ListConverter();

    @PostMapping("mail")
    public void sendMail(@RequestBody String to, String name, int amountOfSeats) {
        //---Implementations
        Booking bookingAdd = new Booking(to, name, amountOfSeats);
        EmailServiceImpl mailDing = new EmailServiceImpl(mailConfDing.getJavaMailSender());
        //---Database adding stuff
        bookingRepository.save(bookingAdd);
        //---Mail-Stuff
        mailDing.sendSimpleMessage(bookingAdd);
    }

    @GetMapping("milchkaffee")
    public void allBookings() {
         List<Booking> allBookings = bookingRepository.findAll();
         listConverter.convertToSpreadsheet(allBookings);
    }
public Endpoints(BookingRepository bookingRepository){this.bookingRepository = bookingRepository;}
}

