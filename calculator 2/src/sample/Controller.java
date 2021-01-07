package sample;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Controller {
    private static Button[] buttons = new Button[6];
    private static Label[] labels = new Label[7];
    static float number1;
    static float number2;
    static String student_no;
    void calculator(Stage windows){

        if (number2 != 0) {
            buttons[0] = new Button("+");
            buttons[1] = new Button("-");
            buttons[2] = new Button("/");
            buttons[3] = new Button("*");
            buttons[4] = new Button("#");
            buttons[5] = new Button("~");

            for (Button button : buttons) {
                button.setPrefSize(120, 40);
                button.setStyle("-fx-font-size: 2.8em; " + "-fx-text-fill: #ff001c");
                button.setBackground(new Background(new BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY)));
            }
            labels[0] = new Label("CONSORION CALCULATOR");
            labels[1] = new Label("ADDITION");
            labels[2] = new Label("SUBTRACTION");
            labels[3] = new Label("DIVISION");
            labels[4] = new Label("MULTIPLICATION");
            labels[5] = new Label("ALL");
            labels[6] = new Label("OFF");

            for (Label label : labels) {
                label.setStyle("-fx-font-size: 2em; " + "-fx-text-fill: #0500ff");
            }
            labels[0].setStyle("-fx-font-size: 2.8em; " + "-fx-text-fill: #ff0084");

            buttons[0].setOnAction(e -> Addition());
            buttons[1].setOnAction(e -> Subtraction());
            buttons[2].setOnAction(e -> Division());
            buttons[3].setOnAction(e -> Multiplication());
            buttons[4].setOnAction(e -> {
                Addition();
                Subtraction();
                Division();
                Multiplication();
            });
            buttons[5].setOnAction(e -> {
                System.out.println("EXITED");
                windows.close();

            });

            GridPane gridPane = new GridPane();
            gridPane.setVgap(50);
            gridPane.setHgap(5);
            gridPane.setPadding(new Insets(10, 10, 10, 10));

            ImageView imv = new ImageView();
            Image image2 = new Image(Main.class.getResourceAsStream("image1.png"));
            imv.setFitHeight(50);
            imv.setFitWidth(50);
            imv.setImage(image2);
            HBox hBox = new HBox(35);
            hBox.getChildren().addAll(imv, labels[0]);

            GridPane.setConstraints(hBox, 0,0);
            GridPane.setConstraints(labels[1], 0, 1);
            GridPane.setConstraints(labels[2], 0, 2);
            GridPane.setConstraints(labels[3], 0, 3);
            GridPane.setConstraints(labels[4], 0, 4);
            GridPane.setConstraints(labels[5], 0, 5);
            GridPane.setConstraints(labels[6],  0, 6);
            GridPane.setConstraints(buttons[0], 1, 1);
            GridPane.setConstraints(buttons[1], 1, 2);
            GridPane.setConstraints(buttons[2], 1, 3);
            GridPane.setConstraints(buttons[3], 1, 4);
            GridPane.setConstraints(buttons[4], 1,5);
            GridPane.setConstraints(buttons[5], 1, 6);
            gridPane.getChildren().addAll(hBox, labels[1], labels[2], labels[3], labels[4], labels[5], labels[6], buttons[0], buttons[1], buttons[2], buttons[3], buttons[4], buttons[5]);
            gridPane.setBackground(new Background(new BackgroundFill(Color.AQUAMARINE, CornerRadii.EMPTY, Insets.EMPTY)));
            windows.setScene(new Scene(gridPane, 710, 700));
            windows.setTitle("Consorion");
            windows.show();
        } else {
            System.out.println("\nPLEASE DO NOT USE ZERO AS YOUR DIVISOR ");
        }
    }
    private static void Addition(){
        float answer1 = number1 + number2;
        System.out.println("Hey " + student_no.toUpperCase() + "\nADDITION" + "\nFirst number = " + number1 + "\nSecond number = " + number2 + "\nThe Sum = " + answer1 + "\n");
    }
    private static void Subtraction(){
        float answer2 = number1 - number2;
        System.out.println("SUBTRACTION\nFirst number = " + number1 + "\nSecond number = " + number2 + "\nThe Difference = " + answer2 + "\n");
    }
    private static void Multiplication(){
        float answer4 = number1 * number2;
        System.out.println("MULTIPLICATION\nFirst number = " + number1 + "\nSecond number = " + number2 + "\nThe Quotient = " + answer4 + "\n");
    }
    private static void Division(){
        float answer3 = number1 / number2;
        System.out.println("DIVISION\nFirst number = " + number1 + "\nSecond number = " + number2 + "\nThe Quotient = " + answer3 + "\n");
    }
}
