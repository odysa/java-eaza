package com.eaza.server.model.VO;

import com.eaza.server.model.Grade;
import com.eaza.server.model.Instructor;
import com.eaza.server.model.Subject;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Section implements Serializable {
    private List<Subject> subjects;
    private Grade grade;
    private List<Instructor> instructors;
    private Term term;

    public Section(Grade grade, List<Subject> subjects,List<Instructor> instructors, int termCode){
        this.grade = grade;
        this.subjects = subjects;
        this.term = getTerm(termCode);
        this.instructors = instructors;
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
