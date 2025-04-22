package com.acme.statusmgr;

public interface SystemStatusFacade {
    int getAvailableProcessors();
    long getFreeJVMMemory();
    long getTotalJVMMemory();
    String getJreVersion();
    String getTempLocation();
}
