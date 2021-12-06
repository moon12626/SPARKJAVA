
/*
# Numerology number


        Harry is very much interested in learning numerology with a programming Language. Help Harry to implement this task.
        Write a java program to find the sum of the digits and the numerology number(Multi-digit numbers are added and reduced to a single digit),
        followed by the total number of odd numbers and the total number of even numbers. Assume input is greater than zero and less than 10000000.


        For example, if the given number is 7654 then,


        Sum of digits: 22 (7+6+5+4)


        Numerology number: 4 ((7+6+5+4 =22 => 2+2) sum of digits is again added and reduced to a single digit).


        Number of odd numbers: 2


        Number of even numbers: 2



        > Sample input:


        Enter the number
        86347


        > Sample output:


        Sum of digits
        28
        Numerology number
        1
        Number of odd numbers
        2
        Number of even numbers
        3


        ### Explaination:


        Sum of digit = 28


        Numberogoy number = 1 : 28 => (2 + 8) = 10 => (1 + 0) = 1
*/
package com.company;
import java.util.Scanner;

class Calculate {
    void SumofDigit(int number) {
        int digit, nsum, sum = 0, even = 0, odd = 0;

        do
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
            if (digit % 2 == 0)
                even++;
            else
                odd++;
        }while (number > 0);
        System.out.println("sum of digits:" + sum);

        while (sum > 9)
        {
            if (sum < 10)
                break;
            sum = (sum / 10) + (sum % 10);

        }

        System.out.println("Numerology number: " + sum);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);

    }

}

public class Numerology {

    public static void main(String[] args) {
        Calculate calc = new Calculate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        calc.SumofDigit(num);

    }

}