package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double result;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number1");
     double num1 = sc.nextDouble();
     System.out.println("choose the operator:+,-,* or /");
     char operator = sc.next().charAt(0);
     System.out.println("enter the number2");
     double num2 = sc.nextDouble();
     switch(operator){
         case'+':
             result = num1+num2;
             System.out.println(num1+" + "+ num2+" = "+result);
             break;
         case'-':
             result = num1-num2;
             System.out.println(num1+" - "+num2+" = "+result);
             break;
         case'*':
             result = num1*num2;
             System.out.println(num1+" * "+num2+" = "+result);
             break;
         case'/':
             result = num1/num2;
             System.out.println(num1+" / "+num2+" = "+result);
             break;
     }
           sc.close();
    }

}
