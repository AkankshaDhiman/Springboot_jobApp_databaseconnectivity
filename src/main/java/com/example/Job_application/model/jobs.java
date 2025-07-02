package com.example.Job_application.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class jobs {
    private int id;
    private String description;
    private String company_name;
    @Value("0")
    private int years_of_experience;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCompany_name() {
        return company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public int getYears_of_experience() {
        return years_of_experience;
    }
    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    @Override
    public String toString() {
        return "jobs{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", company_name='" + company_name + '\'' +
                ", years_of_experience=" + years_of_experience +
                '}';
    }
}
