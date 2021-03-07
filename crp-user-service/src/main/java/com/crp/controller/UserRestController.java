package com.crp.controller;

import com.crp.dto.UserDto;
import com.crp.enums.UserSex;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("user")
public class UserRestController {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<UserDto> getUserById(@PathVariable String id) {
        return Mono.just(UserDto
                .builder()
                .firstName("vlad")
                .lastName("gricev")
                .age(21)
                .sex(UserSex.HETEROSEXUAL)
                .build());
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<UserDto> getUsers(
            @RequestParam(defaultValue = "10") String size,
            @RequestParam(defaultValue = "0") String offset) {
        return Flux.just(
                UserDto
                        .builder()
                        .firstName("vlad1")
                        .lastName("gricev1")
                        .age(21)
                        .sex(UserSex.HETEROSEXUAL)
                        .build(),
                UserDto
                        .builder()
                        .firstName("vlad2")
                        .lastName("gricev2")
                        .age(21)
                        .sex(UserSex.HETEROSEXUAL)
                        .build(),
                UserDto
                        .builder()
                        .firstName("vlad3")
                        .lastName("gricev3")
                        .age(21)
                        .sex(UserSex.HETEROSEXUAL)
                        .build()
        );
    }

}
