/**
 * This application will calculate vehicle maintanance: routine, non routine, hours of labor and part charges for Joe's customers.
 * 
 * @author Jose R. Soriano
 * @version 1.0
 * 
 * Date Created: 01.25.2016
 * Last Update: 02.19.2016
**/

import javax.swing.*;
import java.awt.*;

public class JoesAutoGUI extends JPanel
{
    //variables
    protected JPanel                charges;
    protected RoutineServices       routine;
    protected NonRoutineServices    nonRoutine;
    protected SummaryPanel          summary;
    protected JTabbedPane           tab;
    protected JPanel                titlePanel, buttonPanel;
    protected JButton               calcButton, exitButton;

    /**
     * Constructor
     */
    public JoesAutoGUI()
    {
        //create components & layout
        charges = new JPanel();
        charges.setLayout(new BorderLayout());
        routine = new RoutineServices();
        nonRoutine = new NonRoutineServices();
        summary = new SummaryPanel();
        tab = new JTabbedPane();
        buildTitlePanel();
        buildButtonPanel();

        //add components to panel
        charges.add(titlePanel, BorderLayout.NORTH);
        charges.add(routine, BorderLayout.WEST);
        charges.add(nonRoutine, BorderLayout.SOUTH);
        charges.add(buttonPanel, BorderLayout.EAST);

        //add to charges tab
        tab.addTab("Charges", null, charges, "Charges Panel");

        //add to summary tab
        tab.addTab("Summary", null, summary, "Summary Panel");

        //add the tab
        add(tab);
    }
    
    /**
     * Method to build title panel
     */
    private void buildTitlePanel()
    {
        titlePanel = new JPanel();
        JLabel title;

        //default flow layout
        setLayout(new FlowLayout());

        //ImageIcon to hold car.gif
        ImageIcon carImage;
        carImage = new ImageIcon("car.gif");

        //create the title label
        title = new JLabel("Joe's Automotive", carImage, JLabel.RIGHT);
        titlePanel.add(title);
    }
    
    /**
     * Method to build button panel
     */
    private void buildButtonPanel()
    {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 1));

        //create buttons
        calcButton = new JButton("Calculate Charges");
        exitButton = new JButton("Exit");


        //blank panel for spacing the top
        buttonPanel.add(new JPanel());
        //add calculate button
        buttonPanel.add(calcButton);
        //add exit button
        buttonPanel.add(exitButton);
        // blank panel for spacing the bottom
        buttonPanel.add(new JPanel());

        //add action handlers
        JoesAutoHandler handler = new JoesAutoHandler(this);
        calcButton.addActionListener(handler);
        exitButton.addActionListener(handler);
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }

}
