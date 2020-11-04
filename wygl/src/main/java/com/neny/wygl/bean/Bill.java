package com.neny.wygl.bean;

/**
 * projectName: wygl
 *
 * @author: 王子琦
 * time: 2020/11/4 9:12
 * description:账单
 */
public class Bill {
    private int billId;
    private float billMoney;
    private String billDate;
    private int billState;
    private int ownerId;
    private int houseId;
    private Owner owner;
    private House house;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public float getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(float billMoney) {
        this.billMoney = billMoney;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public int getBillState() {
        return billState;
    }

    public void setBillState(int billState) {
        this.billState = billState;
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
