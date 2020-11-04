package com.neny.wygl.bean;

/**
 * projectName: wygl
 *
 * @author: 王子琦
 * time: 2020/11/4 9:15
 * description:管理员
 */
public class User {
    private int uId;
    private String uName;
    private String uPassword;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }
}
