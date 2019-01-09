import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.application.Application;

public class jfx_Lesson_4 extends Application {
	Stage window;
	Scene scene1, scene2;

	public static void main(String[] args) {
		launch(args);

	}

	@Override

	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		Label label1 = new Label("Hellow! you're in first window");
		Button button = new Button("Portal into the second window");
		button.setOnAction(e -> {
			window.setScene(scene2);
		});
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button);
		scene1 = new Scene(layout1, 400, 200);
		Label label2 = new Label("Hellow! you're in second window");
		Button button2 = new Button("Go back to the first window");
		button2.setOnAction(e -> {
			window.setScene(scene1);
		});
		HBox layout2 = new HBox(20);
		layout2.getChildren().addAll(label2, button2);
		scene2 = new Scene(layout2, 400, 200);
		window.setScene(scene1);
		window.setTitle("Lesson_4");

		window.show();
	}

}
