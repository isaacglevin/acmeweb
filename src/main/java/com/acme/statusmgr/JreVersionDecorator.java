package com.acme.statusmgr;

public class JreVersionDecorator implements StatusResponse {

    private final StatusResponse wrapped;
    private static SystemStatusFacade facade = new RealSystemStatusFacade();

    public static void setFacade(SystemStatusFacade f) {
        facade = f;
    }

    public JreVersionDecorator(StatusResponse wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getStatusDesc() {
        return wrapped.getStatusDesc() + ", and the JRE version is " + facade.getJreVersion();
    }

    @Override
    public int getRequestCost() {
        return wrapped.getRequestCost() + 19;
    }
}
