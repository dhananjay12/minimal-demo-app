package com.djcodes.spring.demoapp.service;

import com.djcodes.spring.demoapp.config.FortuneFile;
import com.djcodes.spring.demoapp.data.FortuneRepository;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(
    value = "app.fortune.source", havingValue = "db")
public class FortuneServiceDb implements FortuneService {

     private final FortuneRepository fortuneRepository;

    @Override
    public String getFortune() {
        int numberOfRows = Long.valueOf(fortuneRepository.count()).intValue();
        int randomNumber = new Random().nextInt(numberOfRows);
        return fortuneRepository.findById(randomNumber).get().getText();
    }
}

