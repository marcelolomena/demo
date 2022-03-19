package com.example.demo.controller;

import com.example.demo.domain.PlanetLocation;
import com.example.demo.model.RickMortyRta;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Collections;

@ExtendWith(MockitoExtension.class)
public class RickMortyControllerUnitTest {
    @InjectMocks
    RickMortyController controller;
    @Mock
    RestTemplate restTemplate;
    String testUrl = "localhost:8080/challenge?id=1";

    @Before
    public void setUp() {
        controller = new RickMortyController(restTemplate);
    }

    @Test
    public void ok() {

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        RickMortyRta responseEntity = controller.challenge("1");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        PlanetLocation pl = new PlanetLocation();
        Mockito.when(restTemplate.exchange(testUrl, HttpMethod.GET, entity, PlanetLocation.class).getBody()).thenReturn(pl);

    }
}
