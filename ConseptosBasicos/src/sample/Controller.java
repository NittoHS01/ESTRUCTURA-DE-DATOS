package sample;

import converciones.Convercion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField txtEdad;
    @FXML
    Label lblTitulo;

    public Controller() {
    }

    public void evento1(ActionEvent event) {
        Convercion td=new Convercion();
        int numero = Integer.parseInt(this.txtEdad.getText());
        String res = td.binario(numero);
        this.lblTitulo.setText(res);
    }
}
