package com.eaza.server.model;

public class Section {
    private String uuid;

    private String courseOfferingUuid;

    private String sectionType;

    private Integer number;

    private String roomUuid;

    private String scheduleUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCourseOfferingUuid() {
        return courseOfferingUuid;
    }

    public void setCourseOfferingUuid(String courseOfferingUuid) {
        this.courseOfferingUuid = courseOfferingUuid;
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRoomUuid() {
        return roomUuid;
    }

    public void setRoomUuid(String roomUuid) {
        this.roomUuid = roomUuid;
    }

    public String getScheduleUuid() {
        return scheduleUuid;
    }

    public void setScheduleUuid(String scheduleUuid) {
        this.scheduleUuid = scheduleUuid;
    }

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