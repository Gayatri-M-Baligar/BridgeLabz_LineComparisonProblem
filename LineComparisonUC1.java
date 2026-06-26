package com.bridgeLabz.LineComparisonProblem;

import java.util.Scanner;

public class LineComparisonUC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //declaring the required variables
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        //calculating the difference between the lines
        int xDiff=x2-x1;
        int yDiff=y2-y1;

        //calculating the length of line

        double res=Math.sqrt((xDiff*xDiff) + (yDiff*yDiff));

        //printing the calculated length value of line

        System.out.printf("The length of line is: %.2f",res);



    }

}
