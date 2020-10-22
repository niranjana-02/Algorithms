import java.util.*;
public class Square {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
     
        System.out.print("Enter an integer number: ");
        num=sc.nextInt();
     
        System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
        
    }
} 

Java program for calculating square using method

import java.util.Scanner;
public class SquareNum {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		System.out.println("Your squared number is: " + square(num));
	}
	public static int square(int num) 
	{
		return num * num;
	}
}
