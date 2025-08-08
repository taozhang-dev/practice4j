# Repository Guidelines

## Project Structure & Module Organization
- Source: `src/main/{java,kotlin,scala}` with entry points `Main` (Java), `MainK` (Kotlin), `MainS` (Scala).
- Tests: `src/test/{java,kotlin,scala}` using JUnit 5 (Kotlin uses `kotlin-test-junit5`).
- Build tooling: Gradle wrapper (`gradlew`, `build.gradle`, `settings.gradle`).
- CI: GitHub Actions at `.github/workflows/gradle.yml` runs build and tests on JDK 21.
- Docs: `docs/` (e.g., `docs/tasks.md`).

## Build, Test, and Development Commands
- Build: `./gradlew build` — compiles all languages and runs tests.
- Test: `./gradlew test` — executes unit tests with JUnit Platform.
- Run (Java Main): `./gradlew run` — runs `Main` as configured by the Application plugin.
- Clean: `./gradlew clean` — removes build outputs.
- Toolchains: Java/Kotlin target JDK 21; ensure local JDK 21 or rely on Gradle toolchains.

## Coding Style & Naming Conventions
- Indentation: 4 spaces; UTF-8 encoding (configured for Java compile tasks).
- Packages: Prefer `com.example.practice4j` and avoid default package (create matching directories under `src/main/<lang>`).
- Names: Classes `PascalCase`, methods/fields `camelCase`, constants `UPPER_SNAKE_CASE`.
- Language features: Use modern Java 21, Kotlin 2.x, Scala 3 idioms; keep functions small and tested.

## Testing Guidelines
- Frameworks: JUnit 5 across Java/Scala; Kotlin uses `kotlin-test` with JUnit 5.
- Test layout: Mirror source tree under `src/test/<lang>`; name tests `<ClassName>Test`.
- Assertions: Prefer clear, single-responsibility tests; verify console output via `ByteArrayOutputStream` as in existing tests.
- Run locally: `./gradlew test`; ensure tests pass before pushing.

## Commit & Pull Request Guidelines
- Commits (observed): short, imperative summaries (e.g., “Add Scala support”), optional body for context.
- Suggested format: 50-char subject, 72-char wrapped body; group related changes.
- PRs: describe intent and scope, link issues, include before/after notes or sample output, ensure CI green (`build` and `test`).

## Security & Configuration Tips
- Use the Gradle wrapper (`./gradlew`) to ensure consistent versions.
- Do not commit secrets; prefer environment variables or local configs ignored by VCS.
