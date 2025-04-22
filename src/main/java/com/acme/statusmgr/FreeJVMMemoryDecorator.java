package com.acme.statusmgr;

public class FreeJVMMemoryDecorator implements StatusResponse {
    private final StatusResponse wrapped;

    public FreeJVMMemoryDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and there are " + Runtime.getRuntime().freeMemory() + " bytes of JVM memory free";
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 7;
    }
}
