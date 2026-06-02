package gr.uop;

import java.util.ArrayList;

import javafx.stage.Stage;

public class UIMaker {
    private Stage stage;
    private ArrayList<UIScene> scenes;

    public UIMaker(Stage stage){
        if (stage == null) throw new NullPointerException("UIMaker Constructor: Stage is not initialized");

        this.stage = stage;
        this.scenes = new ArrayList<>();
    }

    private void addScene(UIScene scene){
        this.scenes.add(scene);
    }

    public ArrayList<UIScene> make(){
        ArrayList<UISceneCreator> creatorContainer = UISceneCreatorContainer.container(this.stage);

        for (UISceneCreator uiSceneCreator : creatorContainer) {
            this.addScene(uiSceneCreator.createScene());
        }

        return this.scenes;
    }
}
