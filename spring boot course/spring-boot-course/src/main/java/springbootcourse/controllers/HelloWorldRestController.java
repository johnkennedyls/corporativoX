package springbootcourse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping({"/hello", "/hw", "/helloworld", "/hola"})
    public String helloWorld() {
        System.out.println("Solicitud recibida en el controlador HelloWorldRestController");
        return "Hello World";
    }
}
