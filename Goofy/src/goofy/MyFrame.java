/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goofy;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author mathe
 */
class MyFrame extends JFrame implements ActionListener{
JLabel title=new JLabel("Welcome User");
JLabel enterMessage=new JLabel("Enter usernsme");
JLabel passwordMessage=new JLabel("Enter password");
JLabel evidence=new JLabel();
JTextField username=new JTextField("Username");
JPasswordField password=new JPasswordField("Password");

JButton cancel=new JButton("cancel");
JButton enter=new JButton("enter");

    public MyFrame() {
        design();
        this.add(evidence);
         this.add(enter);
        this.add(cancel);
        this.add(username);
        this.add(password);
        this.add(enterMessage);
        this.add(passwordMessage);
        this.add(title);
       this.setLocation(200,200);
        this.pack();
           this.setLayout(null);
           this.setTitle("Sibusiso");
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setSize(800,800);
            this.setVisible(true);
    
    }
    public void design(){
    title.setBounds(0,0,799,100);
        title.setFont(new Font("Jokerman",Font.BOLD,100));
        title.setBackground(Color.white);
        
        enterMessage.setBounds(0,150,799,50);
        enterMessage.setFont(new Font("Algerian",Font.PLAIN,50));
        
        passwordMessage.setFont(new Font("Algerian",Font.PLAIN,50));
        passwordMessage.setBounds(0,275,799,50);
        
        username.setBounds(0, 200, 400, 50);
        password.setBounds(0, 320, 400, 50);
        
        cancel.setBounds(35, 375, 100, 50);
        cancel.setFocusable(false);
        cancel.setBackground(Color.blue);
        cancel.addActionListener(this);
        
         enter.setBounds(250,375 , 100, 50);
        enter.setFocusable(false);
        enter.setBackground(Color.blue);
        enter.addActionListener(this);
        
        evidence.setBounds(0, 450, 799, 50);
        evidence.setFont(new Font("Algerian",Font.PLAIN,40));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cancel){
        username.setText(null);
        password.setText(null);
        }
        if(e.getSource()==enter){
            if(username.getText().contains("Sibusiso")|| password.getText().contains("Mathebula")){
            new Kanban();
            
           // System.exit(0);
           dispose();
            }
            else{System.out.println("failed");
            evidence.setText("Incorrect username or password");
            }
        
        }
    }
    
}
