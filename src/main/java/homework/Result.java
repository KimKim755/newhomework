package homework;

import java.util.Scanner;

public class Result {
//constructor body
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 2 numbers :  ");

//        Result first1 = new Result();
    //    Result second1 = new Result();
     //   Result multiply1 = new Result();

////
//        first1.getClass();
//        second1.getClass();
//        multiply1.getClass();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int add = first + second;
        String multiply = String.valueOf(first * second);
        float divide = (float) first / second;
        float square = (float) first / second * 2;
       double subtract=(double) first - second;



        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiply = "+ multiply);
        System.out.println("Division = " + divide); String.valueOf(+ divide);
        System.out.println("Square = " + square);








    }}



