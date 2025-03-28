package SwingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class cafeBilling extends JFrame implements ActionListener {

    JLabel l1;
    JCheckBox cb1, cb2,cb3,cb4;
    JButton b1;
    cafeBilling()
    {
        l1=new JLabel("Cafe Ordering System");

        cb1=new JCheckBox("Pizza @ 220/-");
        cb1.setBounds(100, 100, 150, 20);

        cb2=new JCheckBox("Burger @ 80/-");
        cb2.setBounds(100, 150, 150, 20);

        cb3=new JCheckBox("Coffe @ 120/-");
        cb3.setBounds(100, 200, 150, 20);

        cb4=new JCheckBox("Tea @ 20/-");
        cb4.setBounds(100, 250, 150, 20);

        b1=new JButton("PlaceOrder");
        b1.setBounds(100, 300, 150, 20);

        b1.addActionListener(this);

        add(l1); add(cb1); add(cb2); add(cb3); add(cb4); add(b1);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        float amount=0;
        String msg="";

        if(cb1.isSelected())
        {
            amount+=220;
            msg+="Pizaa is selected for prize 220\n";
        }
        if(cb2.isSelected())
        {
            amount+=80;
            msg+="Burger is selected for prize 80\n";
        }
        if(cb3.isSelected())
        {
            amount+=120;
            msg+="coffe is selected for prize 120";
        }
        if(cb4.isSelected())
        {
            amount+=20;
            msg+="Tea is selected for prize 20";
        }
        msg+="----------------------------------------------------------------\n";
        JOptionPane.showMessageDialog(this, msg+"Total is :- \n"+amount);

    }

    public static void main(String[] args) {
        cafeBilling obj=new cafeBilling();
    }

}
