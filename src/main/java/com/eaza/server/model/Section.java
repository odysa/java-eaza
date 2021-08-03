package com.eaza.server.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Section implements Serializable {
    private String uuid;

    private String courseOfferingUuid;

    private String sectionType;

    private Integer number;

    private String roomUuid;

    private String scheduleUuid;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", courseOfferingUuid=").append(courseOfferingUuid);
        sb.append(", sectionType=").append(sectionType);
        sb.append(", number=").append(number);
        sb.append(", roomUuid=").append(roomUuid);
        sb.append(", scheduleUuid=").append(scheduleUuid);
        sb.append("]");
        return sb.toString();
    }
}