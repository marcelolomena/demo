package com.example.demo.model;

import java.util.HashMap;
import java.util.List;
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
        "name",
        "url",
        "dimension",
        "residents"
})
@Generated("jsonschema2pojo")
public class Origin {

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
    @JsonProperty("url")
    private String url;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("dimension")
    private String dimension;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("residents")
    private List<String> residents = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("dimension")
    public String getDimension() {
        return dimension;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("dimension")
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("residents")
    public List<String> getResidents() {
        return residents;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("residents")
    public void setResidents(List<String> residents) {
        this.residents = residents;
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