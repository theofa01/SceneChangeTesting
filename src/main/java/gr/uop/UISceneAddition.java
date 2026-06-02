package gr.uop;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class UISceneAddition extends UIScene{
    public UISceneAddition(Stage stage){
        super(stage, new SceneEnum[] {SceneEnum.MULTIPLICATION}, 640, 480);
    }

    @Override
    public void drawScene() {
        if (this.isSceneSet()) return;

        Label num1Label = new Label("Num1");
        Label num2Label = new Label("Num2");

        TextField num1Field = new TextField();
        TextField num2Field = new TextField();
        
        Label resultLabel = new Label("Result");

        TextField resultField = new TextField();
        resultField.setDisable(true);

        Button resultButton = new Button("Result");

        GridPane operationPane = new GridPane();
        operationPane.setHgap(10);
        operationPane.setVgap(10);

        operationPane.add(num1Label, 0, 0);
        operationPane.add(num1Field, 1, 0);
        operationPane.add(num2Label, 0, 1);
        operationPane.add(num2Field, 1, 1);
        operationPane.add(resultLabel, 0, 2);
        operationPane.add(resultField, 1, 2);
        operationPane.add(resultButton, 2, 2);

        operationPane.setAlignment(Pos.CENTER);

        Button sceneChangeButton = new Button("Change scene");
        sceneChangeButton.setMaxWidth(Double.MAX_VALUE);
        
        HBox sceneChanger = new HBox();
        sceneChanger.getChildren().add(sceneChangeButton);
        HBox.setHgrow(sceneChangeButton, Priority.ALWAYS);
        HBox.setMargin(sceneChangeButton, new Insets(20, 0, 0, 0));

        BorderPane root = new BorderPane();
        root.setTop(sceneChanger);
        root.setCenter(operationPane);

        resultButton.setOnAction(event -> {
            String a = num1Field.getText();
            String b = num2Field.getText();

            if (a == null || a.isEmpty()) return;

            if (b == null || b.isEmpty()) return;

            try{
                resultField.setText(Integer.parseInt(a) + Integer.parseInt(b) + "");
            }
            catch(NumberFormatException e) {}
        });

        sceneChangeButton.setOnAction(event -> {
            SceneHandler.getSceneHandler().changeScene(this.transitionScenes[0]);
        });

        this.initializeRoot(root);
        this.initializeScene();
    }
    
}
