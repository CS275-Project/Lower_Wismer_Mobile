/*
 *  Header:   Andrew Kelly
 *  Class:    CS 173 Fall 2019
 *  Assignment: Lab 01

Date: 9/6/19

 Summary:
 */
package item;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static item.GUIFoodOptions.specs;

/**
 *
 * @author andre
 */
public class Driver implements ActionListener {
    
    private static JButton cancel;
    private static JButton burger;
    private static JButton chikTend;
    private static JButton wing;
    private static JButton chSteak;
    
    public static void main(String[] args){
        food();
    }
        
    public static void food(){
            
        
        
        JFrame frame = new JFrame();
        frame.setSize(1100, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Grill 151");
        
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        
        
        JButton burger = new JButton("Burger");
        burger.setBounds(100, 450, 350, 350);
        panel.add(burger);
        burger.addActionListener(new Driver());
        
        JButton chikTend = new JButton("Chicken Tenders");
        chikTend.setBounds(550, 50, 350, 350);
        panel.add(chikTend);
        
        JButton wing = new JButton("Chicken Wings");
        wing.setBounds(100, 50, 350, 350);
        panel.add(wing);
        
        JButton chSteak = new JButton("Cheesesteak");
        chSteak.setBounds(550, 450, 350,350);
        panel.add(chSteak);
        
        JButton cancel = new JButton("Main Menu");
        cancel.setBounds(400, 850, 200, 50);
        panel.add(cancel);
        cancel.addActionListener(new Driver());
        
        //hard code some integers to be printed when items are selected
        //integer will correspond to a specific spec that will be created and added to the burger
        //when order is done it will print and send email
        //yahtzee
        
        
        
        
        
        
        //Burger b = new Burger();
        
        
        //b.addSpec(burger);
        //Spec cheese = new Spec("cheese",1.00);
        //b.addSpec(cheese);
        //Spec ketchup = new Spec("ketchup",1.00);
        //b.addSpec(ketchup);
        //Spec mustard = new Spec("mustard",1.00);
        //Spec lettuce = new Spec("lettuce",1.00);
        
        //b.printOrder();
        frame.setVisible(true);
        }
     
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == cancel){
            //return to DiningOptions
        }else if (e.getSource() == burger){
            //create a burger object with Burger b = new Burger
            //add selected specs with b.addSpec(Spec)
            //print order with b.printOrder
        }else if (e.getSource() == chikTend){
            
        }else if(e.getSource() == wing){
            
        }else if(e.getSource() == chSteak){
            
        }
        
        
    }

    
}
