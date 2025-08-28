# CLAUDE.md
This document provides guidance to Claude Code when working in this source code repository.

## PURPOSE
The goals of the `example-gradle-plugin` project are to:
- demonstrate the implementation of a Gradle plugin
- illustrate the testing of a Gradle plugin including
   - unit tests
   - functional tests
   - integration tests, using the plugin in a `build.gradle` file to build an application

## APPROACH
`execs` achieves its goals by:
- For executing native system processes
   - allows a user to define a task to run as list of strings with optional configuration and environment variables to
     consider as part of the execution context, and returning either a String result and throwing an exception on 
     failure or returning a map that describes the success or failure of the operation
- For validating shell scripts:
   - using the execution tasks above to call `shellcheck`, and formatting the returned results from `shellcheck`. (Note 
     that `shellcheck` is thus a dependency.)

## TECH STACK
- **Language**: Groovy
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
- `plugin-integration-test/`: the subproject to implement the plugin's quality assurance (QA) test
   - `plugin-integration-test/app`: the application to build, whose build will use the plugin
      - `plugin-integration-test/app/src`: the application's source code
      - `plugin-integration-test/app/test`: unit tests for the application
      - `plugin-integration-test/build.gradle`: the Gradle build for the test application that uses the plugin
- `docs/`: documentation
   - `docs/development-philosophies/development-philosophies.md`: guiding development philosophies 
   - `docs/style/`: style guide 
- `README.md`: project overview

### Commands
todo! need to run both "plugin" and it's "qa tests"
1. Run tests: `./gradlew test`
1. Build the project: `./gradlew build`

### Searching the Code Base
1. Don't use grep `grep -r "pattern" .`, and instead use rg `rg "pattern"`.
1. Don't use find with name `find . -name "*.clj`, and instead use rg with file filtering as either `rg --files | rg 
   "\.clj$" or rg --files -g "*.clj"`