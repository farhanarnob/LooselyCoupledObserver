package want_to_provide_data;

import custom_observer.CustomObserver;
import model.DataModel;
import subject.ObserverRegister;

import java.util.ArrayList;

public class DataProvider implements ObserverRegister {
    private DataModel dataModel = new DataModel();
    private ArrayList<CustomObserver> customObservers = new ArrayList<>();

    public DataModel getDataModel() {
        return dataModel;
    }

    public void ChangeDataModel() {
        dataSetChanged();
    }

    private void dataSetChanged() {
        notifyObserver();
    }

    @Override
    public void registerObserver(CustomObserver customObserver) {
        customObservers.add(customObserver);
    }

    @Override
    public void removeObserver(CustomObserver customObserver) {
        int index = customObservers.indexOf(customObserver);
        if (index >= 0) {
            customObservers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (CustomObserver customObserver : customObservers) {
            customObserver.update(dataModel);
        }
    }
}
