
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jincheng
 */
public class Controller {
    
    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;
    
    public void submit(ActionEvent event){
        if (nameTextField.getText().trim().isEmpty()) {
            showAlert("Please type the name");
            return; // Exit the method early
        }

        // Checking if the age text field is empty
        if (ageTextField.getText().trim().isEmpty()) {
            showAlert("Please type the age");
            return; // Exit the method early
        }

        // Checking if the email text field is empty
        if (emailTextField.getText().trim().isEmpty()) {
            showAlert("Please type the email");
            return; // Exit the method early
        }
        System.out.println("Submitted");
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted!");
        alert.setHeaderText("Thank you");
        String content = "Submitted Details:\nName: " + name + "\nAge: " + age + "\nEmail: " + email;
        alert.setContentText(content);
        alert.showAndWait();
    }
    
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Validation Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
