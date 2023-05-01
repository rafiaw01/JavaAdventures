package helloworldFX;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Scanner;
import java.lang.*;

// Page 610


public class HelloWorldFX extends Application {
    
private TextField tfAnnualInterestRate = new TextField();
private TextField tfNumberOfYears = new TextField();
private TextField tfLoanAmount = new TextField();
private TextField tfMonthlyPayment = new TextField();
private TextField tfTotalPayment = new TextField();
private Button btCalculate = new Button("Calculate");    
 
@Override
 
 
public void start(Stage primaryStage){
GridPane gridPane = new GridPane();
gridPane.setHgap(5);
gridPane.setVgap(5);
gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
gridPane.add(tfAnnualInterestRate,1 ,0);
gridPane.add(new Label("Number of Years"), 0, 1);
gridPane.add(tfNumberOfYears, 1, 1);
gridPane.add(new Label("Loan Ammount"), 0, 2);
gridPane.add(tfLoanAmount, 1, 2);
gridPane.add(new Label("Monthly Payment:"),0,3);
gridPane.add(tfMonthlyPayment,1,3);
gridPane.add(new Label("Total Payment"),0,4);
gridPane.add(tfTotalPayment,1,4);
gridPane.add(btCalculate,1, 5);

gridPane.setAlignment(Pos.CENTER);
tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
tfMonthlyPayment.setEditable(false);
tfTotalPayment.setEditable(false);
GridPane.setHalignment(btCalculate,HPos.RIGHT);

btCalculate.setOnAction(e -> calculateLoanPayment());

Scene scene = new Scene(gridPane, 400 ,250);
primaryStage.setTitle("Loan Calculator");
primaryStage.setScene(scene);
primaryStage.show();
   
}   

private void calculateLoanPayment(){
    double interest =
            Double.parseDouble(tfAnnualInterestRate.getText());
    int year = Integer.parseInt(tfNumberOfYears.getText());
    double LoanAmount =
            Double.parseDouble(tfLoanAmount.getText());
    
    public class loan{
        private double interest;
        private int year;
        private double LoanAmount;
        
    Loan loan = new loan (interest, year ,LoanAmount);
}
    tfMonthlyPayment.settext(String.format("$%.2f",loan.getMonthlyPayment()));
    tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
 
    
}



    public static void main(String[] args) {
    Application.launch(args);    
    }
    
}
