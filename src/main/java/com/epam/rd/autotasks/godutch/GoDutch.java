package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner x = new Scanner(System.in);
        int bill_amount = x.nextInt();
        int number_of_friends = x.nextInt();
        int part_of_the_amount = 0;
        int total_and_tip = bill_amount + (bill_amount / 10);

        if (bill_amount < 0) {
            System.out.println("Bill total amount cannot be negative");
        }

        if (number_of_friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        }
        if (bill_amount >= 0 && number_of_friends > 0) {
            part_of_the_amount = total_and_tip / number_of_friends;
            System.out.println(part_of_the_amount);

        }
    }
}
