package com.example.Job_application.repository.jobs;

import com.example.Job_application.model.jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class repository {
    private JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void insertJob(jobs job) {
        String sql="insert into jobs_app (id,description,company_name,years_of_experience) values(?,?,?,?)";
        int check = getJdbcTemplate().update(sql,job.getId(),job.getDescription(),job.getCompany_name(),job.getYears_of_experience());
        if(check==1){
            System.out.println("Job added successfully");
        }
    }
}
