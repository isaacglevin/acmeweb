package com.acme.statusmgr;

public class TotalJVMMemoryDecorator implements StatusResponse {

    private final StatusResponse wrapped;

    public TotalJVMMemoryDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and there is a total of " + Runtime.getRuntime().totalMemory() + " bytes of JVM memory";
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 13;
    }
}
