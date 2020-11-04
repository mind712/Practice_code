package com.example;

import java.util.Scanner;

class CardValidation {

    // Returns true if given
// card number is valid
    static boolean checkCard(String cardNo)
    {
        int cardLength = cardNo.length();
        System.out.println("CARDDIGITS;-"+cardLength);

        int nSum = 0;
        boolean isSecond = false;
        for (int i = cardLength - 1; i >= 0; i--)
        {
            System.out.println("i--"+i);
            System.out.println("char"+cardNo.charAt(i));
            int d = cardNo.charAt(i) - '0';
            System.out.println("D:->"+d);
            System.out.println(isSecond);
            if (isSecond == true)
                System.out.println(d = d * 2);
            d = d * 2;
            // We add two digits to handle  // cases that make two digits   // after doubling
            nSum += d / 10;
            nSum += d % 10;
            isSecond = !isSecond;
        }
        return (cardNo.length()==16)&& (nSum % 10 == 0);
    }

    public static  void main (String[] args)
    {
        String cardNo;
        System.out.println("Please enter your 16 digit card number"+":- ");
        Scanner scan = new Scanner(System.in);
        cardNo=scan.nextLine();
        if (checkCard(cardNo))
            System.out.println("Your card is valid"+cardNo);
        else
            System.out.println("The card enter by you is not valid "+cardNo);

    }
}


