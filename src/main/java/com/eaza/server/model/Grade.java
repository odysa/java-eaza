package com.eaza.server.model;

import lombok.Data;

@Data
public class Grade {
    private String courseOfferingUuid;

    private Integer sectionNumber;

    private Double gpa;

    private Integer aCount;

    private Integer abCount;

    private Integer bCount;

    private Integer bcCount;

    private Integer cCount;

    private Integer dCount;

    private Integer fCount;

    private Integer sCount;

    private Integer uCount;

    private Integer crCount;

    private Integer nCount;

    private Integer pCount;

    private Integer iCount;

    private Integer nwCount;

    private Integer nrCount;

    private Integer otherCount;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseOfferingUuid=").append(courseOfferingUuid);
        sb.append(", sectionNumber=").append(sectionNumber);
        sb.append(", gpa=").append(gpa);
        sb.append(", aCount=").append(aCount);
        sb.append(", abCount=").append(abCount);
        sb.append(", bCount=").append(bCount);
        sb.append(", bcCount=").append(bcCount);
        sb.append(", cCount=").append(cCount);
        sb.append(", dCount=").append(dCount);
        sb.append(", fCount=").append(fCount);
        sb.append(", sCount=").append(sCount);
        sb.append(", uCount=").append(uCount);
        sb.append(", crCount=").append(crCount);
        sb.append(", nCount=").append(nCount);
        sb.append(", pCount=").append(pCount);
        sb.append(", iCount=").append(iCount);
        sb.append(", nwCount=").append(nwCount);
        sb.append(", nrCount=").append(nrCount);
        sb.append(", otherCount=").append(otherCount);
        sb.append("]");
        return sb.toString();
    }
}