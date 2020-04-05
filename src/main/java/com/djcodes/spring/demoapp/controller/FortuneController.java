package com.djcodes.spring.demoapp.controller;

import com.djcodes.spring.demoapp.service.FortuneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class FortuneController {

    private final FortuneService fortuneService;

    @GetMapping("/fortune")
    public ResponseEntity<String> getFortune() {
        String fortune = fortuneService.getFortune();
        return ResponseEntity.ok(fortune);
    }

}
