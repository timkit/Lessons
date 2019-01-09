import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;

public class jfx_Lesson_1 extends Application implements EventHandler<ActionEvent> {
	Button button;

	public static void main(String[] args) {
		launch(args);

	}

	@Override

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Header");
		primaryStage.setResizable(false);
		button = new Button("Click me");
		button.setOnAction(this);
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == button) {
			System.out.println("Easy, dude!");
		}
	}
}
