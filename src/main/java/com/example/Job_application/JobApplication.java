package com.example.Job_application;

import com.example.Job_application.model.jobs;
import com.example.Job_application.service.jobs.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class JobApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(JobApplication.class, args);
		jobs job = context.getBean(jobs.class);
		job.setId(122);
		job.setDescription("Job Description2");
		job.setCompany_name("Company Name2");
		job.setYears_of_experience(6);

		service service = context.getBean(service.class);
		service.insertJob(job);
	}

}
