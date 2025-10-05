package Utility_Classes;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Canvas extends JPanel {
    private java.util.List<Line> lines = new ArrayList<>();

    public void setLines(java.util.List<Line>newLines) {
        this.lines = newLines;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.translate(getWidth() / 2, getHeight() / 2); // move origin to center
        for (Line line : lines) {
            g.drawLine(
                line.getstart().getx(), line.getstart().gety(),
                line.getend().getx(),   line.getend().gety()
            );
        }
        
    }
}
