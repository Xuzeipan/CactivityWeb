package com.ldi.POJO;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Apply {
    private int id;     //报名表id
    private int acId;   //活动Id
    private int userId;     //userId
    @JSONField(format = "yyyy-MM-dd")
    private Date applyTime;     //报名时间

    public Apply(){

    }
    public Apply(int id, int acId, int userId, Date applyTime) {
        this.id = id;
        this.acId = acId;
        this.userId = userId;
        this.applyTime = applyTime;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "id=" + id +
                ", acId=" + acId +
                ", userId=" + userId +
                ", applyTime=" + applyTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAcId() {
        return acId;
    }

    public void setAcId(int acId) {
        this.acId = acId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}
