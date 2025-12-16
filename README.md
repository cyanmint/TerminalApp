# Cyanmint Terminal App

A terminal application for running Linux VMs on Android using the Android Virtualization Framework (AVF).

## Features

### 1. Kernel Selection

The app supports flexible kernel configuration:

- **Default Microdroid Kernel**: Set `kernel: null` or `kernel: "microdroid"` in your `vm_config.json` to use the default Microdroid kernel
- **Custom Kernel**: Provide an absolute path to your custom kernel image file

Example `vm_config.json`:
```json
{
  "protected": false,
  "kernel": "microdroid",
  "initrd": "/path/to/initrd.img",
  "name": "my-vm",
  ...
}
```

Or with a custom kernel:
```json
{
  "protected": false,
  "kernel": "/data/local/tmp/custom-kernel.img",
  "initrd": "/path/to/initrd.img",
  "name": "my-vm",
  ...
}
```

### 2. Protected and Non-Protected VMs

The app supports both protected and non-protected virtual machines:

- **Protected VM** (`"protected": true`): Runs in a secure, isolated environment with hardware-backed protection
- **Non-Protected VM** (`"protected": false`): Standard VM without additional security isolation

Configure this in your `vm_config.json`:
```json
{
  "protected": true,  // or false for non-protected VMs
  ...
}
```

### 3. Filesystem Tarball Import

The app can import filesystem tarballs from multiple sources:

- **Internet**: Downloads from official repositories automatically
- **SD Card**: Place `images.tar.gz` in `/sdcard/linux/` directory (debuggable builds only)
- **Custom Path**: Use `ImageArchive.fromPath()` to import from any filesystem location

The tarball should be in `.tar.gz` format and contain:
- VM kernel image (optional, will use Microdroid kernel if not provided)
- Initial ramdisk (initrd)
- Root filesystem
- VM configuration file (`vm_config.json`)
- Build ID file

## Package Name

This app uses the package name `com.cyanmint.terminalapp` to avoid conflicts with system apps.

## Building

This project uses Android.bp build system. The app is configured as a privileged system app.

Build with:
```bash
# Use Android build system (requires AOSP environment)
m CyanmintTerminalApp
```

## Configuration

The VM is configured via `vm_config.json` file which supports:

- **protected**: Boolean, enables protected VM mode
- **kernel**: String or null, path to kernel or "microdroid" for default
- **initrd**: String, path to initial ramdisk
- **bootloader**: String, path to bootloader
- **name**: String, VM instance name
- **memory_mib**: Integer, memory size in MiB
- **cpu_topology**: String, "one_cpu" or "match_host"
- **network**: Boolean, enable networking
- **disks**: Array of disk configurations
- **display**: Display configuration
- **gpu**: GPU configuration
- **audio**: Audio configuration (microphone and speaker)
- **input**: Input device configuration (keyboard, mouse, touchscreen, etc.)

## License

Copyright 2024 The Android Open Source Project

Licensed under the Apache License, Version 2.0. See LICENSE file for details.

## Building

This project supports two build systems:

### Gradle Build (for CI and standalone building)

The project includes Gradle build configuration for easy APK building:

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Clean build
./gradlew clean
```

Built APK files will be in `app/build/outputs/apk/`.

### Android.bp Build (for AOSP integration)

For building as part of the Android Open Source Project:

```bash
# Requires AOSP environment
m CyanmintTerminalApp
```

The Gradle build is used for CI/CD pipelines, while Android.bp is for AOSP system builds.

## Platform Requirements

**Important**: This application uses Android Virtualization Framework (AVF) platform APIs that are not available in the standard Android SDK. The Gradle build includes stub implementations of these platform-specific classes to allow compilation, but the resulting APK will only work when:

1. Running on devices with AVF support (Android 13+ on supported hardware)
2. Built as part of AOSP using Android.bp (for production use)

The Gradle build system with stub APIs is provided for:
- CI/CD validation of code structure
- Development and testing of non-platform-specific features
- Documentation and code analysis

For full functionality, build using the Android.bp system within an AOSP environment.

### Platform APIs Used

- `android.system.virtualmachine.*` - Virtual machine management
- `android.system.virtualizationservice_internal.*` - Virtualization service internals
- `com.android.internal.annotations.*` - Internal Android annotations
- `com.android.system.virtualmachine.flags.*` - Feature flags
- `com.android.microdroid.test.common.*` - Microdroid testing utilities

