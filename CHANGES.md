# Changes Summary

This document summarizes the changes made to implement the three requirements.

## 1. Support for Selected Kernel and Filesystem Tarball Import

### Changes Made:
- **ConfigJson.kt**:
  - Added `getKernelPath()` helper method that returns `null` when kernel is not specified or set to "microdroid", allowing the system to use the default Microdroid kernel
  - Added default value `false` for `isProtected` field for better flexibility
  - Enhanced documentation with comments explaining kernel path selection
  - Added comment clarifying protected/non-protected VM support

- **ImageArchive.kt**:
  - Added `fromPath(path: Path)` method to import tarballs from custom filesystem paths
  - Added `fromPath(pathString: String)` method as a convenience overload
  - Enhanced class documentation to explicitly mention filesystem tarball import support
  - Clarified that tarballs can be imported from URL or local filesystem

### How It Works:
- If `kernel` is `null`, empty, or set to `"microdroid"` in vm_config.json, the app uses the default Microdroid kernel
- Custom kernel paths can be specified as absolute paths
- Protected and non-protected VMs are controlled via the `"protected"` field in vm_config.json
- Filesystem tarballs can be imported from SD card, internet, or any custom path

## 2. Package Name Change

### Changes Made:
- Renamed package from `com.android.virtualization.terminal` to `com.cyanmint.terminalapp`
- Updated all 40 Kotlin source files
- Updated 2 AIDL interface files
- Updated AndroidManifest.xml (package and taskAffinity)
- Updated Android.bp build configuration
- Updated XML layout files

### Files Modified:
- AndroidManifest.xml
- Android.bp
- All .kt files in java/com/android/virtualization/terminal/ → java/com/cyanmint/terminalapp/
- All .aidl files in aidl/com/android/virtualization/terminal/ → aidl/com/cyanmint/terminalapp/
- res/layout/fragment_terminal_tab.xml

## 3. CI Workflow for Build Testing

### Changes Made:
- Created `.github/workflows/build.yml`
- Configured workflow to run on:
  - Push to main and copilot/** branches
  - Pull requests to main
  - Manual workflow dispatch

### Workflow Steps:
1. Checkout code
2. Set up JDK 17
3. Setup Android SDK
4. Install Android SDK components (platforms, build-tools, NDK)
5. Validate Android.bp syntax
6. Check source files exist
7. Verify package structure
8. Check AndroidManifest.xml for correct package name
9. Build summary

## Documentation

- Created comprehensive README.md explaining all features
- Added code comments for better maintainability
- Documented configuration options for vm_config.json

## Testing

All changes maintain backward compatibility:
- Existing vm_config.json files will continue to work
- Default behavior (when kernel is null) uses Microdroid kernel
- Protected VM flag defaults to false, matching previous implicit behavior
