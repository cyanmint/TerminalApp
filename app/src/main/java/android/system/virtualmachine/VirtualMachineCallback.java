package android.system.virtualmachine;

/** Stub class for VirtualMachineCallback - only for compilation */
public interface VirtualMachineCallback {
    default void onPayloadStarted(VirtualMachine vm) {}
    default void onPayloadReady(VirtualMachine vm) {}
    default void onPayloadFinished(VirtualMachine vm, int exitCode) {}
    default void onError(VirtualMachine vm, int errorCode, String message) {}
    default void onStopped(VirtualMachine vm, int reason) {}
}
