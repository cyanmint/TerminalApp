package android.system.virtualmachine;

/** Stub class for VirtualMachineCustomImageConfig - only for compilation */
public class VirtualMachineCustomImageConfig {
    public static class Builder {
        public Builder setName(String name) { return this; }
        public Builder setBootloaderPath(String path) { return this; }
        public Builder setKernelPath(String path) { return this; }
        public Builder setInitrdPath(String path) { return this; }
        public Builder useNetwork(boolean use) { return this; }
        public Builder useAutoMemoryBalloon(boolean use) { return this; }
        public Builder useTouch(boolean use) { return this; }
        public Builder useKeyboard(boolean use) { return this; }
        public Builder useMouse(boolean use) { return this; }
        public Builder useTrackpad(boolean use) { return this; }
        public Builder useSwitches(boolean use) { return this; }
        public Builder setAudioConfig(AudioConfig config) { return this; }
        public Builder setDisplayConfig(DisplayConfig config) { return this; }
        public Builder setGpuConfig(GpuConfig config) { return this; }
        public Builder addParam(String param) { return this; }
        public Builder addDisk(Disk disk) { return this; }
        public Builder addSharedPath(SharedPath path) { return this; }
        public VirtualMachineCustomImageConfig build() { return new VirtualMachineCustomImageConfig(); }
    }
    
    public static class AudioConfig {
        public static class Builder {
            public Builder setUseMicrophone(boolean use) { return this; }
            public Builder setUseSpeaker(boolean use) { return this; }
            public AudioConfig build() { return new AudioConfig(); }
        }
    }
    
    public static class DisplayConfig {
        public static class Builder {
            public Builder setWidth(int width) { return this; }
            public Builder setHeight(int height) { return this; }
            public Builder setHorizontalDpi(int dpi) { return this; }
            public Builder setVerticalDpi(int dpi) { return this; }
            public Builder setRefreshRate(int rate) { return this; }
            public DisplayConfig build() { return new DisplayConfig(); }
        }
    }
    
    public static class GpuConfig {
        public static class Builder {
            public Builder setBackend(String backend) { return this; }
            public Builder setPciAddress(String address) { return this; }
            public Builder setRendererFeatures(String features) { return this; }
            public Builder setRendererUseEgl(boolean use) { return this; }
            public Builder setRendererUseGles(boolean use) { return this; }
            public Builder setRendererUseGlx(boolean use) { return this; }
            public Builder setRendererUseSurfaceless(boolean use) { return this; }
            public Builder setRendererUseVulkan(boolean use) { return this; }
            public Builder setContextTypes(String[] types) { return this; }
            public GpuConfig build() { return new GpuConfig(); }
        }
    }
    
    public static class Disk {
        public static class RWDisk extends Disk {
            public RWDisk(String path) {}
        }
        public static class RODisk extends Disk {
            public RODisk(String path) {}
        }
        public void addPartition(Partition partition) {}
    }
    
    public static class Partition {
        public Partition(String label, String path, boolean writable, String guid) {}
    }
    
    public static class SharedPath {
        public SharedPath(String path, int hostUid, int hostGid, int guestUid, int guestGid, int perms, String tag, String name, boolean appDomain, String socketPath) {}
    }
    
    public String getName() { return ""; }
}
