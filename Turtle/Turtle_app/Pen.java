package Turtle_app;
import java.util.ArrayList;


import Utility_Classes.Line;
import Utility_Classes.MyPoint;

 public class Pen {
    private int x, y;
    private double angle; // facing direction in degrees
    private boolean penDown;
    private java.util.List<Line> lines = new ArrayList<>();

    public Pen(int startX, int startY) {
        x = startX; y = startY;
        angle = 0;
        penDown = true;
    }

    public void reset() {
        x = y = 0;
        angle = 0;
        penDown = true;
        lines.clear();
    }

    public void forward(int distance) {
        int newX = x + (int)(distance * Math.cos(Math.toRadians(angle)));
        int newY = y - (int)(distance * Math.sin(Math.toRadians(angle)));
        if (penDown) {
             lines.add(new Line(new MyPoint(x, y), new MyPoint(newX, newY)));
        x = newX; y = newY;}
    }

    public void left(int deg) { angle = angle+deg; }
    public void right(int deg) { angle = angle-deg; }
    public void penUp() { penDown = false; }
    public void penDown() { penDown = true; }
    public java.util.List<Line> getLines() { return lines; }

    // Run text commands
    public void runProgram(String program) {
        String[] cmds = program.split("\\n");
        for (int i = 0; i < cmds.length; i++) {
            String cmd = cmds[i];    
            String[] parts = cmd.trim().split("\\s+");
            if (parts.length == 0) continue;
            String c = parts[0].toUpperCase();
            switch (c) {
                case "FORWARD": forward(Integer.parseInt(parts[1])); break;
                case "LEFT":    left(Integer.parseInt(parts[1])); break;
                case "RIGHT":   right(Integer.parseInt(parts[1])); break;
                case "PENUP":   penUp(); break;
                case "PENDOWN": penDown(); break;

            

             
            }
        }
    }
}