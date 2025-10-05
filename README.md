🐢 Java Turtle Graphics App
📘 Overview

This project is a simple Turtle Graphics Application built in Java (Swing).
It allows users to draw shapes and patterns by controlling a “turtle” that moves around a virtual canvas.
The turtle can draw by executing commands or using built-in shape buttons such as Square, Rectangle, and Zigzag.

🧩 Class Structure
🟦 Main

The entry point of the program.

public static void main(String[] args) {
    Display a = new Display();
    a.run();
}


Launches the graphical window and initializes the turtle app.

🖥️ Display (in Turtle_app package)

Handles the Graphical User Interface (GUI) using Java Swing.

Features:

Creates a window (JFrame) with:

A Canvas (drawing area)

A control panel with buttons and a text input area

Buttons:

🟩 Run — Executes commands typed in the text area

🧹 Clear — Resets the canvas

◼️ Square — Draws a square

🪜 Zigzag — Draws a zigzag pattern

▭ Rectangle — Draws a rectangle

Example Commands for the “Run” button:

FORWARD 100
LEFT 90
FORWARD 100
RIGHT 45
FORWARD 70

✏️ Pen (in Turtle_app package)

Simulates the turtle’s behavior — keeps track of position, angle, and drawing lines.

Main Methods:

forward(int distance) — Moves turtle forward

left(int degrees) / right(int degrees) — Turns turtle

penUp() / penDown() — Controls whether drawing occurs

reset() — Returns turtle to origin

runProgram(String program) — Parses and runs text commands line-by-line

Command Syntax:

Command	Description
FORWARD X	Move forward X pixels
LEFT X	Turn left by X degrees
RIGHT X	Turn right by X degrees
PENUP	Stop drawing
PENDOWN	Start drawing
🧱 Canvas (in Utility_Classes)

A custom JPanel responsible for drawing lines.

Stores all lines drawn by the turtle.

Automatically repaints when new lines are added.

Moves the origin (0,0) to the center of the window for easy drawing.

🔹 Line and MyPoint (in Utility_Classes)

Helper classes to represent the turtle’s path.

MyPoint:

Represents a single coordinate (x, y).

Line:

Represents a connection between two points (start, end).

🧠 Object-Oriented Concepts Demonstrated

Encapsulation: Each class handles a single responsibility (e.g., drawing, logic, data).

Composition: Pen uses Line and MyPoint objects to build shapes.

Event Handling: Swing buttons use ActionListeners to trigger actions.

Abstraction: GUI and logic are separated between Display, Pen, and Canvas.

🏃 How to Run

Make sure your folder structure matches the package names:

src/
├── Main.java
├── Turtle_app/
│   ├── Display.java
│   └── Pen.java
└── Utility_Classes/
    ├── Canvas.java
    ├── Line.java
    └── MyPoint.java


Compile all files:

javac Main.java


Run the program:

java Main

🖼️ Example Output

When you click Square, a square appears centered on the canvas.
When you type custom commands and click Run, the turtle executes them to draw custom shapes.

🧰 Technologies Used

Java (JDK 8+)

Swing (for GUI)

AWT (for Graphics)

Object-Oriented Programming

📜 License

This project is open-source and free to use for learning purposes.
