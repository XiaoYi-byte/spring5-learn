package com.spring5.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private Course course;
    private String[] Strings;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private List<Course> courses;

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setStrings(String[] strings) {
        Strings = strings;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Strings=" + Arrays.toString(Strings) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", courses=" + courses +
                '}';
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

}
