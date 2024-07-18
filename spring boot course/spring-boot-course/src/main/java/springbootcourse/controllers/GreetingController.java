package springbootcourse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping({"/greeting/{name}", "saludo/{name}", "hola/{name}"})
    public String greeting(@PathVariable String name) {
        System.out.println("Solicitud recibida en el controlador GreetingController");
        return "Greetings " + name + "!";
    }
}
