package com.eaza.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class CourseOffering {
    @JsonIgnore
    private String uuid;

    private String courseUuid;

    private Integer termCode;

    private String name;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", courseUuid=").append(courseUuid);
        sb.append(", termCode=").append(termCode);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}