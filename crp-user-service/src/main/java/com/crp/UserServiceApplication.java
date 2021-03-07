package com.crp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
//        new SpringApplicationBuilder(UserServiceApplication.class)
//                .bannerMode(Banner.Mode.OFF)
//                .logStartupInfo(true)
//                .web(WebApplicationType.REACTIVE)
//                .build(args)
//                .run(args);
    }

}
