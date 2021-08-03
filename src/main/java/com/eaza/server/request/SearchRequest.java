package com.eaza.server.request;

import lombok.Data;

@Data
public class SearchRequest extends PageRequest{
    private String query;
}
