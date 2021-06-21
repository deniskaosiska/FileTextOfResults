package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;


public class Main extends Application {






    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
        launch(args);
        File file = new File("C:\\Users\\Denis.Kozyra\\OneDrive - xcircular.com\\Desktop\\results.txt");
        StringBuffer contents = new StringBuffer();
        BufferedReader reader = null;

        reader = new BufferedReader(new FileReader(file));
        String text = null;

        // repeat until all lines is read
        while ((text = reader.readLine()) != null) {
            contents.append(text).append(System.getProperty("line.separator"));
        }
        reader.close();
        System.out.println(contents.toString());
    }
    }


