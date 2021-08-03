package com.eaza.server.request;

import lombok.Data;

@Data
public class PageRequest {
    private int page;
    private int size;

    @Override
    public String toString() {
        return "PageRequest{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}