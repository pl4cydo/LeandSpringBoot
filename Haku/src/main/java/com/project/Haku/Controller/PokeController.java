package com.project.Haku.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Haku.Class.PokeMoves;
import com.project.Haku.Class.Pokemon;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PokeController {
    @GetMapping("/pokemon")
    public List<Pokemon> pokeController(){
        return List.of(
            new Pokemon(10, "Zard", "mitico", new PokeMoves("ember", "Takle", "Scratch", "cult")), 
            new Pokemon(10, "Venosour", "mitico", new PokeMoves("folha navalha", "leach seed", "hiperbeen", "slugbomb")), 
            new Pokemon(10, "Blaistoise", "mitico", new PokeMoves("surf", "icebeen", "surf", "icepunch")));
    }
}
