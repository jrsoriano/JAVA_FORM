/**
 * Assignment 1 GUI Application - Joe's Automotive. 
 * This application will calculate vehicle maintanance: routine, non routine, hours of labor and part charges for Joe's customers.
 * 
 * @author Jose R. Soriano
 * @version 1.0
 * 
 * Assignment: #1
 * Course: ADEV-1001 (OPEN) Programming (Java 2)
 * Section: Online
 * Date Created: 01.25.2016
 * Last Update: 02.19.2016
**/

import javax.swing.*;
import java.awt.*;


public class JoesAutoClient extends JFrame
{
    //variables

    private JoesAutoGUI gui;

    /**
     * Constructor
     */
    public JoesAutoClient()
    {
        //new instance of GUI
        gui = new JoesAutoGUI();
        //container 
        getContentPane();
        //layout manager 
        setLayout(new BorderLayout());
        //add gui to container 
        add(gui, BorderLayout.CENTER);
        //window title
        setTitle("Joe's Automotive");
        //when "X" is clicked window closes 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make the window visible
        setVisible(true);
        //fill the container with components
        pack();
    }
    
    /**
     * Main
     */
    public static void main(String [] args)
    {
        //create instance of Joe's Auto Client
        JoesAutoClient jac = new JoesAutoClient();
    }
    
}
