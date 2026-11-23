package view;

import model.Building;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    private MapView mapView;

    public MainView(Building building) {
        this.mapView = new MapView(building);
        this.setCenter(mapView);
    }

    public MapView getMapView() {
        return mapView;
    }
}