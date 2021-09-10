/*
 *  UCF COP3330 Fall 2021 Exercise 5 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise05;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();

        System.out.println("What is the second number?");
        Scanner sc1 = new Scanner(System.in);
        int int2 = sc1.nextInt();

        int add = int1+int2;
        int sub = int1-int2;
        int mul = int1*int2;
        double div = (double)int1/int2;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(int1+" + "+int2+" = "+add+"\n"+int1+" - "+int2+" = "+sub+"\n"+int1+" * "+int2+" = "+mul+"\n"+int1+" / "+int2+" = "+df.format(div));
    }
}
