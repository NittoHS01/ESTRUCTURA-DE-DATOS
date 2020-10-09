package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Primer Programa");
        primaryStage.setScene(new Scene(root, 500.0D, 500.0D));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
