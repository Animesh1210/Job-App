package com.personal.jobapp.job.JobController;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Job {
    private Long id;
    private String title;
    private String description;
    private String maxSalary;
    private String minSalary;
    private String location;


}
