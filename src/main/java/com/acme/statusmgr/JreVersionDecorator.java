package com.acme.statusmgr;

public class JreVersionDecorator implements StatusResponse {
    private final StatusResponse wrapped;

    public JreVersionDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and the JRE version is 15.0.2+7-27";
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 19;
    }
}
