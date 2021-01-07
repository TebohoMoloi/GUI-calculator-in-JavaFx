package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Scanner;


public class Main extends Application {


    @Override
    public void start(Stage windows) {
        System.out.println("\nPLEASE ENTER YOUR STUDENT NUMBER AND THEN PRESS ENTER");
        Scanner scan_names = new Scanner(System.in);
        Controller.student_no = scan_names.next();

        System.out.println("PLEASE ENTER YOUR PASSWORD\n");
        Scanner scan_password = new Scanner(System.in);
        String password = scan_password.next();

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("password", "nrxxmzi=4444");

        if (password.equals(hashMap.get("password"))) {
            System.out.println("PLEASE ENTER THE FIRST NUMBER AND THEN PRESS ENTER ");
            Scanner input1 = new Scanner(System.in);
            Controller.number1 = input1.nextInt();
            System.out.println("PLEASE ENTER THE SECOND NUMBER AND THEN PRESS ENTER\nPLEASE NOTE! IT CANNOT BE ZERO FOR DIVISION");
            Scanner input2 = new Scanner(System.in);
            Controller.number2 = input2.nextInt();

            Controller controller = new Controller();
            controller.calculator(windows);
        } else {

            System.out.println(Controller.student_no + " PLEASE ENTER THE CORRECT PASSWORD");

        }

    }


    public static void main(String[] args) {

        launch(args);
    }
}
