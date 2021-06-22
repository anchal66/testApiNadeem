package com.example.nadeemtest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/test")
    public String test(){
        return "Welcome Nadeem";
    }

    @GetMapping("/nadeem")
    public NadeemResponse testNadeem(){
        return new NadeemResponse(1, "Naddem", "Smart Boy");
    }

    @GetMapping("/nadeemList")
    public List<NadeemResponse> testNadeemList(){
        return Arrays.asList(new NadeemResponse(1, "Naddem", "Smart Boy"),
                new NadeemResponse(2, "Avinash", "Smart Boy2"),
                new NadeemResponse(3, "Sourav", "Mota Boy"),
                new NadeemResponse(1, "Nishant", "Nata Boy"));
    }
}
