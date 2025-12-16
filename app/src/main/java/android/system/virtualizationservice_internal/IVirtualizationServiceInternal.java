package android.system.virtualizationservice_internal;

import android.os.IBinder;

/** Stub interface for IVirtualizationServiceInternal - only for compilation */
public interface IVirtualizationServiceInternal {
    void enableTestAttestation() throws android.os.RemoteException;
    
    public static abstract class Stub extends android.os.Binder implements IVirtualizationServiceInternal {
        public static IVirtualizationServiceInternal asInterface(IBinder obj) {
            return null;
        }
    }
}
