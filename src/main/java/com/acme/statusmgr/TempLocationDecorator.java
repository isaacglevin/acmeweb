package com.acme.statusmgr;

public class TempLocationDecorator implements StatusResponse {
    private final StatusResponse wrapped;

    public TempLocationDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and the server's temp file location is M:\\\\AppData\\\\Local\\\\Temp";
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 29;
    }
}
