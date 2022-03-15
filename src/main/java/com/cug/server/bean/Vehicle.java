package com.cug.server.bean;

/**
 * @author: gg
 * @Time: 2021/12/14  21:41
 */
public class Vehicle {
    public int getVId() {
        return vId;
    }

    public void setVId(int vId) {
        vId = vId;
    }

    public int getGId() {
        return gId;
    }

    public void setGId(int gId) {
        this.gId = gId;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public void setVehicleLicense(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Vehicle(int vId, int gId, String pk, String ownerId, String debitCard, String vehicleLicense, String driverLicense) {
        this.vId = vId;
        this.gId = gId;
        this.pk = pk;
        this.ownerId = ownerId;
        this.debitCard = debitCard;
        this.vehicleLicense = vehicleLicense;
        this.driverLicense = driverLicense;
    }

    private int vId;
    private int gId;
    private String pk;
    private  String ownerId;
    private String debitCard;
    private String vehicleLicense;
    private String driverLicense;
}
