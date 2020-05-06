package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LeapYearService {

    public boolean check(int year) {
        boolean leapYear = false;
        if (year % 400 == 0) {
            leapYear = true;
        } else if (year % 100 == 0 && year % 400 != 0) {
            leapYear = false;
        } else if (year % 4 == 0) {
            leapYear = true;
        }

        return leapYear;
    }


}
