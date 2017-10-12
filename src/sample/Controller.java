package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    public Button entrar;
    public TextField user;
    public PasswordField pass;
    public Label error;
    static int contador = 0;
    public void login(ActionEvent actionEvent) {
        if (user.getText().equals("admin") && pass.getText().equals("123456")) {
          error.setText("Login Exitoso");
        } else if (!user.getText().isEmpty() || !user.getText().isEmpty()) {
            sumarIntento();
            error.setText("Login Fallido");
            if (getIntento() > 3) {
             error.setText("Ha intentado mas de 3 veces por tanto se ha bloqueado su cuenta");
             return;
            }
        }
    }

    private void sumarIntento() {
        contador++;
    }

    private int getIntento(){
        return contador;
    }
}
