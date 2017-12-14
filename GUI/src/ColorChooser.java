import javax.swing.*;
import java.awt.*;

public class ColorChooser extends JFrame {
    private JPanel p;

    public ColorChooser(){
            super("Color Chooser");
            setSize(700,500);
            Container c = getContentPane();
            c.setBackground(Color.RED);
            c.setLayout(new GridLayout(1,4,5,5));
            JSlider s;
            c.add(new JSlider(SwingConstants.VERTICAL,0,255,0));
            c.add(new JSlider(SwingConstants.VERTICAL,0,255,0));
            c.add(new JSlider(SwingConstants.VERTICAL,0,255,0));
            JPanel p = new JPanel();
            p.setBackground(Color.PINK);
            c.add(p);
            setVisible(true);
    }
    public static void main(String[] args){
        new ColorChooser();

    }

}
