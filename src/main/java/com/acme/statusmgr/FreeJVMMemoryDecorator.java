package com.acme.statusmgr;

public class FreeJVMMemoryDecorator implements StatusResponse {

    private final StatusResponse wrapped;
    private static SystemStatusFacade facade = new RealSystemStatusFacade();

    public static void setFacade(SystemStatusFacade f) {
        facade = f;
    }

    public FreeJVMMemoryDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and there are " + facade.getFreeJVMMemory() + " bytes of JVM memory free";
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 7;
    }
}
