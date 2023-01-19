package com.project.Haku.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Haku.Class.Haku;
import com.project.Haku.Class.SubHaku;

@RestController
public class HakuController {
    
    @GetMapping("/haku")
	public Haku hakuController(){
		return new Haku("Michael","Scott", new SubHaku("Cilada", "silicone"));
	}
}
