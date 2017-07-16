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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class JoesAutoHandler implements ActionListener
{
    //variables
    protected JoesAutoGUI gui;
    //gst
    private final double TAX_RATE = 0.05;
    
    //variables used for summary panel
    double finalRoutine = 0.0;
    double finalNonRoutine = 0.0;
    double finalTax = 0.0;
    double finalTotal = 0.0;

    /**
     * Constructor
     */
    public JoesAutoHandler(JoesAutoGUI gui)
    {
        this.gui = gui;
    }

    public void actionPerformed(ActionEvent e)
    {
        //if the calculate charges button is clicked
        if(e.getSource() == gui.calcButton)
        {
            //format $
            DecimalFormat dollar = new DecimalFormat("#,##0.00");

            //variables
            double routine, nonRoutine, subTotal, tax, total;

            routine = gui.routine.getCharges();
            nonRoutine = gui.nonRoutine.getCharges();
            int finalResponse;

            //math to calculate subtotal
            subTotal = routine + nonRoutine;

            //math to calculate tax
            tax = subTotal * TAX_RATE;

            //math to calculate final Total
            total = subTotal + tax;

            //Display customer receipt.
            finalResponse = JOptionPane.showConfirmDialog(null, "Routine Charges: $" + dollar.format(routine) + "\n"
                                                              + "Non-Routine Charges: $" + dollar.format(nonRoutine) + "\n"
                                                              + "Sub-Total: $" + dollar.format(subTotal) + "\n"
                                                              + "Tax: $" + dollar.format(tax) + "\n"
                                                              + "TOTAL: $" + dollar.format(total),
                                                                "Confirm Customer Receipt",
                                                                JOptionPane.OK_CANCEL_OPTION,
                                                                JOptionPane.QUESTION_MESSAGE);

            //add to summary panel if the ok button is clicked
            if(finalResponse == JOptionPane.OK_OPTION)
            {
                //accumulate customer total 
                int finalCustomer = gui.summary.getTotalCustomers();
                gui.summary.customerField.setText(Integer.toString(finalCustomer));
                //add routine to final total 
                finalRoutine += routine;
                gui.summary.routineField.setText(Double.toString(finalRoutine));
                //add nonRoutine to final total 
                finalNonRoutine += nonRoutine;
                gui.summary.nonRoutineField.setText(Double.toString(finalNonRoutine));
                //add taxes to final total
                finalTax += tax;
                gui.summary.taxesField.setText(Double.toString(finalTax));
                //add total to final total 
                finalTotal += total;
                gui.summary.chargesField.setText(Double.toString(finalTotal));

            }
        }
        //if the exit button is clicked
        if (e.getSource() == gui.exitButton)
        {
            System.exit(0);
        }

    }
}
