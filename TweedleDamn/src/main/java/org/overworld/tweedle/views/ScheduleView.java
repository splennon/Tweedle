package org.overworld.tweedle.views;

import com.gluonhq.charm.glisten.mvc.View;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

public class ScheduleView {

    public View getView() {
        try {
            View view = FXMLLoader.load(ScheduleView.class.getResource("schedule.fxml"));
            return view;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
            return new View();
        }
    }
}
