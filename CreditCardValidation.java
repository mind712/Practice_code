package com.example;

import java.util.Scanner;

public class CreditCardValidation {

    public static void main(String[] args) {
        String cardNo;
        System.out.println("Please enter your 16 digit card number" + ":- ");
        Scanner scan = new Scanner(System.in);
        cardNo = scan.nextLine();
        if (checkCard(cardNo))
            System.out.println("Your card is valid :-" + cardNo);
        else
            System.out.println("The card enter by you is not valid :-" + cardNo);
    }

    public static boolean checkCard(String cardNo) {
        System.out.println("Length"+cardNo.length());
        int sumAll=(sumOfEvenPlace(cardNo) +sumOfOddPlace(cardNo));
        System.out.println("line21:- "+sumAll);
        return (cardNo.length() == 16) &&
                (sumAll % 10 == 0);
    }

    // Get the result from Step 2
    public static int sumOfEvenPlace(String cardNo) {
        int A = 0;
         String num = cardNo + "";
        System.out.println("num_line30:-"+num);
        System.out.println(cardNo.length()-2);

        for (int i = cardNo.length() - 2; i >= 0; i -= 2)
            A += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        System.out.println("line35  "+A);
        return A;
    }
    public static int getDigit(int cardNo) {
        System.out.println("line39:-"+cardNo);
        if (cardNo < 9) {
            return cardNo; //return this number if it is a single digit
        }
        int addDouble=cardNo / 10 + cardNo % 10;
        System.out.println("Line44:-"+addDouble);
        System.out.println("line45:- "+cardNo);
        return addDouble; // return the sum of the two digits
    }
    // Return sum of odd-place digits in number
    public static int sumOfOddPlace(String cardNo) {
        int B = 0;
        String num = cardNo + "";
        for (int i = cardNo.length() - 1; i >= 0; i -= 2)
            B += Integer.parseInt(num.charAt(i) + "");
        System.out.println(cardNo.length()-1);
        System.out.println("line55:- "+B);
        return B;
    }


}
