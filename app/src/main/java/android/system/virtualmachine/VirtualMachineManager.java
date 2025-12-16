package android.system.virtualmachine;

import android.content.Context;

/** Stub class for VirtualMachineManager - only for compilation */
public class VirtualMachineManager {
    public VirtualMachine getOrCreate(String name, VirtualMachineConfig config) throws VirtualMachineException {
        return new VirtualMachine();
    }
    
    public VirtualMachine create(String name, VirtualMachineConfig config) throws VirtualMachineException {
        return new VirtualMachine();
    }
    
    public VirtualMachine get(String name) {
        return new VirtualMachine();
    }
    
    public void delete(String name) throws VirtualMachineException {}
    
    public String[] list() {
        return new String[0];
    }
}
