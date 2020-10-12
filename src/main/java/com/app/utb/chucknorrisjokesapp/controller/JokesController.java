package com.app.utb.chucknorrisjokesapp.controller;

import com.app.utb.chucknorrisjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping
    public String getJokes(Model model){
        String joke = jokesService.generatetJokes();
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
