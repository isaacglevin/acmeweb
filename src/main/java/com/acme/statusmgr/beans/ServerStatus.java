package com.acme.statusmgr.beans;

public class ServerStatus {
    private long id;
    private String contentHeader;
    private String statusDesc;
    private int requestCost;

    public ServerStatus(long id, String contentHeader, String statusDesc, int requestCost) {
        this.id = id;
        this.contentHeader = contentHeader;
        this.statusDesc = statusDesc;
        this.requestCost = requestCost;
    }

    public ServerStatus(long id, String contentHeader) {
        this.id = id;
        this.contentHeader = contentHeader;
        this.statusDesc = "Server is up";
        this.requestCost = 1;
    }

    public long getId() {
        return id;
    }

    public String getContentHeader() {
        return contentHeader;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public int getRequestCost() {
        return requestCost;
    }
}
