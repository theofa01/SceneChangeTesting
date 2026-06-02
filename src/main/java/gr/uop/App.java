package gr.uop;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        // UIMaker uiMaker = new UIMaker(stage);
        // ArrayList<UIScene> scenes =  uiMaker.make();

        // SceneHandler.init(scenes);
        
        // SceneHandler.getSceneHandler()
        // .changeScene(SceneEnum.ADDITION);

        // The UISystem class does the above steps 
        // only this time happening inside a class
        UISystem uiSystem = new UISystem(stage);
        uiSystem.init();
    }

    public static void main(String[] args) {
        launch();
    }

}