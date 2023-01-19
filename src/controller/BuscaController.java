/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ArraySingleton;
import model.Passagem;

/**
 * FXML Controller class
 *
 * @author guilh
 */
public class BuscaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private TextArea txt_resultado;
    
    @FXML
    private TextField txt_cpf;
    
    @FXML
    public void trocarPrincipal(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/view/principal.fxml"));  
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //Função de busca apenas para teste, será necessaria mudar ao implmentar o banco
    public void buscarPassagem(ActionEvent event) throws IOException{
        if(txt_cpf.getText() != null){
                int cpf = Integer.parseInt(txt_cpf.getText());
                for(Passagem p: ArraySingleton.getInstance().getArrayList()){{
                    if(p.getCpf() == cpf){
                        txt_resultado.setText(p.toString());
                    }
                }
           }
        }
    }
    
    //Função de delete apenas para teste, será necessaria mudar ao implmentar o banco
    public void deletarPassagem(ActionEvent event) throws IOException{
            if(txt_cpf.getText() != null){
                int cpf = Integer.parseInt(txt_cpf.getText());
                for(Passagem p: ArraySingleton.getInstance().getArrayList()){{
                    if(p.getCpf() == cpf){
                        ArraySingleton.getInstance().getArrayList().remove(p);
                        txt_resultado.setText("");
                    }
                }
           }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                txt_cpf.textProperty().addListener(
                (obesrvable, oldValue, newValue)->{
                    try{
                        if(!newValue.equals("")) parseInt(newValue);
                    }catch(Exception ex){
                        txt_cpf.setText(oldValue);
                    }
                }
        
        
        );
    }    
    
}
