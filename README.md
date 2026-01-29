# Template Java Project

A modular Java 21 project using Gradle, organized with a clean architecture approach.

## Project Structure

- **parent-module/domain**: Core business logic and domain models
- **parent-module/application**: Application layer, orchestrates use cases
- **parent-module/infrastructure**: Infrastructure concerns (logging, adapters, etc)

## Features
- Java 21
- Modular multi-project Gradle build
- JUnit 5 and Mockito for testing
- Clean separation of domain, application, and infrastructure

## Getting Started

### Prerequisites
- Java 21+
- Gradle (wrapper included)

### Build the Project
```sh
./gradlew build
```

### Run Tests
```sh
./gradlew test
```

## Usage
You can use this template as a starting point for new Java projects following best practices for modularity and testability.

## License
MIT

