/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goofy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
class Kanban extends JFrame implements ActionListener{
JLabel title=new JLabel("Welcome User");
JLabel jobMessage=new JLabel("Enter jobs:");
JLabel numMessage=new JLabel("How many jobs:");
JLabel to=new JLabel("TO DO");
JLabel doing=new JLabel("DOING");
JLabel done=new JLabel("DONE");

JTextField job1=new JTextField();

JTextField jobNum=new JTextField();
//ArrayList<String> jobArray=new ArrayList<String>();

JPanel left=new JPanel();
JPanel center=new JPanel();
JPanel right=new JPanel();

JButton nextLeft=new JButton("Next");
JButton nextCenter=new JButton("Next");
JButton prevCenter=new JButton("Previous");
JButton prevRight=new JButton("Previous");
JButton enter1=new JButton("Enter");
DefaultListModel defaul =new DefaultListModel();
JList jobList1=new JList(defaul);
 DefaultListModel printList=new DefaultListModel();
      JList jobList2=new JList(printList);
      DefaultListModel default3=new DefaultListModel();
      JList jobList3=new JList(default3);
int num;
 int count=-1;
 String name;
    public Kanban() {
         design();
        this.add(to);
        this.add(doing);
        this.add(done);
        this.add(nextLeft);
        this.add(nextCenter);
        this.add(prevCenter);
        this.add(prevRight);
        this.add(enter1);
      
        
        this.add(right);
        this.add(center);
        this.add(left);
        this.add(job1);
         
        this.add(jobMessage);
         this.setLocation(200,200);
       
        this.add(title);
           this.setLayout(null);
           this.setTitle("Sibusiso");
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setSize(1500,1100);
            this.setVisible(true);
    }
   
public void design (){
title.setBounds(300,0,799,100);
        title.setFont(new Font("Jokerman",Font.BOLD,100));
        title.setBackground(Color.white);
        
        jobMessage.setBounds(0, 110,300 , 50);
        jobMessage.setFont(new Font("Algerian",Font.PLAIN,50));
        
        job1.setBounds(0,170,300,50);
     
        
        left.setBounds(300,170,250,550);
        left.setBackground(Color.red);
        
         center.setBounds(570,170,250,550);
        right.setBackground(Color.blue);
       
        right.setBounds(830,170,250,550);
        center.setBackground(Color.green);
        
         nextLeft.setBounds(425,720,100,50);
         nextCenter.setBounds(570,720,100,50);
         prevRight.setBounds(830,720,100,50);
         prevCenter.setBounds(700,720,100,50);
         
         to.setBounds(300,100,250,100);
         to.setFont(new Font("Algerian",Font.PLAIN,50));
         
         doing.setBounds(570,100,250,100);
         doing.setFont(new Font("Algerian",Font.PLAIN,50));
         
         done.setBounds(830,100,250,100);
         done.setFont(new Font("Algerian",Font.PLAIN,50));
        
       
        
        enter1.setBounds(0, 220, 100, 50);
       
        
        enter1.addActionListener(this);
         
         nextLeft.addActionListener(this);
         nextCenter.addActionListener(this);
         prevCenter.addActionListener(this);
         prevRight.addActionListener(this);
        
         jobList1.setPreferredSize(new Dimension(250,550));
          jobList2.setPreferredSize(new Dimension(250,550));
           jobList3.setPreferredSize(new Dimension(250,550));
        
        System.out.println(num);
      
}
    @Override
    public void actionPerformed(ActionEvent e) {
       
       
       if(e.getSource()==enter1){
           count++;
           left.add(jobList1);
          name=job1.getText();
          defaul.addElement(name);
          job1.setText(null);
         System.out.println("xxxxx");
         System.out.println(count);
      
       }
      if(e.getSource()==nextLeft){
    
      System.out.println(jobList1.getSelectedIndex());
       printList.addElement(jobList1.getSelectedValue());
     int numRemove=jobList1.getSelectedIndex();
     
     
 try{ defaul.remove(numRemove);}catch(ArrayIndexOutOfBoundsException j){}
      center.add(jobList2);
     
      
      }
      if(e.getSource()==nextCenter){
       System.out.println("*"+jobList2.getSelectedIndex());
       default3.addElement(jobList2.getSelectedValue());
     int numRemove2=jobList2.getSelectedIndex();
     
 try{ printList.remove(numRemove2);}catch(ArrayIndexOutOfBoundsException j){}
      right.add(jobList3);
      }
      if(e.getSource()==prevCenter){
       System.out.println("*"+jobList2.getSelectedIndex());
       defaul.addElement(jobList2.getSelectedValue());
     int numRemove3=jobList2.getSelectedIndex();
     
 try{ printList.remove(numRemove3);}catch(ArrayIndexOutOfBoundsException j){}
      
      }
      if(e.getSource()==prevRight){
      
     
       System.out.println(jobList3.getSelectedIndex());
       printList.addElement(jobList3.getSelectedValue());
     int numRemove4=jobList3.getSelectedIndex();
     
 try{ default3.remove(numRemove4);}catch(ArrayIndexOutOfBoundsException j){}
      }
      }
      }
    

        




