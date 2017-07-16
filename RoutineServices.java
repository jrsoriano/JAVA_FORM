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
import java.text.DecimalFormat;


public class RoutineServices extends JPanel
{
    //array to hold service charges
    protected final double [] SERVICE_CHARGE = {26.00, 18.00, 30.00, 80.00,
                                                15.00, 100.00, 20.00};
    //array to hold service type
    protected final String [] SERVICE_TYPE = {"Oil Change","Lube Job", "Radiator Flush", "Transmission Flush",
                                              "Inspection","Muffler Replacement","Tire Rotation"};
    //array to hold JCheckBox option
    protected JCheckBox [] serviceOption = new JCheckBox[SERVICE_TYPE.length];

    /**
     * Constructor
     */
    public RoutineServices()
    {
        //set layout for check boxes
        setLayout(new GridLayout(7, 1));

        //format for $
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        //create check boxes, add them to array serviceOption & add to panel
        for(int i = 0; i < serviceOption.length; i++)
        {
            serviceOption[i] = new JCheckBox(SERVICE_TYPE[i] + " ($" + dollar.format(SERVICE_CHARGE[i]) + ")");
            add(serviceOption[i]);
        }
        //add border to
        setBorder(BorderFactory.createTitledBorder("Routine Services"));
    }
    
    /**
     * Method to get Charges
     */
    public double getCharges()
    {
        double charges = 0.0;

        for (int i = 0; i < serviceOption.length; i++)
        if(serviceOption[i].isSelected()) charges += SERVICE_CHARGE[i];
        return charges;
    }
    
}