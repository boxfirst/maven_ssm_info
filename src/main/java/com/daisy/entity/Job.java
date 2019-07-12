package com.daisy.entity;

public class Job {
    private Integer jobid;

    private String jobname;

    public Job() {
    }

    public Job(Integer jobid, String jobname) {
        this.jobid = jobid;
        this.jobname = jobname;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobid=" + jobid +
                ", jobname='" + jobname + '\'' +
                '}';
    }
}