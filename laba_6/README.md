# Lab 06 – Encapsulation in Java (Maven project)

How to run in IntelliJ IDEA:

1. Open the project directory `labaa6` in IntelliJ IDEA as a Maven project.
2. Ensure JDK 17 is configured.
3. Run the following mains:
   - `com.example.EmployeeTest` – domain hierarchy demo.
   - `com.example.pet.PetDemo` – Variant 16 pet (Chameleon).
   - `com.example.flower.FlowerDemo` – Variant 16 Flower/Bud/Petal.

From terminal with Maven (if installed):

```bash
mvn -q -Dexec.mainClass=com.example.EmployeeTest org.codehaus.mojo:exec-maven-plugin:3.3.0:java
mvn -q -Dexec.mainClass=com.example.pet.PetDemo org.codehaus.mojo:exec-maven-plugin:3.3.0:java
mvn -q -Dexec.mainClass=com.example.flower.FlowerDemo org.codehaus.mojo:exec-maven-plugin:3.3.0:java
```

Project structure follows standard Maven layout: `src/main/java` with packages `com.example.domain`, `com.example.pet`, and `com.example.flower`.
