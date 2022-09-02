package com.example.restpractice.http;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class MappingExampleController {

    @GetMapping
    public String get() {
        return "Mapped with @GetMapping";
    }

    @PostMapping
    public String post() {
        return "Mapped with @PostMapping";
    }

    @PutMapping
    public String put() {
        return "Mapped with @PutMapping";
    }

    @PatchMapping
    public String patch() {
        return "Mapped with @PatchMapping";
    }

    @DeleteMapping
    public String delete() {
        return "Mapped with @DeleteMapping";
    }

    @RequestMapping(path = "/two", method = RequestMethod.GET)
    public String get2() {
        return "Mapped with @RequestMapping";
    }

    @PostMapping("/two")
    public String two() {
        return "Mapped with @PostMapping('/two')";
    }

}
