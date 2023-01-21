package com.pag.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {
    
    @GetMapping("/notes")
    public String getNotes(){
        return "Funfou";
    }

}
