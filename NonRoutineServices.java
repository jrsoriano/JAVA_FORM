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


public class NonRoutineServices extends JPanel
{
    //variables
    protected final double LABOR_RATE = 85.00;
    protected JTextField chargeField, hourField;
    protected JLabel chargeLabel, hourLabel;

    /**
     * Constructor
     */
    public NonRoutineServices()
    {
        //set layout
        setLayout(new GridLayout(2,1));

        //create Parts Charges components
        chargeLabel = new JLabel("Parts Charges:");
        chargeField = new JTextField("0", 10);

        //create Hours of Labor components
        hourLabel = new JLabel("Hours of Labor:");
        hourField = new JTextField("0", 10);

        //add components to panel
        add(chargeLabel); add(chargeField);
        add(hourLabel); add(hourField);

        //add border
        setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
    }
    
    /**
     * Method to get charges
     */
    public double getCharges()
    {
        //variables
        double charges = 0.0;
        double parts = 0.0;
        double hours = 0.0;

        //get user input and change double
        parts = Double.parseDouble(chargeField.getText());
        hours = Double.parseDouble(hourField.getText());

        //math for charges
        charges = hours * LABOR_RATE + parts;
        return charges;
    }

}
