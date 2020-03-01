package com.mycomp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {

    private Integer teacher_id;
    private String teacher_name;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                '}';
    }
}