package com.example.nadeemtest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NadeemResponse {

    private int id;
    private String name;
    private String bio;
}
