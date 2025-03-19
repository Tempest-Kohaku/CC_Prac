Below is a very simple, step-by-step guide on how to create, compile, and run Java files in the Command Prompt (CMD). It also explains the order in which to run a server file and a client file.

---

# How to Run Any Java File in CMD

This guide will help you compile and run, for example, the `IsPrime_Server.java` file, as well as a client file that connects to it.

## 1. Write (or Copy) the Java Code into Notepad

1. **Open Notepad** (or any basic text editor).
2. **Paste or type** your Java code into the blank document.
3. **Save the file**. In the “Save as type” dropdown, select **All Files** (if available). Then name your file with a `.java` extension, for example:
   
   ```
   IsPrime_Server.java
   ```

## 2. Make Sure Java Is Installed

1. **Check if Java is installed** by opening Command Prompt and typing:
   
   ```sh
   java -version
   ```
   
3. If you see a version number, Java is installed. If not, download and install the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html).
4. **(Optional)** Add Java to your system **PATH** if you haven’t already, so you can run `javac` and `java` from any folder.

## 3. Open Command Prompt

1. Press **Win + R** on your keyboard.
2. Type `cmd` and hit **Enter**.

## 4. Navigate to the Folder with Your Java File

Use the `cd` (change directory) command to go to the folder where you saved your `.java` file. For example:

```sh
cd C:\Games\Java Introduction\src\kratos
```

Make sure to adjust this path if your file is in a different location.

## 5. Compile the Java File

Type the following command to compile the `.java` file:

```sh
javac IsPrime_Server.java
```

- If it’s successful, you won’t see any errors, and a new file called `IsPrime_Server.class` should appear in the same folder.

## 6. Run the Server File First

1. Run the compiled server program by typing:
   
   ```sh
   java IsPrime_Server
   ```
   
4. You should see output like:

   ```
   Server Started..............
   ```
   
   This means your server is now listening for connections.

## 7. Run the Client File

- **After** the server is up and running, you can compile and run the client file (e.g., `IsPrime_Client.java`) in the same way:
  1. Compile:

     ```sh
     javac IsPrime_Client.java
     ```
     
  3. Run:

     ```sh
     java IsPrime_Client
     ```
     
- The client should connect to the server and communicate as intended.

## Troubleshooting

- If you see a message like `'javac' is not recognized`, it means Java isn’t set up properly or isn’t on your system PATH.
- Make sure the **server** is running before starting the **client**. Otherwise, the client might fail to connect.
- Check your firewall settings if you’re having issues with the server listening on a port.

## Additional Notes

- Always compile **all** the necessary Java files before running them.
- Keep the server running in its own Command Prompt window so the client can connect to it.

---

**That’s it!** Follow these steps in order, and you should be able to run both the server and the client successfully.
