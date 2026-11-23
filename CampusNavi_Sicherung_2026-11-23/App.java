import model.Building;
import view.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Building fhCampus = null;

        MainView mainView = new MainView(fhCampus);

        Scene scene = new Scene(mainView, 700, 680);
        primaryStage.setTitle("FaRoHeKu-Map");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}