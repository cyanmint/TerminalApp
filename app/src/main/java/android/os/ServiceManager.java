package android.os;

/** Stub class for ServiceManager - only for compilation */
public class ServiceManager {
    public static IBinder getService(String name) {
        return null;
    }
    
    public static IBinder waitForService(String name) {
        return null;
    }
    
    public static void addService(String name, IBinder service) {}
    
    public static String[] listServices() {
        return new String[0];
    }
}
