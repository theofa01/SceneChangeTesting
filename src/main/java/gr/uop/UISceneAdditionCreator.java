package gr.uop;

import javafx.stage.Stage;

public class UISceneAdditionCreator extends AbstractUISceneCreator implements UISceneCreator{
    public UISceneAdditionCreator(Stage stage){
        super(stage);
    }

    @Override
    public UIScene createScene() {
        return new UISceneAddition(this.stage);
    }

}
