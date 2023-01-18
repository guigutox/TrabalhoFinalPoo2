/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 *
 * @author guilh
 */
public class principalController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    
    @FXML
    private ToggleGroup destinos;
    @FXML
    private TextField txt_nome;
    
    @FXML
    private TextField txt_rg;

    @FXML
    private Label txt_resultado;


    
    
    @FXML
    public void trocarBusca(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("busca.fxml"));  
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void comprar(ActionEvent event){
        
        String x = txt_rg.getText();
        int rg = Integer.parseInt(x);
        String nome = txt_nome.getText();
        UUID uuid = UUID.randomUUID();
        
        RadioButton local =(RadioButton)destinos.getSelectedToggle();
        txt_resultado.setText(local.getText());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        txt_rg.textProperty().addListener(
                (obesrvable, oldValue, newValue)->{
                    try{
                        if(!newValue.equals("")) parseInt(newValue);
                    }catch(Exception ex){
                        txt_rg.setText(oldValue);
                    }
                }
        
        
        );
        
        
    }    
    
}
