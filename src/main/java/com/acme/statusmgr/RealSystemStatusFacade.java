package com.acme.statusmgr;

public class RealSystemStatusFacade implements SystemStatusFacade {

    @Override
    public int getAvailableProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long getFreeJVMMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public long getTotalJVMMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override
    public String getJreVersion() {
        return System.getProperty("java.version");
    }

    @Override
    public String getTempLocation() {
        return System.getenv("TEMP");
    }
}
