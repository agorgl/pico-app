package com.example.pico.pico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PicoController {
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
