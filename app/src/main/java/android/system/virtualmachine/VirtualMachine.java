package android.system.virtualmachine;

/** Stub class for VirtualMachine - only for compilation */
public class VirtualMachine {
    public String getName() { return ""; }
    public void run() {}
    public void stop() {}
    public void setCallback(java.util.concurrent.Executor executor, VirtualMachineCallback callback) {}
    public VirtualMachineConfig getConfig() { return null; }
    public void setConfig(VirtualMachineConfig config) {}
    public java.io.InputStream getConsoleOutput() { return null; }
    public java.io.OutputStream getConsoleInput() { return null; }
    public int getCid() { return 0; }
}
