package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        double length, width,areaOfRoof,runoff;
        int footInInches = 12;
        int gallonInCubic = 361;
        System.out.println("Rain fall Calculator \n ...............................\n");
        System.out.println("Enter the length of the roof: ");
        length = keyboard.nextDouble();
        System.out.println("Enter the length of the roof: ");
        width = keyboard.nextDouble();

        areaOfRoof = areaCalculator(length,width) * footInInches;

        runoff = areaOfRoof/gallonInCubic;



        System.out.printf("The rainfall runoff in cubic  inches is :% .2f%n",runoff);


    }

    public static double areaCalculator(double len , double width){

        Double area = len * width;

        return area;
    }
}
