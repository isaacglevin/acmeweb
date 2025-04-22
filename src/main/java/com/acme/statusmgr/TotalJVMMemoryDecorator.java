package com.acme.statusmgr;

public class TotalJVMMemoryDecorator implements StatusResponse {

    private final StatusResponse wrapped;
    private static SystemStatusFacade facade = new RealSystemStatusFacade();

    public static void setFacade(SystemStatusFacade f) {
        facade = f;
    }

    public TotalJVMMemoryDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and there is a total of " + facade.getTotalJVMMemory() + " bytes of JVM memory";
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 13;
    }
}
