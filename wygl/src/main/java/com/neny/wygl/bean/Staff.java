package com.neny.wygl.bean;

/**
 * projectName: wygl
 *
 * @author: 王子琦
 * time: 2020/11/4 9:15
 * description:员工
 */
public class Staff {
    private int staffId;
    private String staffName;
    private String staffTel;
    private String staffCard;
    private String staffSex;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel;
    }

    public String getStaffCard() {
        return staffCard;
    }

    public void setStaffCard(String staffCard) {
        this.staffCard = staffCard;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }
}
