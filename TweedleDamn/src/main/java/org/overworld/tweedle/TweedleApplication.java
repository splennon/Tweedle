package org.overworld.tweedle;

import org.overworld.tweedle.views.ScheduleView;
import org.overworld.tweedle.views.NewTaskView;
import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TweedleApplication extends MobileApplication {

    public static final String SCHEDULE_VIEW = HOME_VIEW;
    public static final String NEWTASK_VIEW = "NewTask View";
    
    @Override
    public void init() {
        addViewFactory(SCHEDULE_VIEW, () -> new ScheduleView().getView());
        addViewFactory(NEWTASK_VIEW, () -> new NewTaskView().getView());

        DrawerManager.buildDrawer(this);
    }

    @Override
    public void postInit(Scene scene) {
        Swatch.BLUE.assignTo(scene);

        scene.getStylesheets().add(TweedleApplication.class.getResource("style.css").toExternalForm());
        ((Stage) scene.getWindow()).getIcons().add(new Image(TweedleApplication.class.getResourceAsStream("/icon.png")));
    }

    public static void main(String args[]) {
        launch(args);
    }
}
