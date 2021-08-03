package com.eaza.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {
    @JsonIgnore
    private Integer id;

    private Integer number;

    private Integer lastTaught;

    private Double grade;

    private String abb;

    private String abbLong;

    private String name;

    private String offered;

    private String description;

    private String requisite;

    private String repeatable;

    private String college;

    private String credit;

    private String level;

    private String abbSearch;

    private String abbNumber;

    private String breadths;

    private String uuid;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", number=").append(number);
        sb.append(", lastTaught=").append(lastTaught);
        sb.append(", grade=").append(grade);
        sb.append(", abb=").append(abb);
        sb.append(", abbLong=").append(abbLong);
        sb.append(", name=").append(name);
        sb.append(", offered=").append(offered);
        sb.append(", description=").append(description);
        sb.append(", requisite=").append(requisite);
        sb.append(", repeatable=").append(repeatable);
        sb.append(", college=").append(college);
        sb.append(", credit=").append(credit);
        sb.append(", level=").append(level);
        sb.append(", abbSearch=").append(abbSearch);
        sb.append(", abbNumber=").append(abbNumber);
        sb.append(", breadths=").append(breadths);
        sb.append(", uuid=").append(uuid);
        sb.append("]");
        return sb.toString();
    }
}