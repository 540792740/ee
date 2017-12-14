import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Weiqi{
    public static void main(String args[]) {
        new MyFrame("WeiQi by Jiawei Wang");
    }
}

class MyFrame extends JFrame {
    ArrayList points = null;
    MyFrame(String s) {
        super(s);
        points = new ArrayList();
        setLayout(null);
        this.setBackground(new Color(204,204,255));
        setSize(20*30,20*30);
        setLocation(400,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseListener(new Monitor());
    }

    public void paint(Graphics g) {
        for(int i1 = 30; i1 <= 19*30; i1 += 30){
            g.drawLine(i1,30,i1,19*30);
            g.setColor(Color.BLACK);
            //竖线
        }
        for(int i2 = 30; i2 <= 19*30; i2 += 30){
            g.drawLine(30,i2,19*30,i2);
            g.setColor(Color.BLACK);
        }

        boolean color = false;


        Iterator i = points.iterator();

        while(i.hasNext()){
            Point p = (Point)i.next();
            if(color == false) {
                g.setColor(Color.BLUE);
                color = true;
            } else {
                g.setColor(Color.RED);
                color = false;
            }
            g.fillOval(((p.x+15)/30*30-15),((p.y+15)/30*30-15),30,30);
        }
    }

    public void addPoint(Point p){
        points.add(p);
    }
}

class Monitor extends MouseAdapter {
    boolean[][] abord = new boolean[19][19];
    public void mousePressed(MouseEvent e) {
        MyFrame f = (MyFrame)e.getSource();
        int x = ((e.getX()+15)/30*30-15)/30;
        int y = ((e.getY()+15)/30*30-15)/30;
        if(abord[x][y] == false) {
            f.addPoint(new Point(e.getX(),e.getY()));
            f.repaint();///继续画
            abord[x][y] = true;
        }
    }
}
