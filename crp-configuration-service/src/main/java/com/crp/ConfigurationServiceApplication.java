package com.crp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServiceApplication.class, args);
//        new SpringApplicationBuilder(ConfigurationServiceApplication.class)
//                .bannerMode(Banner.Mode.OFF)
//                .logStartupInfo(true)
//                .web(WebApplicationType.SERVLET)
//                .build(args)
//                .run(args);
    }
}
