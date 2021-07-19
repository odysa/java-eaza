package com.eaza.server.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {
    private String uuid;

    private String name;

    private Integer number;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append("]");
        return sb.toString();
    }
}