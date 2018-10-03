/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package incometax;
import java.util.Scanner;
/**
 *
 * @author JuWoj8013
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyedInput = new Scanner (System.in);
//     variables
     double salary;
     double tax = 0.13;
     double income = 0.0;
//     input
     System.out.println("Enter your salary");
     salary = keyedInput.nextDouble();
//     equation
      income = salary*tax;
//     output
     System.out.println("Your income tax will be " + income);
    
     
     
     
        // TODO code application logic here
    }
    
}
