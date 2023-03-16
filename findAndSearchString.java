/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package testapplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class NewApplet extends Applet {

    // Find and Search Code Using Java Awt
    public void init() {
         //create buttons and other UI elements
                Button button1 = new Button("Search");
                
                TextArea txtArea = new TextArea("",5,20);      
                Label l1 = new Label();
                
                TextArea txtAreaToSearch = new TextArea("",2,20);    
                Label l2 = new Label("Text to Search");
                                
                // Add action listener when button is clicked!
                button1.addActionListener(new ActionListener(){ 
                    
                @Override
                public void actionPerformed(ActionEvent e){
                    l1.setBounds(1000,80,500,40);
                    
                    // get text area string and string to find/search
                    String str = txtArea.getText().toLowerCase();
                    String strToFind = txtAreaToSearch.getText().toLowerCase();
                    
                    // check if the string is empty or found or not found           
                    if(str.isEmpty() || strToFind.isEmpty())
                        l1.setText("Please enter something in both the boxes!");
                    
                    else if(str.contains(strToFind)){
                       l1.setText("Found!");
                                      
                       // if string found highlight it and also request the focus to the text area
                       int start = str.indexOf(strToFind);
                       txtArea.requestFocus();
                       
                       txtArea.select(start, start+strToFind.length());                                
                    }
                    else 
                        l1.setText("Not Found!");                   
                }  
            });  
               
                //add buttons and other UI elements
                add(button1);
                add(txtArea);
                add(l1);
                add(txtAreaToSearch);
                add(l2);
                
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package testapplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class NewApplet extends Applet {

    public void init() {
         //create buttons and other UI elements
                Button button1 = new Button("Button 1");
                TextArea txtArea = new TextArea("",10,20);    
                Label l1 = new Label();
                
                // Add action listener when button is clicked!
                button1.addActionListener(new ActionListener(){ 
                    
                @Override
                public void actionPerformed(ActionEvent e){
                    
                    // get text area string and string to find/search
                    String str = txtArea.getText();
                    String strToFind = "abc";                    
                    
                    // check if the string is found or not
                    if(str.toLowerCase().contains(strToFind.toLowerCase())){
                       l1.setText("Found!");
                      
                       // if string found highlight it and also request the focus to the text area
                       int start = str.indexOf(strToFind);
                       txtArea.requestFocus();
                       txtArea.select(start, start+strToFind.length());          
                        
                    }
                    else
                        l1.setText("Not Found!");                   
                }  
            });  
               
                //add buttons and other UI elements
                add(button1);
                add(txtArea);
                add(l1);
                
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
}
