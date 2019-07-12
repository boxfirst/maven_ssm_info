package com.daisy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class InFor {
    private Long inforid;
    private String infornumber;

    @Pattern(regexp = "(^[a-z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})",message = "用户名格式错误，需要6-16位英文字母或者2-5位中文字符")
    private String inforname;

    private String sex;
    @Max(value = 100,message = "你的年龄过大，不适用于我们的系统！")
    @Min(value = 5,message = "你的年龄过小，不适用于我们的系统！")
    private Integer inforage;

    private String inforpassword;

    @Length(min = 11,max = 11,message ="联系方式为11位手机号码" )
    private String inforphone;

    private Integer jobid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date registdate;

    private Job job;

    @Override
    public String toString() {
        return "InFor{" +
                "inforid=" + inforid +
                ", infornumber='" + infornumber + '\'' +
                ", inforname='" + inforname + '\'' +
                ", sex='" + sex + '\'' +
                ", inforage=" + inforage +
                ", inforpassword='" + inforpassword + '\'' +
                ", inforphone='" + inforphone + '\'' +
                ", jobid=" + jobid +
                ", registdate=" + registdate +
                ", job=" + job +
                '}';
    }

    public InFor() {
    }

    public InFor(Long inforid, String infornumber, String inforname, String sex, Integer inforage, String inforpassword, String inforphone, Integer jobid, Date registdate, Job job) {
        this.inforid = inforid;
        this.infornumber = infornumber;
        this.inforname = inforname;
        this.sex = sex;
        this.inforage = inforage;
        this.inforpassword = inforpassword;
        this.inforphone = inforphone;
        this.jobid = jobid;
        this.registdate = registdate;
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Long getInforid() {
        return inforid;
    }

    public void setInforid(Long inforid) {
        this.inforid = inforid;
    }

    public String getInfornumber() {
        return infornumber;
    }

    public void setInfornumber(String infornumber) {
        this.infornumber = infornumber == null ? null : infornumber.trim();
    }

    public String getInforname() {
        return inforname;
    }

    public void setInforname(String inforname) {
        this.inforname = inforname == null ? null : inforname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getInforage() {
        return inforage;
    }

    public void setInforage(Integer inforage) {
        this.inforage = inforage;
    }

    public String getInforpassword() {
        return inforpassword;
    }

    public void setInforpassword(String inforpassword) {
        this.inforpassword = inforpassword == null ? null : inforpassword.trim();
    }

    public String getInforphone() {
        return inforphone;
    }

    public void setInforphone(String inforphone) {
        this.inforphone = inforphone == null ? null : inforphone.trim();
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Date getRegistdate() {
        return registdate;
    }

    public void setRegistdate(Date registdate) {
        this.registdate = registdate;
    }
}