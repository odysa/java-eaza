package com.eaza.server.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResponse<T> implements Serializable {
    private long total;
    private List<T> list;
    private int page;

    public PageResponse(List<T> list, long total, int page) {
        this.list = list;
        this.total = total;
        this.page = page;
    }

    @Override
    public String toString() {
        return "PageResponse{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }
}

