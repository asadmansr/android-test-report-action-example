# Android Test Report Action Example

This repository is an example Android application that uses the [Android Test Report Action](https://github.com/asadmansr/android-test-report-action).

<br>

### Android Test Report Action

Android Test Report Action is a GitHub Action that prints xml reports that are produced when running Android Unit tests. This action provides insights on which tests were passed and which failed during the test job on the CI/CD pipeline.

.github/workflows/ci-pipeline.yml
```
jobs:
  test:
    ...
    - name: Android Test Report
      uses: asadmansr/android-test-report-action@master
```

<br>

### Tests

Currently, the project contains unit tests for the following authentication logic:
- EmailValidator.kt
- PasswordValidator.kt

<br>

### GitHub Action Pipeline

The repository is using GitHub Action as the continuous integration (CI) pipeline. As of now, the pipeline executes the unit tests using `./gradlew testDebugUnitTest`.

<br>

### Passed and Failed Pipeline

- [master](https://github.com/asadmansr/android-test-report-action-example) branch: Passed pipeline as all the tests passed
- [failed-pipeline](https://github.com/asadmansr/android-test-report-action-example/tree/failed-pipeline) branch: Failed pipeline as some of the tests failed