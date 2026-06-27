package com.bridgeLabz.LineComparisonProblem;
class Point{

    //instance variables to store coordinates value
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Line{
    // Instance variables to store the start and end points
    Point startPoint;
    Point endPoint;
    Line(Point startPoint,Point endPoint){
        this.startPoint=startPoint;
        this.endPoint=endPoint;
    }

    //Calculating the length of line
    public Double calculateLength(){
        int xDiff=endPoint.x-startPoint.x;
        int yDiff=endPoint.y-startPoint.y;
        Double length=Math.sqrt((xDiff*xDiff) + (yDiff*yDiff));
        return length;
    }
}
public class LineComparisonUC4 {
    public static void main(String[] args) {
        // Creating points for Line 1
        Point p1=new Point(2,3);
        Point p2=new Point(6,7);
        // Creating points for Line 2
        Point p3=new Point(1,2);
        Point p4=new Point(5,6);
        // Creating line objects
        Line l1=new Line(p1,p2);
        Line l2=new Line(p3,p4);
        //calculating th length of line
        Double length1=l1.calculateLength();
        Double length2=l2.calculateLength();
        // Displaying the lengths
        System.out.printf("Length of Line 1 : %.2f%n", length1);
        System.out.printf("Length of Line 2 : %.2f%n", length2);
        // Checking equality using equals()
        if(length1.equals(length2)){
            System.out.print("Both lines are Equal");
        }else{
            System.out.print("Lines are not equal");
        }
        // Checking equality using compareTo()
        int res=length1.compareTo(length2);
        if(res==0){
            System.out.print("Both lines are Equal");
        }else if(res>0){
            System.out.print("Line 1 is greater than line 2");
        }
        else{
            System.out.print("Line1 is smaller than line 2");
        }

    }
}
