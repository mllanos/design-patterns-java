package edu.designpatterns.prototype;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Point{x=%d, y=%d}", x, y);
    }
}
