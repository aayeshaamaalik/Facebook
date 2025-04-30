package org.example;

public class Education {
    private String school;
    private String degree;
    private String startDate;
    private String endDate;

    public Education(String school, String degree, String startDate, String endDate) {
        this.school = school;
        this.degree = degree;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}

