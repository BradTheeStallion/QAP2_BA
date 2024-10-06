//Brad Ayers
//October 4, 2024
//QAP2

import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
    MyPoint p1 = new MyPoint(3,4);
    MyPoint p2 = new MyPoint();
    MyLine l1 = new MyLine(p1,p2);
    System.out.println(l1.toString());
    l1 = new MyLine(3,4,1,1);
    System.out.println(l1.toString());
    System.out.println(l1.getBegin());
    System.out.println(l1.getBeginX());
    System.out.println(l1.getBeginY());
    l1.setBeginX(5);
    l1.setBeginY(6);
    System.out.println(Arrays.toString(l1.getBeginXY())); //I didn't know how to do this, IntelliJ suggested it
    l1.setEndXY(0,0);
    System.out.println(l1.getEnd());
    System.out.println(l1.getEndX());
    System.out.println(l1.getEndY());
    System.out.println(Arrays.toString(l1.getEndXY()));
    System.out.println(l1.getLength());
    System.out.println(l1.getGradient());
    }
}
