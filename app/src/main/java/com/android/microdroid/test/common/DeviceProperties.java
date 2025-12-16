package com.android.microdroid.test.common;

/** Stub class for DeviceProperties - only for compilation */
public class DeviceProperties {
    public static int getCpuCount() {
        return Runtime.getRuntime().availableProcessors();
    }
    
    public static long getTotalMemory() {
        return Runtime.getRuntime().maxMemory();
    }
}
