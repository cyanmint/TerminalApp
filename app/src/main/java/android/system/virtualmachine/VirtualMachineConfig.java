package android.system.virtualmachine;

import android.content.Context;

/** Stub class for VirtualMachineConfig - only for compilation */
public class VirtualMachineConfig {
    public static final int CPU_TOPOLOGY_ONE_CPU = 1;
    public static final int CPU_TOPOLOGY_MATCH_HOST = 2;
    public static final int DEBUG_LEVEL_NONE = 0;
    public static final int DEBUG_LEVEL_FULL = 1;
    
    public static class Builder {
        public Builder(Context context) {}
        public Builder setProtectedVm(boolean isProtected) { return this; }
        public Builder setMemoryBytes(long bytes) { return this; }
        public Builder setConsoleInputDevice(String device) { return this; }
        public Builder setCpuTopology(int topology) { return this; }
        public Builder setCustomImageConfig(VirtualMachineCustomImageConfig config) { return this; }
        public Builder setDebugLevel(int level) { return this; }
        public Builder setVmOutputCaptured(boolean captured) { return this; }
        public Builder setConnectVmConsole(boolean connect) { return this; }
        public VirtualMachineConfig build() { return new VirtualMachineConfig(); }
    }
    
    public VirtualMachineCustomImageConfig getCustomImageConfig() { return null; }
}
