package com.djcodes.spring.demoapp.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.djcodes.spring.demoapp.config.FortuneFile;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FortuneServiceFileTest {

    @Test
    public void given_fortune_list_when_getFortune_called_then_return_fortune() {
        //Assemble
        List<String> list = Arrays.asList("foo", "bar");
        FortuneFile fortuneFile = new FortuneFile();
        fortuneFile.setFortunes(list);
        FortuneService fortuneService = new FortuneServiceFile(fortuneFile);

        //Act
        String result = fortuneService.getFortune();

        //Assert
        assertNotNull(result);


    }

}
