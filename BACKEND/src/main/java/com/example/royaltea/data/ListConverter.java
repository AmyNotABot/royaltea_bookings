package com.example.royaltea.data;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ListConverter {
    public void convertToSpreadsheet(List<Booking> bookings) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Bookings");
            // Create header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Name");
            headerRow.createCell(1).setCellValue("Seats");
            headerRow.createCell(2).setCellValue("Email");
            // Populate data rows
            int rowNum = 1;
            for (Booking booking : bookings) {
                Row dataRow = sheet.createRow(rowNum++);
                dataRow.createCell(0).setCellValue(booking.getBookingName());
                dataRow.createCell(1).setCellValue(booking.getBookingAmount());
                dataRow.createCell(2).setCellValue(booking.getBookingMail());
            }
            // Write the workbook to the output file
            try (FileOutputStream fileOut = new FileOutputStream("./spreadSheets/spreadshit.xlsx")) { //IM ZWEIFELSFALL HIER DEN PATH ÄNDERN
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
