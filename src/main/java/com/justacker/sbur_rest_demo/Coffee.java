package com.justacker.sbur_rest_demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Coffee {
    private final String id;
    private final String name;

    @JsonCreator
    public Coffee(@JsonProperty("id") String id,@JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
