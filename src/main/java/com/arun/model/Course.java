package com.arun.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Adwiti on 5/12/2018.
 */
@Getter
@Setter
public class Course {
    private String courseId;
    private String courseName;
    private List<Language> languages;
}
