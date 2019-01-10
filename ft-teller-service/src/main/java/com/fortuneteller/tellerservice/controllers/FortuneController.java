package com.fortuneteller.tellerservice.controllers;

import com.fortuneteller.tellerservice.repositories.FortuneRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fortuneteller.tellerservice.domain.Fortune;
import java.util.List;

@RestController
public class FortuneController {

	@Autowired
	FortuneRepository fortuneRepository;

    @RequestMapping("/fortunes")
    public Iterable<Fortune> fortunes() {
        return fortuneRepository.findAll();
    }

    @RequestMapping("/random")
    public Fortune randomFortune() {
        List<Fortune> randomFortunes = fortuneRepository.randomFortunes(PageRequest.of(0, 1));
        return randomFortunes.get(0);
    }
}
