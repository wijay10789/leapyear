package com.example.demo.controller;

import com.example.demo.service.LeapYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leapyear/")
public class LeapYearController {

    @Autowired
    private LeapYearService service;

    @RequestMapping("/test/{year}")
    public ResponseEntity check(@PathVariable("year") int year) {
        boolean leapYear = this.service.check(year);
        return ResponseEntity.ok(year + " Is leap Year ? : " + leapYear);
    }

}
