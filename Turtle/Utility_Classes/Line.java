package Utility_Classes;
public class Line {
    private MyPoint start;
    private MyPoint end;

    public Line(MyPoint start, MyPoint end) {
        this.start = start;
        this.end = end;
    }

    public MyPoint getstart() { return start; }
    public MyPoint getend() { return end; }
}

