package com.acme.statusmgr;

public class AvailableProcessorsDecorator implements StatusResponse {

    private final StatusResponse wrapped;

    private static SystemStatusFacade facade = new RealSystemStatusFacade();

    public static void setFacade(SystemStatusFacade f) {
        facade = f;
    }

    public AvailableProcessorsDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and there are " + facade.getAvailableProcessors() + " processors available";
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 3;
    }
}
