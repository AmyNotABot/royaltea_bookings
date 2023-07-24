package com.example.royaltea.endpoints;

import com.example.royaltea.data.Booking;
import com.example.royaltea.mail.EmailServiceImpl;
import com.example.royaltea.mail.MailSenderConfig;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MailEndPoint {
    @PostMapping("mail")
    public void sendMail(@RequestBody String to, String name, int amountOfSeats){
        Booking bookingAdd = new Booking(to, name, amountOfSeats);
        System.out.println("ICH TRIGGERE");

        MailSenderConfig mailConfDing = new MailSenderConfig();
        EmailServiceImpl mailDing = new EmailServiceImpl(mailConfDing.getJavaMailSender());

        mailDing.sendSimpleMessage(bookingAdd);
    }

}
