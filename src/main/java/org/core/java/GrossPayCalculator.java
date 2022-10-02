package org.core.java;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]){


        //1. Get the number of hours worked

        //2. Get the hourly pay rate

        //3. Multiply hours and pay rate

        //4. Display result

        System.out.println("Enter the number of hours");
        Scanner sc= new Scanner(System.in);
        int workHours=sc.nextInt();
        System.out.println("Enter Pay rate for the hours");
        double rate=sc.nextDouble();
        Double grossPay=workHours*rate;
        System.out.println("Total Salary of employee $:"+ grossPay);


    }

}
