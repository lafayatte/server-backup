package com.cug.server.bean;

import java.sql.Timestamp;

/**
 * @author: gg
 * @Time: 2021/12/14  21:59
 */
public class Accident {
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getAccTime() {
        return accTime;
    }

    public void setAccTime(Timestamp accTime) {
        this.accTime = accTime;
    }

    public Accident(int aId, Timestamp accTime, String sensor, int v1, int v2, String result, boolean flag, String image) {
        this.aId = aId;
        this.accTime = accTime;
        this.sensor = sensor;
        this.v1 = v1;
        this.v2 = v2;
        this.result = result;
        this.flag = flag;
        this.image = image;
    }

    private int aId;
    private Timestamp accTime;
    private  String sensor;
    private int v1;
    private int v2;
    private String result;
    private boolean flag;
    private String image;
}
