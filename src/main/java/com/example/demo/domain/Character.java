package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Character {
    @JsonProperty("id")
    int id;
    @JsonProperty("name")
    String name;
    @JsonProperty("status")
    String status;
    @JsonProperty("species")
    String species;
    @JsonProperty("type")
    String type;
    @JsonProperty("gender")
    String gender;
    @JsonProperty("episode")
    List<String> episode;
    @JsonProperty("location")
    Location location;

}
