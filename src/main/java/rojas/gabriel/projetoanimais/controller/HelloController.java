package rojas.gabriel.projetoanimais.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Bem-vindos ao mundo dos ANIMAIS!";
    }

}
