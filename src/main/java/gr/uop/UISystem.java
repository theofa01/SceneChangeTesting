package gr.uop;

import java.util.ArrayList;

import javafx.stage.Stage;

public class UISystem {
    private Stage stage;

    public UISystem(Stage stage){
        this.stage = stage;
    }

    public void init(){
        //The uiMaker creates all the scenes
        UIMaker uiMaker = new UIMaker(stage);
        ArrayList<UIScene> scenes =  uiMaker.make();

        //The scene handler 
        // is handling all the scenes transitions 
        // using the method changeScene
        SceneHandler.init(scenes);
        
        SceneHandler.getSceneHandler()
        .changeScene(SceneEnum.ADDITION);
    }
}
