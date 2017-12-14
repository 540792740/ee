package JframeMonitor;

import java.awt.*;
import java.awt.event.*;
public class TestactionEvent2 {
    public static void main(String args[]) {
        Frame f = new Frame("Test");
        f.setLocation(800,400);
        f.setSize(400,400);
        Button b1 = new Button("ok");
        Button b2 = new Button("ok");
        Monitor2 bh = new Monitor2();
        b1.addActionListener(bh);
        b2.addActionListener(bh);
        b2.setActionCommand("game over");
        f.add(b1,"North");
        f.add(b2,"Center");
        f.pack();
        f.setVisible(true);
    }
}

class Monitor2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("a button has been pressed," +
                "the relative info is:\n " + e.getActionCommand());
    }
}
