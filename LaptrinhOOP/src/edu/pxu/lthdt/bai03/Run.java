package edu.pxu.lthdt.bai03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Run {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

// Lấy giờ hiện tại
        LocalTime now = LocalTime.now();
        System.out.println(now);

// Lấy ngày và giờ hiện tại
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
