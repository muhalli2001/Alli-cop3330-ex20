package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

    /*Wisconsin residents must be changed 5% sales tax with an additional county-level charge. For Wisconsin residents, prompt for the county of residence.
    For Eau Claire county residents, add an additional 0.005 tax.
    For Dunn county residents, add an additional 0.004 tax.
    Illinois residents must be charged 8% sales tax with no additional county-level charge.
    All other states are not charged tax.*/

        double tax =0;
        double total=0;
        double taxonobj=0;

        //ORDER AMOUNT
        Scanner p = new Scanner(System.in);
        System.out.println("What is the order amount?");
        float order = p.nextFloat();
        float subtotal = order;
        total = subtotal;

        //STATE
        Scanner s = new Scanner(System.in);
        System.out.println("What is the state?(full name)");
        String State = s.nextLine();


        if((State).equals("Wisconsin")){
            tax = 0.05;
            //COUNTY PROMPT
            Scanner c = new Scanner(System.in);
            System.out.println("What is the county?Dunn/Eau Claire");
            String County = c.nextLine();

            if((County).equals("Eau Claire")){
                tax = tax+.005;
                taxonobj = tax*total;
                System.out.printf("The tax is: %.2f\n",taxonobj);
                total = taxonobj + total;
            }
            else if((County).equals("Dunn")){
                tax = tax+.004;
                taxonobj = tax*total;
                System.out.printf("The tax is: %.2f\n",taxonobj);
                total = taxonobj + total;


            }
            else {

                taxonobj = tax*total;
                System.out.printf("The tax is: %.2f\n",taxonobj);
                total = taxonobj + total;
            }



        }

        if((State).equals("Illinois")){

            tax = .08;
            taxonobj = tax*total;
            total = taxonobj + total;
            System.out.printf("The tax is: %.2f\n",taxonobj);

        }
        total = Math.round(total * 100.0) / 100.0;
        System.out.printf("The total is: $%.2f", total);


    }

}
