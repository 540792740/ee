package JFRAMe;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args){
        Frame f = new Frame("Flow Layout");
        Button a = new Button("s");
        Button b = new Button("s");
        f.setSize(500,500);
        f.add(a, BorderLayout.EAST);
        f.add(b, BorderLayout.WEST);
        f.setVisible(true);

    }
}
