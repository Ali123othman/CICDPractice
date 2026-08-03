# CI/CD Practice - Java Gradle Project

A hands-on DevOps learning project demonstrating a modern Continuous Integration (CI) workflow for a Java application using Gradle and GitHub Actions.

## Project Goals

This project was built to practice:

- Java application development
- Gradle build automation
- Dependency management
- Executable (Fat/Uber) JAR creation
- Git and GitHub workflow
- Continuous Integration (CI) with GitHub Actions
- Automated unit testing with JUnit 5

---

# Technologies

- Java
- Gradle
- JUnit 5
- Git
- GitHub
- GitHub Actions
- Shadow Gradle Plugin

---

# Project Structure

```
CICDpractice
│
├── .github/
│   └── workflows/
│       └── gradle.yml
│
├── gradle/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Ali/
│   │           └── Main.java
│   │
│   └── test/
│       └── java/
│           └── Ali/
│               └── MainTest.java
│
├── build.gradle
├── settings.gradle
├── gradlew
└── gradlew.bat
```

---

# Features Implemented

## Gradle Build

- Gradle Wrapper
- Dependency management
- Build automation
- Application plugin

---

## Dependency Management

Example dependency:

- Gson

Gradle automatically downloads all required libraries.

---

## Executable JAR

The project produces an executable JAR containing:

- Application classes
- Third-party dependencies
- Manifest with Main-Class

Generated using the Shadow plugin.

---

## Unit Testing

JUnit 5 is configured.

Current implementation includes:

- Example unit test
- Local execution using Gradle
- HTML test reports

Run locally:

```bash
./gradlew test
```

Windows:

```powershell
.\gradlew test
```

---

## Continuous Integration

GitHub Actions automatically executes on every push to the `main` branch.

Pipeline steps:

1. Checkout repository
2. Install Java
3. Execute Gradle build
4. Run all JUnit tests
5. Report build status

Workflow location:

```
.github/workflows/gradle.yml
```

---

# Build Project

Linux/macOS

```bash
./gradlew build
```

Windows

```powershell
.\gradlew build
```

---

# Run Executable JAR

```bash
java -jar build/libs/CICDpractice-1.0-SNAPSHOT-all.jar
```

---

# CI Workflow

```
Developer
    │
git push
    │
    ▼
GitHub
    │
    ▼
GitHub Actions
    │
    ├── Checkout Repository
    ├── Install Java
    ├── Build Project
    ├── Run Unit Tests
    └── Report Success / Failure
```

---

# Skills Practiced

- Java
- Gradle
- Dependency Management
- Build Automation
- JUnit Testing
- Git
- GitHub
- GitHub Actions
- Continuous Integration (CI)

---

# Future Improvements

Planned next steps:

- Dockerize the application
- Build Docker images using Github actions
- Publish Docker images to Docker Hub
- Deploy the application using a free cloud platform (e.g., Render)
- Add Continuous Deployment (CD)
- Add monitoring and logging
