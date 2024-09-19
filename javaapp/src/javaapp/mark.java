
package javaapp;
import java.util.Scanner;
public class mark {
    static Scanner sc;
    static double mtod, gp, mpg, pf, tf;
    
    public static void main(String[] args)
    {
        sc= new Scanner (System.in);
        CalcExp mark = new CalcExp();
        System.out.println("Enter Miles Driven: ");
        mtod=sc.nextDouble();
        System.out.println("Enter Gas Price: ");
        gp=sc.nextDouble();
        System.out.println("Enter MPG: ");
        mpg=sc.nextDouble();
        System.out.println("Enter Parking Fees: ");
        pf=sc.nextDouble();
        System.out.println("Enter Toll Fees: ");
        tf=sc.nextDouble();
        mark.CalcTG();
        mark.CalcTGE();
        mark.CalcTE();
        System.out.println("Your Gallons of Gas is:");
        System.out.println("");
        System.out.println("");
        
        
    }
}
