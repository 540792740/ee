package JframeMonitor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFMath {
    public static void main(String[] args) {
        new TFFrame().launchFrame();
    }
}
class TFFrame extends Frame{
    TextField num1,num2,num3;
        public void launchFrame(){

            setSize(500,200);
            setLocation(800,500);
            num1 = new TextField(10);
            num2 = new TextField(10);
            num3 = new TextField(20);
            Label X = new Label("+");
            Button E = new Button("=");
            E.addActionListener(new mymonitor());
            setLayout (new FlowLayout() );
            add(num1);
            add(X);
            add(num2);
            add(E);
            add(num3);
            pack();
            setVisible(true);
        }


    class mymonitor implements ActionListener{

        public void actionPerformed(ActionEvent e){
        int Num1 = Integer.parseInt(num1.getText());
        int Num2 = Integer.parseInt(num2.getText());
        num3.setText("" + (Num1 + Num2));
        }
    }
}