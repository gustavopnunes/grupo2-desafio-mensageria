package br.com.ilabgrupo2.desafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("nomeDoAtributo", "Treinaweb");

        return "home";
    }
}
