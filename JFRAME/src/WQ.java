import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class WQ extends JFrame{

    public WQ(){
        setSize(21*30,21*30);
        setTitle("WeiQi by Jiawei Wang");
        setLocation(400,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        }


        public static void main(String[] args){
            new WQ();
        }


        public void paint(Graphics g){
            for(int i = 30; i <= 19*30; i += 30){
                g.drawLine(i,30,i,19*30);
                //竖线
            }
            for(int i = 30; i <= 19*30; i += 30){
                g.drawLine(30,i,19*30,i);
            }
        }

}


