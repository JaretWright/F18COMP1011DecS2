import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class PersonViewer implements Initializable {

    @FXML
    private ListView<Person> listView;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Frank","Fingers"));
        people.add(new Person("Eddie","Eagle"));
        people.add(new Person("OnTime","Benson"));
        people.add(new Person("Anita","Job"));
        people.add(new Person("April","Scheurers"));
        people.add(new Person("May","Flowers"));

        listView.getItems().addAll(people);

        listView.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) ->personSelected(newValue));

    }

    private void personSelected(Person newPerson)
    {
        if (newPerson != null)
        {
            firstNameLabel.setText(newPerson.getFirstName());
            lastNameLabel.setText(newPerson.getLastName());
        }
        else {
            firstNameLabel.setText("");
            lastNameLabel.setText("");
        }
    }

}
