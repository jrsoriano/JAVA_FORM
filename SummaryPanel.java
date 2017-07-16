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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class SummaryPanel extends JPanel
{
    //variables
    private int     totalCustomers = 0;
    private double  totalRoutineCharges = 0.0;
    private double  totalNonRoutineCharges = 0.0;
    private double  totalTaxes = 0.0;
    private double  totalCharges = 0.0;


    protected JTextField customerField, routineField, nonRoutineField,
                         taxesField, chargesField;

    protected JLabel customerLabel, routineLabel, nonRoutineLabel,
                     taxesLabel, chargesLabel;

    /**
     * Constructor

     */
    public SummaryPanel()
    {
        //layout
        setLayout(new GridLayout(5, 2));

        //$ format 
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        //create Total Customer components
        customerLabel = new JLabel("Total Customers: ");
        customerLabel.setHorizontalAlignment(JLabel.RIGHT);
        customerField = new JTextField(10);
        customerField.setHorizontalAlignment(JTextField.RIGHT);
        customerField.setEditable(false);

        //create Total Routine components
        routineLabel = new JLabel("Total Routine Charges: ");
        routineLabel.setHorizontalAlignment(JLabel.RIGHT);
        routineField = new JTextField(10);
        routineField.setHorizontalAlignment(JTextField.RIGHT);
        routineField.setEditable(false);

        //create Total Non-Routine components
        nonRoutineLabel = new JLabel("Total Non-Routine Charges: ");
        nonRoutineLabel.setHorizontalAlignment(JLabel.RIGHT);
        nonRoutineField = new JTextField(10);
        nonRoutineField.setHorizontalAlignment(JTextField.RIGHT);
        nonRoutineField.setEditable(false);

        //create Total Tax components
        taxesLabel = new JLabel("Total Taxes: ");
        taxesLabel.setHorizontalAlignment(JLabel.RIGHT);
        taxesField = new JTextField(10);
        taxesField.setHorizontalAlignment(JTextField.RIGHT);
        taxesField.setEditable(false);

        //create Total Charges components
        chargesLabel = new JLabel("Total Charges: ");
        chargesLabel.setHorizontalAlignment(JLabel.RIGHT);
        chargesField = new JTextField(10);
        chargesField.setHorizontalAlignment(JTextField.RIGHT);
        chargesField.setEditable(false);

        //Add components
        add(customerLabel);
        add(customerField);
        add(routineLabel);
        add(routineField);
        add(nonRoutineLabel);
        add(nonRoutineField);
        add(taxesLabel);
        add(taxesField);
        add(chargesLabel);
        add(chargesField);
    }

    /**
     * Get/Set Methods
     */
    public double getTotalCharges()
    {
        return totalCharges;
    }

    public void setTotalCharges(double totalCharges)
    {
        this.totalCharges = totalCharges;
    }

    public int getTotalCustomers()
    {
        totalCustomers = totalCustomers + 1;
        return totalCustomers;
    }

    public void setTotalCustomers(int totalCustomers)
    {
        this.totalCustomers = totalCustomers;
    }

    public double getTotalRoutineCharges()
    {
        return totalRoutineCharges;
    }

    public void setTotalRoutineCharges(double totalRoutineCharges)
    {
        this.totalRoutineCharges = totalRoutineCharges;
    }

    public double getTotalNonRoutineCharges()
    {
        return totalNonRoutineCharges;
    }

    public void setTotalNonRoutineCharges(double totalNonRoutineCharges)
    {
        this.totalNonRoutineCharges = totalNonRoutineCharges;
    }

    public double getTotalTaxes()
    {
        return totalTaxes;
    }

    public void setTotalTaxes(double totalTaxes)
    {
        this.totalTaxes = totalTaxes;
    }
}