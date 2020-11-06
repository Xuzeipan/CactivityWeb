package com.ldi.POJO;

import com.alibaba.fastjson.annotation.JSONField;
import jdk.net.SocketFlow;

import java.util.Date;

public class Activity {
    private int id;     //活动id
    private String acName;     //活动名
    @JSONField(format = "yyyy-MM-dd")
    private Date applyStopTime;     //报名截止时间
    @JSONField(format = "yyyy-MM-dd")
    private Date acStartTime;       //活动开始时间
    @JSONField(format = "yyyy-MM-dd")
    private Date acStopTime;        //活动结束时间
    private String place;       //活动地点
    private String applySum;        //参加人数上限
    private String applyObj;        //活动面向对象
    private String principal;       //项目负责人
    private String college;         //学院
    private int status;     //状态码：0--未开始    1--进行中      2--已结束
    private int applyNumber;        //已报名人数
    private String file;        //文件名

    public Activity(){

    }
    public Activity(int id, String acName, Date applyStopTime, Date acStartTime, Date acStopTime, String place, String applySum, String applyObj, String principal, String college, int status, int applyNumber, String file) {
        this.id = id;
        this.acName = acName;
        this.applyStopTime = applyStopTime;
        this.acStartTime = acStartTime;
        this.acStopTime = acStopTime;
        this.place = place;
        this.applySum = applySum;
        this.applyObj = applyObj;
        this.principal = principal;
        this.college = college;
        this.status = status;
        this.applyNumber = applyNumber;
        this.file = file;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", acName='" + acName + '\'' +
                ", applyStopTime=" + applyStopTime +
                ", acStartTime=" + acStartTime +
                ", acStopTime=" + acStopTime +
                ", place='" + place + '\'' +
                ", applySum='" + applySum + '\'' +
                ", applyObj='" + applyObj + '\'' +
                ", principal='" + principal + '\'' +
                ", college='" + college + '\'' +
                ", status=" + status +
                ", applyNumber=" + applyNumber +
                ", file='" + file + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public Date getApplyStopTime() {
        return applyStopTime;
    }

    public void setApplyStopTime(Date applyStopTime) {
        this.applyStopTime = applyStopTime;
    }

    public Date getAcStartTime() {
        return acStartTime;
    }

    public void setAcStartTime(Date acStartTime) {
        this.acStartTime = acStartTime;
    }

    public Date getAcStopTime() {
        return acStopTime;
    }

    public void setAcStopTime(Date acStopTime) {
        this.acStopTime = acStopTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getApplySum() {
        return applySum;
    }

    public void setApplySum(String applySum) {
        this.applySum = applySum;
    }

    public String getApplyObj() {
        return applyObj;
    }

    public void setApplyObj(String applyObj) {
        this.applyObj = applyObj;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(int applyNumber) {
        this.applyNumber = applyNumber;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
