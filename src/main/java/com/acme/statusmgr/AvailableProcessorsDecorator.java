package com.acme.statusmgr;

public class AvailableProcessorsDecorator implements StatusResponse {

    private final StatusResponse wrapped;

    public AvailableProcessorsDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and there are 4 processors available";
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 3;
    }
}
