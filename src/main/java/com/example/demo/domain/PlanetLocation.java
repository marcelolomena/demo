package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlanetLocation {
    @JsonProperty("name")
    String name;
    @JsonProperty("url")
    String url;
    @JsonProperty("dimension")
    String dimension;
    @JsonProperty("residents")
    List<String> residents;
}
