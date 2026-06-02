package gr.uop;

import java.util.ArrayList;

import javafx.stage.Stage;

public final class UISceneCreatorContainer {
    private static ArrayList<UISceneCreator> creatorContainer;

    private UISceneCreatorContainer() {}

    private static void init(Stage stage){
        if (!isNullOrEmpty()) return;

        creatorContainer = new ArrayList<>(){
            {
                add(new UISceneAdditionCreator(stage));
                add(new UISceneMultiplicationCreator(stage));
            }
        };
    }

    private static boolean isNullOrEmpty(){
        return creatorContainer == null || creatorContainer.isEmpty();
    }

    public static ArrayList<UISceneCreator> container(Stage stage){
        init(stage);
        return creatorContainer;
    }
}
