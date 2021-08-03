package com.eaza.server.model.VO;

import lombok.Data;

import java.io.Serializable;

@Data
public class SearchResult implements Serializable {
    private String abb;
    private int number;
    private String name;
    private String uuid;
    private String breadths;
}
