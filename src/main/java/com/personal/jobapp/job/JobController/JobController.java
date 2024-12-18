package com.personal.jobapp.job.JobController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {
    private List<Job> jobs= new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        jobs.add(job);
        return "JobAdded";
    }

}
