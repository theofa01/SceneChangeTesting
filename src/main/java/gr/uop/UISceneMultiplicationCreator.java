package gr.uop;

import javafx.stage.Stage;

public class UISceneMultiplicationCreator extends AbstractUISceneCreator implements UISceneCreator{
    public UISceneMultiplicationCreator(Stage stage){
        super(stage);
    }

    @Override
    public UIScene createScene() {
        return new UISceneMultiplication(this.stage);
    }
}
