/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diningoptionsgui;

/**
 *
 * @author justincasey
 */

import static diningoptionsgui.GrillGUI.grillOptions;
import static diningoptionsgui.JazzGUI.jazzOptions;
import static diningoptionsgui.TresGUI.tresOptions;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static logingui.SubFoodsGUI.subOptions;

public class DiningOptionsGUI implements ActionListener{
    private static JButton sub;
    private static JButton tres;
    private static JButton grill;
    private static JButton jazz;
  
    public static void main(String[] args) {
        options();
    }
    
    public static void options(){
        
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(new Dimension(500, 400));
       frame.setTitle("Dining Options");
       
       frame.setLayout(new BorderLayout());
       JPanel pan = new JPanel(new GridLayout(2,2));
       sub = new JButton("Sub-Connections");
       sub.addActionListener(new DiningOptionsGUI());
       pan.add(sub);
       grill = new JButton("Grill 151");
       grill.addActionListener(new DiningOptionsGUI());
       pan.add(grill);
       tres = new JButton("Tres Haneneros");
       tres.addActionListener(new DiningOptionsGUI());
       pan.add(tres);
       jazz = new JButton("Jazzman's");
       jazz.addActionListener(new DiningOptionsGUI());
       pan.add(jazz);
       frame.add(pan, BorderLayout.CENTER);
       
       
       frame.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == sub){
            subOptions();
        }else if(e.getSource() == grill){
            grillOptions();
        }else if(e.getSource() == tres){
            tresOptions();
        }else if(e.getSource() == jazz){
            jazzOptions();
        }
                
    }
   
    
    
}
