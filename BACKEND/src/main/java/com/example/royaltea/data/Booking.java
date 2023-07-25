package com.example.royaltea.data;

import jakarta.persistence.Entity;

@Entity
public class Booking {
    String bookingName;
    String bookingMail;
    int bookingAmount;
    @jakarta.persistence.Id
    private Long id;

    public Booking() {
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public String getBookingMail() {
        return bookingMail;
    }

    public void setBookingMail(String bookingMail) {
        this.bookingMail = bookingMail;
    }

    public int getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(int bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Booking(String bookingName, String bookingMail, int bookingAmount) {
        this.bookingName = bookingName;
        this.bookingMail = bookingMail;
        this.bookingAmount = bookingAmount;
    }
}
