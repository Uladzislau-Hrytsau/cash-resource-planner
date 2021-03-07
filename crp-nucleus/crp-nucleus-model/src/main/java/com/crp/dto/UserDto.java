package com.crp.dto;

import com.crp.enums.UserSex;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String firstName;
    private String lastName;
    private Integer age;
    private UserSex sex;
}
