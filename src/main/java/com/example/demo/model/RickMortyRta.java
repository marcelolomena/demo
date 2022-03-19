package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "status",
        "species",
        "type",
        "episode_count",
        "origin"
})
@Generated("jsonschema2pojo")
public class RickMortyRta {

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    private Object id;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("name")
    private String name;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    private String status;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("species")
    private String species;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("type")
    private String type;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("episode_count")
    private Object episodeCount;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("origin")
    private Origin origin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("species")
    public String getSpecies() {
        return species;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("species")
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("episode_count")
    public Object getEpisodeCount() {
        return episodeCount;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("episode_count")
    public void setEpisodeCount(Object episodeCount) {
        this.episodeCount = episodeCount;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("origin")
    public Origin getOrigin() {
        return origin;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
