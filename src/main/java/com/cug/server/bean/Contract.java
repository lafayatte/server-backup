package com.cug.server.bean;

/**
 * @author: gg
 * @Time: 2021/12/14  21:24
 */
public class Contract {
    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String conName;
    private String address;

    public Contract(String conName, String address) {
        this.conName = conName;
        this.address = address;
    }

}
