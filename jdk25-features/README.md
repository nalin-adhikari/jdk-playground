# jdk25-features

This project is a demonstration of new features introduced in JDK 25, focusing on string templates and utility methods.

## Project Structure

```
jdk25-features
├── src
│   ├── main
│   │   ├── java
│   │   │   └── np
│   │   │       └── com
│   │   │           └── nalin
│   │   │               ├── Application.java
│   │   │               ├── features
│   │   │               │   └── StringTemplates.java
│   │   │               └── utils
│   │   │                   └── CommonUtils.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── np
│               └── com
│                   └── nalin
│                       └── features
│                           └── StringTemplatesTest.java
├── build.gradle
└── README.md
```

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd jdk25-features
   ```

2. Ensure you have JDK 25 installed.

3. Build the project using Gradle:
   ```bash
   ./gradlew build
   ```

4. Run the application:
   ```bash
   java -cp build/libs/jdk25-features-0.0.1-SNAPSHOT.jar np.com.nalin.Application
   ```

## Usage

- The `Application.java` file serves as the entry point for the application.
- The `StringTemplates.java` file contains methods for working with string templates.
- Utility methods can be found in `CommonUtils.java`.
- Configuration properties are located in `application.properties`.
- Unit tests for the string templates can be found in `StringTemplatesTest.java`.

## License

This project is licensed under the MIT License.