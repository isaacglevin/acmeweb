package com.acme.statusmgr;

public class TempLocationDecorator implements StatusResponse {

    private final StatusResponse wrapped;
    private static SystemStatusFacade facade = new RealSystemStatusFacade();

    public static void setFacade(SystemStatusFacade f) {
        facade = f;
    }

    public TempLocationDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and the server's temp file location is " + facade.getTempLocation();
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 29;
    }
}
