package view;

import model.Building;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class MapView extends Pane {

    public MapView(Building building) {
        this.setStyle("-fx-background-color: #E8EAED;");
        drawBaseMap();
    }

    private void drawBaseMap() {
        // 1. Favoritenstraße (rechts)
        Line road = new Line(520, 0, 430, 650);
        road.setStroke(Color.WHITE);
        road.setStrokeWidth(28);

        // 2. Gebäude-Umriss (FH Campus Wien)
        javafx.scene.shape.Polygon buildingShape = new javafx.scene.shape.Polygon(
            260.0, 50.0,   // Nordspitze
            390.0, 170.0,  // Knick oben rechts
            360.0, 380.0,  // Südost-Ecke (Lab Bioengineering)
            280.0, 360.0,  // Innenhof rechts
            240.0, 410.0,  // Innenhof unten
            310.0, 560.0,  // Südspitze unten
            275.0, 585.0,  // Südwest-Ecke unten
            145.0, 380.0,  // Knick links unten
            200.0, 210.0   // Westflügel (Bibliothek)
        );
        buildingShape.setFill(Color.web("#F8F9FA"));
        buildingShape.setStroke(Color.web("#BDC1C6"));
        buildingShape.setStrokeWidth(2.5);

        this.getChildren().addAll(road, buildingShape);
    }

    public void drawPoint(double x, double y, String name) {
        Circle pin = new Circle(x, y, 6, Color.web("#EA4335"));
        pin.setStroke(Color.WHITE);
        pin.setStrokeWidth(2);

        Text label = new Text(x + 10, y + 4, name);
        label.setStyle("-fx-font-weight: bold; -fx-font-size: 11px;");

        pin.setOnMouseClicked(e -> System.out.println("Angeklickt: " + name));

        this.getChildren().addAll(pin, label);
    }

    public void drawConnection(double startX, double startY, double endX, double endY) {
        Line line = new Line(startX, startY, endX, endY);
        line.setStroke(Color.web("#4285F4"));
        line.setStrokeWidth(3);
        line.getStrokeDashArray().addAll(6.0, 4.0);

        this.getChildren().add(line);
    }
}