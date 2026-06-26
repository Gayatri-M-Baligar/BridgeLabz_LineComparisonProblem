package com.bridgeLabz.LineComparisonProblem;

import java.util.Scanner;

public class LineComparisonUC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //declaring and assigning the user input to the variables for line1
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        //declaring and assigning the user input to the variables for line2
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int a2=sc.nextInt();
        int b2=sc.nextInt();


        //calculating the length of the line

        int xDiff1=x2-x1;
        int yDiff1=y2-y1;
        int xDiff2=a2-a1;
        int yDiff2=b2-b1;

        int length1=(xDiff1*xDiff1)+(yDiff1*yDiff1);
        int length2=(xDiff2*xDiff2)+(yDiff2*yDiff2);
        Double lineLength1=Math.sqrt(length1);
        Double lineLength2=Math.sqrt(length2);

        //comparing whether 2 lines are equal in length or not and printing the output

        if(lineLength1.equals(lineLength2)){
            System.out.print("Both the lines re equal");
        }else{
            System.out.print("Both the lines are not equal");
        }

    }
}