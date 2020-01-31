package edu.designpatterns.prototype;

class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy() {
        return new Line(new Point(start.x, start.y), new Point(end.x, end.y));
    }

    @Override
    public String toString() {
        return String.format("Line{start=%s, end=%s}", start, end);
    }
}
