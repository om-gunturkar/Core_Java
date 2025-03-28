package SwingDemo; // front end design
import javax.swing.*;
public class First {
    public static void main(String[] args) {
        JFrame f=new JFrame("Button Example");
//        JButton b=new JButton("Click Here");
//        f.add(b); // adding button into frame
//        b.setBounds(50,100,100,30);

        JLabel l1=new JLabel("Enter Username");
        JTextField t=new JTextField();

        l1.setBounds(50,50,100,30);
        t.setBounds(50,80,100,30);

        f.add(l1);
        f.add(t);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
