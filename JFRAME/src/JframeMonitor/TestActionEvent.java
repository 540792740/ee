package JframeMonitor;

import java.awt.*;
import java.awt.event.*;

public class TestActionEvent {
    public static void main(String[] args){
        Frame f = new Frame("Action");
        f.setSize(400,400);
        f.setLocation(400,400);
        Button v = new Button("press me");
        Monitor bh = new Monitor();
        v.addActionListener(bh);
        f.add(v, BorderLayout.CENTER);
        f.setVisible(true);

    }
}

class Monitor implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button is pressed.");
    }
}