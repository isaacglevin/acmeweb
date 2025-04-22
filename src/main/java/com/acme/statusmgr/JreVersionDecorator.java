package com.acme.statusmgr;

public class JreVersionDecorator implements StatusResponse {
    private final StatusResponse wrapped;

    public JreVersionDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and the JRE version is " + System.getProperty("java.version");
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 19;
    }
}
