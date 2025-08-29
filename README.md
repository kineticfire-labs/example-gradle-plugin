# example-gradle-plugin
[![Powered by KineticFire Labs](https://img.shields.io/badge/Powered_by-KineticFire_Labs-CDA519?link=https%3A%2F%2Flabs.kineticfire.com%2F)](https://labs.kineticfire.com/)
[![License: Apache 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A comprehensive example Gradle plugin that demonstrates custom plugin development, testing strategies, and real-world integration patterns.

## Purpose

This project serves as a complete reference implementation for Gradle plugin development, showcasing:

- **Custom Plugin Creation** - How to build a functional Gradle plugin from scratch
- **Comprehensive Testing Strategy** - Unit tests, functional tests, and integration tests
- **Real Integration Example** - Actual usage of the plugin in a working application
- **Best Practices** - Following Gradle plugin development conventions and patterns

## Why This Example is Valuable

- ✨ **Learn by Example** - Complete, working codebase you can study and modify
- 🧪 **Testing Excellence** - Demonstrates industry best practices for plugin testing
- 🎯 **Real Integration** - Shows how plugins are actually used in projects
- 🚀 **Perfect Starting Point** - Ideal foundation for your custom plugin development
- 📚 **Educational Resource** - Comprehensive documentation and clear code structure

## Project Structure

### Plugin Implementation (`plugin/`)
- **Source Code**: `src/main/groovy/com/kineticfire/gradle/example_gradle_plugin/`
  - `ExampleGradlePlugin.groovy` - Main plugin class that registers custom tasks
  - `ExampleTask.groovy` - Custom example task implementation
  - `SampleTask.groovy` - Custom sample task implementation
- **Unit Tests**: `src/test/groovy/` - Tests for plugin logic and task registration
- **Functional Tests**: `src/functionalTest/groovy/` - Tests using Gradle TestKit for real plugin execution

### Integration Test (`plugin-integration-test/`)
- **Application**: `src/main/java/` - Simple Java application that uses the plugin
- **Tests**: `src/test/groovy/` - Spock tests for the example application
- **Build Script**: `build.gradle` - Real-world example demonstrating plugin usage

## Quick Start

### 1. Build the Plugin
```bash
cd plugin
./gradlew build
```
This creates the plugin JAR at `build/libs/example-gradle-plugin-1.0.0.jar`

### 2. Run Integration Test
```bash
cd ../plugin-integration-test
./gradlew -PpluginVersion=1.0.0 clean build run
```
Expected output: `Howdy, World!`

### 3. Try Plugin Tasks
```bash
./gradlew -PpluginVersion=1.0.0 exampleTask sampleTask
```

## Testing Guide

### Unit Tests
Tests the plugin's core functionality:
```bash
cd plugin
./gradlew test
```

### Functional Tests  
Tests plugin execution using Gradle TestKit:
```bash
cd plugin
./gradlew functionalTest
```

### Integration Tests
Tests the plugin in a real project:
```bash
cd plugin-integration-test
./gradlew -PpluginVersion=1.0.0 test
```

### Run All Tests
```bash
cd plugin
./gradlew clean build  # Runs unit + functional tests

cd ../plugin-integration-test  
./gradlew -PpluginVersion=1.0.0 clean build  # Runs integration tests
```

## Plugin Features

The example plugin provides two custom tasks:

- **`exampleTask`** - Demonstrates basic task implementation
- **`sampleTask`** - Shows additional task functionality

Both tasks are grouped under "Example Plugin" in the task list:
```bash
./gradlew tasks --group="Example Plugin"
```

## Custom Plugin Version

Build the plugin with a custom version:
```bash
cd plugin
./gradlew -PpluginVersion=2.0.0 build
```

Then use it in the integration test:
```bash
cd ../plugin-integration-test
./gradlew -PpluginVersion=2.0.0 clean build run
```

## Development

### Code Organization
- Follow the established package structure: `com.kineticfire.gradle.example_gradle_plugin`
- Maintain separation between plugin logic (`plugin/`) and usage examples (`plugin-integration-test/`)
- Add tests for any new functionality

### Documentation
- `CLAUDE.md` - Project-specific development guidance
- `docs/development-philosophies/` - Guiding development principles
- `docs/style/` - Code style guidelines

## License

Licensed under the Apache License, Version 2.0. See the [LICENSE](LICENSE) file for details.

---

*This project demonstrates professional Gradle plugin development practices and serves as an excellent foundation for building your own custom plugins.*