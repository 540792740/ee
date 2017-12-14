package JFRAMe;

import javax.swing.*;
import java.awt.*;

public class TestFrame  {
    public static void main(String[] a) {
        MyFrame f1 = new MyFrame(100,100,100,100,Color.blue);
        MyFrame f2 = new MyFrame(200,100,100,100,Color.YELLOW);
        MyFrame f3 = new MyFrame(100,200,100,100,Color.GREEN);
        MyFrame f4 = new MyFrame(200,200,100,100,Color.RED);
    }
}
class MyFrame extends Frame{
    static int id = 0;
    MyFrame(int x, int y, int w, int h, Color color){
        super("myframe" + (++id));
        setBackground(color);
        setLayout(null);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}