package com;

import java.util.Scanner;

public class LineComparasionComputation {
	
	//Method to find the Distance
	 static double getDistance(int x1, int y1, int x2, int y2)//Function to calculate the distance
     {
         return Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2- y1)*(y2- y1)));//Formula
     }
	 
	 
	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparation Problem.");
		
		//Getting the Values From the user
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter First point x-coordinate, x1: ");
         int x1 = sc.nextInt();
         System.out.println("Enter First point y-coordinate, y1: ");
         int y1 = sc.nextInt();
         System.out.println("Enter Second point x-coordinate, x2: ");
         int x2 = sc.nextInt();
         System.out.println("Enter Second point y-coordinate y2: ");
         int y2 = sc.nextInt();

         // Displaying the Results..
         System.out.println("Length of Line "+"("+x1+","+y1+")"+"  "+"("+x2+","+y2+")"+" is: "+ getDistance(x1, y1, x2, y2));
		
	}

}
