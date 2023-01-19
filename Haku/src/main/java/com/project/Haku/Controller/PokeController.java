package com.project.Haku.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Haku.Class.PokeMoves;
import com.project.Haku.Class.Pokemon;

@RestController
public class PokeController {
    @GetMapping("/pokemon")
    public Pokemon pokeController(){
        return new Pokemon(10, "Zard", "mitico", new PokeMoves("ember", "Takle", "Scratch", "cult"));
    }
}