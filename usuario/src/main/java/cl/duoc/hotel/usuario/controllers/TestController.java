package cl.duoc.hotel.usuario.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String hello() {
        return "Servidor funcionando correctamente 🎉";
    }
}
