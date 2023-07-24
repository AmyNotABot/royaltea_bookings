package com.example.royaltea.mail;

import com.example.royaltea.data.Booking;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl {

    private final JavaMailSender emailSender;

    public EmailServiceImpl(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendSimpleMessage(Booking booking) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@royaltea.com");
        message.setTo(booking.getBookingMail());
        message.setSubject("YOUR RESERVATION");
        message.setText("\n" +
                "Hello and thank you very much for your reservation! \n" +
                "\n" +
                "Quick facts: \n" +
                "\n" +
                "\t${royalteaEdition}\n" +
                "\t${dateOfEvent}\n" +
                "\t${locationOfEvent}\n" +
                "\t\n" +
                "\tNAME: " + booking.getBookingName() +
                "\tSEATS:" + booking.getBookingAmount() +
                "\t\n" +
                "With the new season we are no longer offering preferred seats, instead we got free seats. \n" +
                "So please make sure you drop in on time so you can snatch your favourite seats and don't miss anything of the show. \n" +
                "\n" +
                "Also please make sure to bring this mail, either printed or on your device, \n" +
                "so our organisators can grant you entry quick and easy. \n" +
                "\n" +
                "We hope you enjoy every minute of our work! \n" +
                "\n" +
                "Best Regards, \n" +
                "Your RoyalTea(m)\n");

        emailSender.send(message);
    }
}