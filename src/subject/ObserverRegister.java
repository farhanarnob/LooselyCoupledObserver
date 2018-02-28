package subject;

import custom_observer.CustomObserver;

public interface ObserverRegister {
    void registerObserver(CustomObserver customObserver);

    void removeObserver(CustomObserver customObserver);

    void notifyObserver();
}
