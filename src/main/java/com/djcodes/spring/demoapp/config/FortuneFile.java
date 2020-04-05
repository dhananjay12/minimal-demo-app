package com.djcodes.spring.demoapp.config;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app")
public class FortuneFile {

    @Getter@Setter
    private List<String> fortunes;


}
