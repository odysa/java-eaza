package com.eaza.server.model.POJO;

import lombok.Data;

import java.io.Serializable;

@Data
public class Term implements Serializable {
    private String offerId;
    private int termCode;
}
