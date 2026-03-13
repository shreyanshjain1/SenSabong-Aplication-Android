# SenSabong Android Application

SenSabong Android Application is a college-era Android Studio project built in Java as part of a research-related app prototype. This repository serves as an archive of an early mobile development project focused on building a simple multi-screen Android application with basic navigation flows.

## Overview

This project was created to test and improve my Android development skills during college. It contains a lightweight native Android app structure using Java and Android Studio, with multiple activities for screen navigation such as landing, login, and registration pages.

The app is best viewed as a learning project / prototype rather than a production-ready release.

## Features

- Native Android app built with Java
- Multi-activity navigation flow
- Starter login screen
- Starter registration screen
- Simple landing / next-page transitions
- Firebase dependency/configuration included in the project setup

## Tech Stack

- **Language:** Java
- **Framework:** Android SDK
- **IDE:** Android Studio
- **Build System:** Gradle
- **UI:** XML Layouts
- **Services:** Firebase (configured in project files)

## Project Structure

```text
SenSabong-Aplication-Android/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/sabongproapplication/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── SecondPage.java
│   │   │   │   ├── RegisterPage.java
│   │   │   │   └── LoginActivity.java
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   ├── build.gradle
│   ├── proguard-rules.pro
│   └── google-services.json
├── gradle/
├── build.gradle
├── settings.gradle
├── gradlew
└── gradlew.bat
```

## Screens / Flow

Current activity flow in the project:

- `MainActivity` – launcher activity
- `SecondPage` – navigation page
- `RegisterPage` – sign up screen
- `LoginActivity` – login screen

## Getting Started

### Requirements

- Android Studio
- JDK 8 or higher
- Android SDK
- Gradle (wrapper already included)

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/shreyanshjain1/SenSabong-Aplication-Android.git
   ```

2. Open the project in Android Studio.

3. Allow Gradle sync to finish.

4. If needed, replace Firebase config with your own `google-services.json`.

5. Run the app on:
   - an Android emulator, or
   - a physical Android device with USB debugging enabled.

## Notes

- This is an older academic / experimental project.
- The codebase reflects an early-stage Android learning build.
- Some dependencies and project configuration may be outdated compared to current Android development standards.
- Firebase configuration is included in the repository structure and should be replaced with your own for real deployment.

## Suggested Future Improvements

If I revisit this project, these are the updates I would make:

- Migrate to current Android Gradle Plugin versions
- Update dependencies to modern supported versions
- Replace old activity-heavy flow with better architecture
- Add proper authentication logic
- Connect forms to Firebase Authentication / Firestore properly
- Improve UI/UX with Material 3 styling
- Add validation and error handling
- Remove unused code and sample test logic
- Add screenshots and demo GIF
- Add release APK or demo video

## Why this repository exists

I keep this repository as part of my development journey. It reflects one of my earlier hands-on Android projects and shows the progression of my coding skills over time.

## Author

**Shreyansh Jain**  
GitHub: [shreyanshjain1](https://github.com/shreyanshjain1)

---

This repository is kept primarily for portfolio, learning history, and project archiving purposes.
