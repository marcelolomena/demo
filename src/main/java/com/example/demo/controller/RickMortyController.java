package com.example.demo.controller;

import com.example.demo.model.Origin;
import com.example.demo.model.RickMortyRta;
import com.example.demo.domain.Character;
import com.example.demo.domain.PlanetLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController

public class RickMortyController {
    private static final Logger logger = LoggerFactory.getLogger(RickMortyController.class);

    RestTemplate restTemplate;

    public RickMortyController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/challenge")
    public RickMortyRta challenge(@RequestParam(defaultValue = "1") String id)  {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        Character character = restTemplate.exchange("https://rickandmortyapi.com/api/character/" + id, HttpMethod.GET, entity, Character.class).getBody();
        if (character==null) throw new RickMortyException();
        int episode_count=character.getEpisode().size();
        logger.debug("episode_count: {}" ,episode_count);
        logger.debug("url: {}" ,character.getLocation().getUrl());
        PlanetLocation location = restTemplate.exchange(character.getLocation().getUrl(), HttpMethod.GET, entity, PlanetLocation.class).getBody();
        if (location==null) throw new RickMortyException();
        logger.debug("Name: {}" ,location.getName());
        logger.debug("Dimension: {}" ,location.getDimension());

        RickMortyRta rta = new RickMortyRta();
        rta.setId(character.getId());
        rta.setName(character.getName());
        rta.setStatus(character.getStatus());
        rta.setSpecies(character.getSpecies());
        rta.setType(character.getType());
        rta.setEpisodeCount(episode_count);
        Origin origin = new Origin();
        origin.setName(location.getName());
        origin.setUrl(location.getUrl());
        origin.setDimension(location.getDimension());
        origin.setResidents(location.getResidents());
        rta.setOrigin(origin);
        return rta;
    }
}
