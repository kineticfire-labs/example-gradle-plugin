# CLAUDE.md
This document provides guidance to Claude Code when working in this source code repository.

## PURPOSE
The goals of the `example-gradle-plugin` project are to:
- demonstrate the implementation of a Gradle plugin
- illustrate the testing of a Gradle plugin including
   - unit tests
   - functional tests
   - integration tests, using the plugin in a `build.gradle` file to build an application

## TECH STACK
- **Language**: Groovy (for the plugin) and Java (for the integration test application)
- **Build and Dependency Management**: Gradle
- **Testing and Specification Framework**: JUnit and Spock
- **Test DSL**: Groovy
- **Version Control:** Git
- **AI-assisted Infrastructure-as-Code & DevOps:** Claude Code

## PROJECT STRUCTURE
- `plugin/`: the subproject to implement the plugin
   - `plugin/src/main`: the source code for the plugin
   - `plugin/src/test`: unit tests for the plugin
   - `plugin/src/functionalTest`: functional tests for the plugin
- `plugin-integration-test/`: the subproject to implement the plugin's integration test, by using a `build.gradle` that
  uses the plugin to build a Java application
   - `plugin-integration-test/src/`: the application's source code
   - `plugin-integration-test/test/`: unit tests for the application
   - `plugin-integration-test/build.gradle`: the Gradle build for the test application that uses the plugin
- `docs/`: documentation
   - `docs/development-philosophies/development-philosophies.md`: guiding development philosophies 
   - `docs/style/`: style guide 
- `README.md`: project overview

### Commands
1. Run unit and functional tests
   1. From the `plugin/` directory, run `./gradlew clean test` 
1. Build the project
   1. From the `plugin/` directory, run `./gradlew clean build`
      1. Runs both unit tests and functional tests, then builds the plugin to 
      `plugin/build/libs/example-gradle-plugin-<version>.jar` 
1. Run integration tests
   1. From the `plugin-integration-test/` directory, run `./gradlew -PpluginVersion=1.0.0 clean build` where the 
   property `PpluginVersion` is the plugin's version 
   1. Note: must first build the plugin to `plugin/build/libs/example-gradle-plugin-<version>.jar` by running 
   `./gradlew clean build` from the `plugin/` directory

### Searching the Code Base
1. Don't use grep `grep -r "pattern" .`, and instead use rg `rg "pattern"`.
1. Don't use find with name `find . -name "*.clj`, and instead use rg with file filtering as either `rg --files | rg 
   "\.clj$" or rg --files -g "*.clj"`