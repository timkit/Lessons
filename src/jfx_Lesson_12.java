import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.application.Application;
import javafx.geometry.Insets;

public class jfx_Lesson_12 extends Application {
	Stage window;

	public static void main(String[] args) {
		launch(args);

	}

	@Override

	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Lesson_12 Choise box");
		Button button = new Button("Choise");
		button.setPrefSize(120, 60);
		// Choice box
		ChoiceBox<String> choiceBox = new ChoiceBox<String>();
		choiceBox.getItems().add("Forest");
		choiceBox.getItems().add("Joker");
		choiceBox.getItems().addAll("Ace Ventura", "Mia", "Melory");
		choiceBox.getSelectionModel().select(0);

		button.setOnAction(e -> getChoice(choiceBox));

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10, 20, 20, 10));
		layout.getChildren().addAll(choiceBox, button);
		Scene scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();

	}

	private void getChoice(ChoiceBox<String> choiceBox) {
		String hero = choiceBox.getValue();
		System.out.println("Was selected "+hero);
	}

}
