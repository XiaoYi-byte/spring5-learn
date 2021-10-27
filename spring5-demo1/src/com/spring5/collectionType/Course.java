package com.spring5.collectionType;

public class Course {
    private String CName;

    public void setCName(String CName) {
        this.CName = CName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CName='" + CName + '\'' +
                '}';
    }
}
