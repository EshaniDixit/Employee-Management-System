/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import javax.swing.*;
import java.awt.*;




public class complaints extends JFrame{
    
    JTextField tfname;
    JButton add, view;
    
    complaints(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);  
        
        JLabel heading = new JLabel("All Complaints");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        tfname = new JTextField();
        tfname.setBounds(100, 100, 700, 300);
        add(tfname);
        
        add = new JButton("Complaint Resolved");
        add.setBounds(250, 450, 150, 40);
        add(add);
        
        view = new JButton("Yet To Take Action");
        view.setBounds(500, 450, 150, 40);
        add(view);
        
        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    public static void main(String[] args){
        
        new complaints();
    }
}
