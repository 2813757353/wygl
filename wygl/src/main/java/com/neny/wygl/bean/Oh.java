package com.neny.wygl.bean;

/**
 * projectName: wygl
 *
 * @author: 王子琦
 * time: 2020/11/4 9:14
 * description:业主房屋
 */
public class Oh {
    private int ohId;
    private String ohDate;
    private int ownerId;
    private int houseId;

    public int getOhId() {
        return ohId;
    }

    public void setOhId(int ohId) {
        this.ohId = ohId;
    }

    public String getOhDate() {
        return ohDate;
    }

    public void setOhDate(String ohDate) {
        this.ohDate = ohDate;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }
}
