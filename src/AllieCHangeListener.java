import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class AllieCHangeListener implements ChangeListener {

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
            System.out.println("Person is :" + newValue);
    }
}
