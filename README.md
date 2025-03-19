Here’s a `README.md` file for running the Java program:

---

# How to Run `Any Java File in CMD`

This guide will help you compile and run for example the `IsPrime_Server.java` file.

## Prerequisites

- Ensure you have **Java Development Kit (JDK)** installed on your system.
- Add Java to your system **PATH** if not already configured.
- Navigate to the directory containing `IsPrime_Server.java` before running the commands.

## Steps to Compile and Run

1. **Open Command Prompt**
   - Press `Win + R`, type `cmd`, and hit `Enter`.

2. **Navigate to the Directory**
   - Use the `cd` command to move to the folder where your Java file is located:
     ```sh
     cd C:\Games\Java Introduction\src\kratos
     ```

3. **Compile the Java File**
   - Run the following command to compile `IsPrime_Server.java`:
     ```sh
     javac IsPrime_Server.java
     ```
   - If successful, no errors will be displayed.

4. **Run the Compiled Java Program**
   - Execute the program using:
     ```sh
     java IsPrime_Server
     ```
   - You should see output similar to:
     ```
     Server Started..............
     ```

## Troubleshooting

- If `javac` or `java` commands are not recognized, check if Java is installed:
  ```sh
  java -version
  ```
  If not installed, download and install [JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
  
- Ensure that you're running the commands inside the correct directory.

## Additional Notes

- If `IsPrime_Server` depends on other files, make sure they are compiled too.
- If the program is a server, ensure firewall permissions are set correctly.

---

Save this as `README.md` in the project directory. Let me know if you need further modifications! 🚀
