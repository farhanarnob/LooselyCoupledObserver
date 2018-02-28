package want_to_provide_data;

import model.DataModel;

import java.util.Observable;

public class DataProvider extends Observable {
    private DataModel dataModel = new DataModel();

    public void dataModelChanged() {
        setChanged();
        notifyObservers();
    }

    public DataModel getDataModel() {
        return dataModel;
    }
}
