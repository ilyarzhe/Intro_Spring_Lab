package com.example.MondayLab.controllers;

import com.example.MondayLab.models.Celebration;
import com.example.MondayLab.models.CelebrationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {
    private CelebrationDTO celebrationDTO;
    private Celebration celebration;
    @GetMapping
    public ResponseEntity<CelebrationDTO> greeting(@RequestParam(value = "name")String name,
                                                @RequestParam(value = "timeofday") String timeOfDay){
        CelebrationDTO celebrationDTO = new CelebrationDTO(String.format("Good %s %s!",timeOfDay,name));
        return new ResponseEntity<>(celebrationDTO, HttpStatus.OK);
    }
    @GetMapping(value="                                                              /christmas")
    public ResponseEntity<Celebration> christmasMessage(){
        celebration = new Celebration("Merry Christmas");
        return new ResponseEntity<Celebration>(celebration,HttpStatus.OK);
    }
}

