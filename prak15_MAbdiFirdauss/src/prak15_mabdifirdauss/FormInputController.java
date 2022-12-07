package prak15_mabdifirdauss;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormInputController {

    @FXML
    private TextField FieldAlamat;

    @FXML
    private TextField FieldNama;

    @FXML
    private TextField FieldNpm;

    @FXML
    private Button btnTambah;

    @FXML
    void sendData(ActionEvent event)throws IOException {
        Mahasiswa mhs = new Mahasiswa(FieldNpm.getText(), FieldNama.getText(), FieldAlamat.getText());
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Output.fxml"));
        Parent root = loader.load();
        
        OutputController outputController = loader.getController();
        outputController.showValue(mhs);
        
        Stage stage = (Stage) btnTambah.getScene().getWindow();
        stage.setScene(new Scene(root));
        
    }

}
