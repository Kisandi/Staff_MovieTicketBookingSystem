package ssl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        AnchorPane load = FXMLLoader.load(getClass().getResource("/viewStaff/Dashboard.fxml"));

        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Movie Ticket Booking");
        primaryStage.show();
    }
}
