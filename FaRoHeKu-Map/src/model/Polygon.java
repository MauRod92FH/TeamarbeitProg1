package model;

import java.util.List;

public class Polygon {
    private List<Double> coordinates; // [x1, y1, x2, y2, ...]

    public Polygon(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }
}