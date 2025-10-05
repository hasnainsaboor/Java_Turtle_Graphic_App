package Turtle_app;
import javax.swing.*;

import Utility_Classes.Canvas;

import java.awt.*;

public class Display{
    public void run(){
    
         Pen turtle = new Pen(0, 0);
         Canvas canvas = new Canvas();
         JFrame frame = new JFrame("Hasnain Canvas");
         JPanel control = new JPanel();

        canvas.setPreferredSize(new Dimension(800,500 ));
        canvas.setLines(turtle.getLines());

       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(canvas, BorderLayout.CENTER);
       
        JTextArea input = new JTextArea(5, 30);
        JButton runBtn = new JButton("Run");
        JButton clearBtn = new JButton("Clear");
        JButton squareBtn = new JButton("Square");
        JButton zigzagBtn = new JButton("Zigzag");
        JButton RecatangleBtn = new JButton("Rectangle");
   
              
        control.add(new JScrollPane(input));
        control.add(runBtn);
        control.add(clearBtn);
        control.add(new JLabel(" Shapes"));
        control.add(squareBtn);
        control.add(zigzagBtn);
        control.add(RecatangleBtn);
        frame.add(control, BorderLayout.SOUTH);
         

            clearBtn.addActionListener(e -> {
            turtle.reset();
            canvas.setLines(turtle.getLines());
        });
            runBtn.addActionListener(e -> {
            turtle.reset();
            turtle.runProgram(input.getText());
            canvas.setLines(turtle.getLines());
        });

      
            // ---- Draw Square ----
            squareBtn.addActionListener(e -> {
            turtle.reset();
            for (int i = 0; i < 4; i++) {
                turtle.forward(100);
                turtle.left(90);
            }
            canvas.setLines(turtle.getLines());
        });

        // Draw Zigzag ----
            zigzagBtn.addActionListener(e -> {
              turtle.reset();
             for (int i = 0; i < 6; i++) {
             turtle.forward(60);
             turtle.left(45);
             turtle.forward(60);
             turtle.right(45);
                
            }
            canvas.setLines(turtle.getLines());
            
        });
             RecatangleBtn.addActionListener(e -> {
                turtle.reset();
                turtle.forward(100);
                turtle.forward(100);
                turtle.left(90);
                turtle.forward(100);
                turtle.left(90);
                turtle.forward(100);
                turtle.forward(100);
                turtle.left(90);
                turtle.forward(100);
                
            
            canvas.setLines(turtle.getLines());
        });

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
   

    }
}

