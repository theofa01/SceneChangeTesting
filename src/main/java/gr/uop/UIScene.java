package gr.uop;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Enumerator of all the possible scenes
enum SceneEnum{
    ADDITION,
    MULTIPLICATION
}
public abstract class UIScene {
    private Stage stage;
    private Scene scene;
    private Parent root;

    // An array which stores all the scenes 
    // that we can go from this scene
    protected SceneEnum[] transitionScenes;

    private int width;
    private int height;

    protected UIScene(Stage stage, SceneEnum[] transitionScenes, int width, int height){
        if (stage == null) throw new NullPointerException("UIScene Constructor: Stage is not initialized");

        this.stage = stage;
        this.transitionScenes = transitionScenes;

        this.width = width;
        this.height = height;
    }

    protected boolean isSceneSet(){
        return this.scene != null;
    }

    protected void initializeScene(){
        if (this.root == null) throw new NullPointerException("UIScene.initializeScene: Root node is not initialized");

        this.scene = new Scene(this.root, width, height);
    }

    protected void initializeRoot(Parent parent){
        if (parent == null) throw new NullPointerException("UIScene.initializeRoot: Root node is not initialized");

        this.root = parent;
    }
    
    public void showScene(){
        this.stage.setScene(this.scene);
        this.stage.show();
    }

    public abstract void drawScene();
}
