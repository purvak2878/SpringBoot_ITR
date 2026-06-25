package com.itr.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/fortune")
    public String show() {
        return "I am Lucky";
    }
}
