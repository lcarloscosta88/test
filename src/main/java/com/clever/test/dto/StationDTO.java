package com.clever.test.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;

public class StationDTO  implements Serializable {

    private static final long serialVersionUID = 884076789757366L;

    @JsonCreator
    public StationDTO(String name) {
        this.name = name;
    }

    public String name;

    public String getName() {
        return name;
    }

}
