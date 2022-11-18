package io.github.danilopiazza.springdoc.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.danilopiazza.springdoc.model.Greeting;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("api/greetings")
public class GreetingController {
    @GetMapping("formal/{name}")
    @Operation(summary = "Returns a formal greeting")
    public Greeting formal(@PathVariable String name) {
        return Greeting.formal(name);
    }

    @GetMapping("casual")
    @Operation(summary = "Returns a casual greeting")
    public Greeting casual(@RequestParam String name) {
        return Greeting.casual(name);
    }
}
