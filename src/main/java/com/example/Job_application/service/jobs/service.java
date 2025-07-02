package com.example.Job_application.service.jobs;

import com.example.Job_application.model.jobs;
import com.example.Job_application.repository.jobs.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    private repository repo = new repository();

    public void insertJob(jobs job) {
        repo.insertJob(job);
        System.out.println("Inserted job");
    }

    public repository getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(repository repo) {
        this.repo = repo;
    }
}
