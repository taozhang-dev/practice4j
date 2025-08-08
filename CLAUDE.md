# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build and Development Commands

### Building the project
```bash
./gradlew build        # Build all modules (Java, Kotlin, Scala)
./gradlew clean build  # Clean and rebuild
```

### Running the application
```bash
./gradlew run          # Run the main Java class (Main.java)
```

### Testing
```bash
./gradlew test         # Run all tests (Java, Kotlin, Scala)
./gradlew test --tests "MainTest"     # Run specific Java test class
./gradlew test --tests "MainKTest"    # Run specific Kotlin test class
./gradlew test --tests "MainSTest"    # Run specific Scala test class
```

### Code quality and checks
```bash
./gradlew check        # Run all verification tasks
```

## Project Architecture

This is a multi-language JVM project demonstrating interoperability between Java, Kotlin, and Scala. The project uses Gradle as its build system with JDK 21 toolchain.

### Key Technologies
- **Build System**: Gradle with Kotlin DSL capability
- **Languages**: Java, Kotlin, Scala 3
- **Test Framework**: JUnit 5 (Jupiter) for all languages
- **JVM Version**: Java 21 (configured via toolchain)

### Project Structure
The project follows standard Gradle conventions with separate source sets for each language:
- `src/main/java/` - Java source code
- `src/main/kotlin/` - Kotlin source code
- `src/main/scala/` - Scala source code
- `src/test/*/` - Corresponding test directories

### Current Implementation
The project contains parallel implementations of a simple loop demonstration in all three languages:
- **Main.java** - Java implementation
- **MainK.kt** - Kotlin implementation
- **MainS.scala** - Scala implementation

Each prints numbers 1-5 in the format "i = X". The Java version is configured as the default main class.

### Build Configuration Notes
- Gradle caching and parallel execution are enabled for faster builds
- JVM memory is configured with 2GB heap and 512MB metaspace
- All Java compilation uses UTF-8 encoding
- Test output shows passed, skipped, and failed events for better visibility

### Development Tasks
The project includes a comprehensive task list in `docs/tasks.md` outlining potential improvements across various areas including testing, documentation, CI/CD, architecture, and code quality.