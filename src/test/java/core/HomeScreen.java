package core;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HomeScreen extends Application{
	private Button solution;
	private TextField leftOperandTxtBox;
	private TextField rightOperandTxtBox;
	private TextField answerTxtBox;
	private ComboBox<String> operatorDropdown;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		initUI(primaryStage);
	//	canvas.setStyle("-fx-background-color: black");
	}
	
	private void initUI(Stage primaryStage) {
		Pane canvas = new Pane();
		
		addControlsToCanvas(canvas);
		
		Scene scene = new Scene(canvas, 320, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Simple Calculator App");
		primaryStage.show();
	}
	
	private void addControlsToCanvas(Pane canvas) {
		// TODO Auto-generated method stub
		int row1 = 20;
		int row2 = 60;
		int txtBoxWidth = 50;
		Label label = new Label("Simple Calculator using JAVAFX");
		label.setFont(Font.font("Serf", FontWeight.NORMAL,20));
		label.relocate(20, row1);
		
		
		leftOperandTxtBox = new TextField();
		leftOperandTxtBox.setMaxWidth(txtBoxWidth);
		leftOperandTxtBox.relocate(20,row2);
		
		operatorDropdown = new ComboBox<String>();
		operatorDropdown.getItems().addAll("+" , "-", "*", "/", "%");
		operatorDropdown.setValue("+");
		operatorDropdown.relocate(80,row2);
		
		rightOperandTxtBox = new TextField();
		rightOperandTxtBox.setMaxWidth(txtBoxWidth);
		rightOperandTxtBox.relocate(150, row2);
		
		solution = new Button("=");
		solution.relocate(210, row2);
		
		
		
		answerTxtBox = new TextField();
		answerTxtBox.setMaxWidth(txtBoxWidth);
		answerTxtBox.setEditable(false);
		answerTxtBox.relocate(250, row2);
		
		setSolutionClickHandler();
		
		//always add to canvas
		canvas.getChildren().addAll(label, leftOperandTxtBox, rightOperandTxtBox, operatorDropdown, solution, answerTxtBox);
				
	}
	private void setSolutionClickHandler() {
		// TODO Auto-generated method stub
		solution.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Double leftOperand = Double.valueOf(leftOperandTxtBox.getText());
				Double rightOperand = Double.valueOf(rightOperandTxtBox.getText());
				String operator = operatorDropdown.getValue();
				
				ArithmeticSolver solver = new ArithmeticSolver();
				String answer = String.valueOf(solver.solve(operator, leftOperand, rightOperand));
				String.valueOf(leftOperand + rightOperand);
				
				
				answerTxtBox.setText(answer);
			}
			
		});
	}

}
