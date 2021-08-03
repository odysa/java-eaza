package com.eaza.server.model.VO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Term implements Serializable {
    @JsonIgnore
    private int code;
    private String semester;
    private int year;
}