package com.acme.statusmgr;
public class BasicStatus implements StatusResponse {

    @Override
    public String getStatusDesc() {
        return "Server is up";
    }

    @Override
    public int getRequestCost() {
        return 1;
    }
}
