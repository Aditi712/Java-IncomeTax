
/*Write a program to calculate income tax based on gross income taking into consideration 
 * the deductions and advance tax paid. 
 * Quarter wise the advance tax are calculated and 
 * also let the user know tax refund and tax balance to be paid.
 */

package JavaProject;

import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        float basic = sc.nextFloat();

        System.out.println("Enter Basic DA Of Employee: ");
        float da=sc.nextFloat();

        System.out.println("Enter Basic HRA Of Employee: ");
        float hra=sc.nextFloat();

        da = (da * basic) / 100;
        hra = (hra * basic) / 100;

        float gross = basic + da + hra;
        System.out.println("Your gross salary is : Rs."+gross);
        int annnual = (int)basic*12;
        System.out.println("Your annual salary is : Rs."+annnual);

        if(annnual<=250000){
            System.out.println("You do not have to pay tax because your annual salary is : Rs."+annnual+ " and less than  Rs. 250000");
        } else if (annnual>=250000 && annnual<=500000) {
            int incomeTax = (int) (0.05*annnual);
            System.out.println("You payable tax amount is : Rs."+incomeTax);
        }else if (annnual>=500000 && annnual<=100000){
            int incomeTax = (int) (0.10*annnual);
            System.out.println("You payable tax amount is : Rs."+incomeTax);
        }else {
            int incomeTax = (int) (0.20 * annnual);
            System.out.println("You payable tax amount is : Rs." + incomeTax);
        }

	}

}
