package com.eaza.server.model.VO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Semester implements Serializable {
    private Term term;
    private List<Section> sections;

    public Semester(List<Section> sections, int code){
        this.sections = sections;
        this.term = this.getTerm(code);
    }

    public Semester(List<Section> sections, Term term){
        this.sections = sections;
        this.term = term;
    }

    public Term getTerm(int code) {
        String semester;

        int base = code / 10;

        if (code % 10 == 2) {
            semester = "Fall";
            base -= 1;
        } else {
            semester = "Spring";
        }

        int year = base + 2001 - 101;

        var term = new Term(code,semester,year);
        return term;
    }
}
