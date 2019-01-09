import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.*;
import javafx.application.Application;

public class jxf_Lesson_3 extends Application {
	Button button;

	public static void main(String[] args) {
		launch(args);

	}

	@Override

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Header");
		primaryStage.setResizable(false);
		button = new Button("Click me");	
		button.setOnAction(e -> {
			
			System.out.println("I created with lambda expression");
			System.out.println("Not, I'm created with lambda expression");
		
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	}

