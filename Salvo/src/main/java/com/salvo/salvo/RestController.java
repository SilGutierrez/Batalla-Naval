package com.salvo.salvo;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private GameRepository gameRepository;

    @RequestMapping("/api")
    public List<Object> getAll(){
        return null;
    }

    @RequestMapping("/api/games")
    public List<Object> getAllGames() {
        return gameRepository.findAll().stream().map(Game::getGameData).collect(Collectors.toList());
    }






}


