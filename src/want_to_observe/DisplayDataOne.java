package want_to_observe;

import custom_observer.CustomObserver;
import displayer.Display;
import model.DataModel;

public class DisplayDataOne implements CustomObserver, Display {
    private DataModel dataModel;

    @Override
    public void update(DataModel data) {
        this.dataModel = data;
        displayData();
    }

    @Override
    public void displayData() {
        System.out.println("\npower name: " + dataModel.getPowerName() + " and its power value is " + dataModel.getPower() + " from " + DisplayDataOne.class.getSimpleName() + "\n");
    }
}
