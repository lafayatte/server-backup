package com.cug.server.bean;

/**
 * @author: gg
 * @Time: 2021/12/13  11:47
 */
public class Server {

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

    public Server(String conName, String address) {
        this.conName = conName;
        this.address = address;
    }

}
