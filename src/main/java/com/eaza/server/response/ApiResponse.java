package com.eaza.server.response;

import lombok.Data;


@Data
public class ApiResponse<T> {
    private boolean success = true;
    private String message = "success";
    private T data;

    public ApiResponse(T data) {
        this.data = data;
    }
}
