package JFRAMe;

import java.awt.*;

public class Testpane {
    public static void main (String[] a){
        Frame f = new Frame("Panel");
        Panel p = new Panel(null);
        f.setLayout(null);
        f.setBounds(300,300,700,700);
        f.setBackground(new Color(123,0,2));
        p.setBounds(50,50,600,600);
        p.setBackground(new Color(200,200,200));
        f.add(p);
        f.setVisible(true);
    }
}
