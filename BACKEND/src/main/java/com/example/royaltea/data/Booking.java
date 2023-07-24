package com.example.royaltea.data;

public class Booking {

    String bookingName;
    String bookingMail;
    int bookingAmount;

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

    public Booking(String bookingName, String bookingMail, int bookingAmount) {
        this.bookingName = bookingName;
        this.bookingMail = bookingMail;
        this.bookingAmount = bookingAmount;
    }
}
