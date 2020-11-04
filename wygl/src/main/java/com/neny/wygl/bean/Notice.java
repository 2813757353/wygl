package com.neny.wygl.bean;

/**
 * projectName: wygl
 *
 * @author: 王子琦
 * time: 2020/11/4 9:13
 * description:公告
 */
public class Notice {
    private int nId;
    private String nMessage;
    private String nDate;

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public String getnMessage() {
        return nMessage;
    }

    public void setnMessage(String nMessage) {
        this.nMessage = nMessage;
    }

    public String getnDate() {
        return nDate;
    }

    public void setnDate(String nDate) {
        this.nDate = nDate;
    }
}
