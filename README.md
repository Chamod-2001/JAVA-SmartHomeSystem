![Java](https://img.shields.io/badge/Java-Console%20App-blue?style=flat-square&logo=java)

# 🏠 Smart Home System

A Java console application developed to simulate a smart home environment using Object-Oriented Programming concepts.  
This system models smart devices such as lights, thermostats, and cameras, demonstrating **Inheritance**, **Encapsulation**, and **Method Overriding** within an MVC architecture.

---

## ✨ Features

- 🔹 Base `SmartDevice` class with common attributes and methods  
- 🔹 `SmartLight` with brightness and color controls  
- 🔹 `SmartThermostat` with temperature setting  
- 🔹 `SmartCamera` with recording status and storage management  
- 🔹 Demonstrates OOP principles: inheritance, encapsulation, method overriding  
- 🔹 Organized using MVC pattern for clean separation of concerns

---

## 🛠 Technologies Used

- Java (Console Application)  
- IntelliJ IDEA (IDE)  
- Git & GitHub  
- Windows OS (Developed on)

---

## 📊 UML Class Diagram (Text Representation)

<details>
  <summary>Click to expand UML diagram (Text)</summary>

```

+-------------------------+
| SmartDevice             |
+-------------------------+
| - deviceId: String      |
| - deviceName: String    |
| - status: boolean       |
+-------------------------+
| + turnOn()              |             
| + turnOff()             |
| + getDeviceInfo():String|
+-------------------------+

+--------------------------+   +--------------------------+
| SmartLight               |   | SmartThermostat          |
+--------------------------+   +--------------------------+
| - brightnessLevel: int   |   | - temperature: double    |
| - color: String          |   +--------------------------+
+--------------------------+   | + setTemperature(double) |
| + setBrightness(int)     |   | + getTemperature():double|
| + setColor(String)       |   | + getDeviceInfo():String |
| + getDeviceInfo():String |   +--------------------------+
+---------------------------+
|
|
+-------------------------+
| SmartCamera             |
+-------------------------+
| - recordingStatus: bool |
| - storageUsed: int      |
+-------------------------+
| + startRecording()      |
| + stopRecording()       |
| + addStorage(int)       |
| + getDeviceInfo():String|
+-------------------------+

```
</details>
