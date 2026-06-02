package gr.uop;

import javafx.stage.Stage;

public abstract class AbstractUISceneCreator {
    protected Stage stage;

    protected AbstractUISceneCreator(Stage stage){
        if (stage == null) throw new NullPointerException("AbstractUISceneCreator Constructor: Stage is not initialized");

        this.stage = stage;
    }
}
