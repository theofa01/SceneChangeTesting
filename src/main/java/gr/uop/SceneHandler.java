package gr.uop;

import java.util.ArrayList;

public final class SceneHandler {
    private static SceneHandler sceneHandler;

    private UIScene currentScene;
    private ArrayList<UIScene> scenes;

    private SceneHandler(ArrayList<UIScene> scenes) {
        this.scenes = scenes;
    }

    private void showCurrentScene(){
        if (this.currentScene == null) return;

        this.currentScene.drawScene();
        this.currentScene.showScene();
    }

    public static void init(ArrayList<UIScene> scenes){
        if (sceneHandler != null) return;

        sceneHandler = new SceneHandler(scenes);
    }

    public void changeScene(SceneEnum scene){
        if (scene == null) return;

        this.currentScene = this.scenes.get(scene.ordinal());
        this.showCurrentScene();
    }

    public static SceneHandler getSceneHandler(){
        if (sceneHandler == null) throw new NullPointerException("SceneHandler.getSceneHandler(): sceneHandler is not initialized");

        return sceneHandler;
    }
}
