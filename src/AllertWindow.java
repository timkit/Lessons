import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AllertWindow {
	public static void display(String title, String message) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(350);
		window.setMinHeight(200);
		Label label = new Label(message);
		label.setFont(Font.font(20));
		Button closeButton = new Button("Close");
		closeButton.setOnAction(e -> {
			window.close();
		});
		VBox layout = new VBox(20);
		layout.getChildren().addAll(label,closeButton);
		layout.setAlignment(Pos.CENTER);
		Scene scene=new Scene(layout);
		window.setScene(scene);
		window.show();
	}
}
