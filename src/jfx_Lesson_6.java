import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.*;
import javafx.application.Application;

public class jfx_Lesson_6 extends Application {
	Stage window;
	Scene scene;

	public static void main(String[] args) {
		launch(args);

	}

	@Override

	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lesson_5");
		Button button = new Button("Click me");
		button.setPrefSize(120, 60);
		button.setOnAction(e ->{ 
			boolean result=ConfirmWindow.display("Confirm window","You are dry my pinguins?");
			System.out.println(result);
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}

}
