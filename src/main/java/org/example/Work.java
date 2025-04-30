package org.example;

public class Work {
    private String company;
    private String position;
    private String startDate;
    private String endDate; // Optional: could be "Present" for current jobs

    public Work(String company, String position, String startDate, String endDate) {
        this.company = company;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

