import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyWin extends JFrame{
    private JPanel p;
    public MyWin(String title, Color bg, int w, int h){
        super(title);
        Container c = super.getContentPane();
        c.setBackground(bg);
        this.setSize(w,h);
        JButton b = new JButton("ok");
        b.setSize(w,h);
        c.add(BorderLayout.NORTH,b);
        b.addActionListener(new A());
        p = new JPanel();
        p.setBackground((new Color(155,0,155)));
        c.add(BorderLayout.SOUTH, p);
        setVisible(true);





        this.setVisible(true);

    }



    public static void main(String[] args){
        new MyWin("Test1", Color.RED, 400,200);
        new MyWin("Test2", Color.GREEN,400,100);

    }
    class A implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("yo");
            p.setBackground(Color.WHITE);
        }
//project euler





    }

}

