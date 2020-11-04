package com.neny.wygl.bean;

/**
 * projectName: wygl
 *
 * @author: 王子琦
 * time: 2020/11/4 9:14
 * description:员工工作
 */
public class Sj {
    private int sjId;
    private String sjDate;
    private String sjLeave;
    private int staffId;
    private int jobId;

    public int getSjId() {
        return sjId;
    }

    public void setSjId(int sjId) {
        this.sjId = sjId;
    }

    public String getSjDate() {
        return sjDate;
    }

    public void setSjDate(String sjDate) {
        this.sjDate = sjDate;
    }

    public String getSjLeave() {
        return sjLeave;
    }

    public void setSjLeave(String sjLeave) {
        this.sjLeave = sjLeave;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
}
