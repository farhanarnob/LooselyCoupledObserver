package want_to_observe;

import model.DataModel;
import want_to_provide_data.DataProvider;

import java.util.Observable;
import java.util.Observer;

public class DisplayDataOne implements Observer {
    private DataModel dataModel;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DataProvider) {
            dataModel = ((DataProvider) o).getDataModel();
            displayData();
        }
    }

    private void displayData() {
        System.out.println("\npower name: " + dataModel.getPowerName() + " and its power value is " + dataModel.getPower() + " from " + DisplayDataOne.class.getSimpleName() + "\n");
    }
}
