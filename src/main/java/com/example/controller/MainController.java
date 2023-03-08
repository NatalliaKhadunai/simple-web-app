package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MainController {

    @GetMapping("/index")
    private Mono<String> getIndexValue() {
        return Mono.just("Hello");
    }
}
