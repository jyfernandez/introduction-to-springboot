package com.example.introductiontospringboot.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

    private String first_name;
    private String last_name;

}
