package ex26;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Jose Malave
 */

class PaymentCalculator
{

     private double i;
     private double b;
     private double p;

    public PaymentCalculator()
    {

        this.i = i;
        this.b = b;
        this.p = p;
    }

    public double calculateMonthsUntilPaidOff()
    {
        double x = Math.log(1 + this.b/this.p * (1 - Math.pow((1 + this.i),30)));
        double y = Math.log(1 + this.i);
        double n = -(1/30) * x / y;
        return n;
    }

}
class main
{
    //really couldnt figure out how to get this one to work
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "What is your balance?" );
        int APR = sc.nextInt();
        System.out.println( "What is the APR on the card (as a percent)" );
        double i = sc.nextInt();
        System.out.println( "What is the monthly payment you can make?" );
        double p = sc.nextInt();

        double b = APR/365;

        PaymentCalculator n = new PaymentCalculator(i, b, p);
    }
}




