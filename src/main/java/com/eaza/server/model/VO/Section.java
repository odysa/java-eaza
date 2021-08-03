package com.eaza.server.model.VO;

import com.eaza.server.model.Grade;
import com.eaza.server.model.Instructor;
import com.eaza.server.model.Subject;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Section implements Serializable {
    private Grade grade;
    private List<String> instructors;

    public Section(Grade grade, List<Instructor> instructors) {
        this.grade = grade;
        this.instructors = new ArrayList<>();
        for (var instructor : instructors) {
            this.instructors.add(instructor.getName());
        }
    }
}
