package com.eaza.server.model.VO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Term implements Serializable {
    private int code;
    private String semester;
    private int year;
}