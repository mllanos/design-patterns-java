package edu.designpatterns.prototype;

public class Exercise3 {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(4,5);
        Point p3 = new Point(2,4);
        Point p4 = new Point(6,1);

        Line first = new Line(p1, p2);
        Line second = first.deepCopy();
        second.start = p3;
        second.end = p4;

        System.out.println(first);
        System.out.println(second);
    }
}