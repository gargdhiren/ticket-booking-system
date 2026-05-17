package com.dhiren.backend.event.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class EventController {

    @GetMapping("/health")
    public String health() {
        return "Everything is up and running";
    }
}
