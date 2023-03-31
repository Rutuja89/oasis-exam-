package task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       
        
        JLabel heading = new JLabel("WELCOME TO EXAMINATION");
        heading.setBounds(100, 100, 700, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        JLabel heading2 = new JLabel("PLEASE REGISTER BEFOR START");
        heading2.setBounds(300, 300, 600, 55);
        heading2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading2.setForeground(new Color(30, 144, 254));
        add(heading2);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(400, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(505, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(505, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.orange);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(705, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.orange);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new login();
    }
}