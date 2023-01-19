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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import model.Passagem;
import controller.EmpresaCometa;
import model.ArraySingleton;

/**
 *
 * @author guilh
 */
public class principalController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Passagem p;
    
    
    @FXML
    private ToggleGroup destinos;
    @FXML
    private TextField txt_nome;
    
    @FXML
    private TextField txt_cpf;

    @FXML
    private TextArea txt_resultado;

    @FXML
    private ToggleGroup transporte;
    
    @FXML
    private ToggleGroup empresa;

    
    
    @FXML
    public void trocarBusca(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/view/busca.fxml"));  
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void comprar(ActionEvent event){
        //Empresa emp = new Empresa();
        EmpresaCometa empC = new EmpresaCometa();
        EmpresaUniao empU = new EmpresaUniao();
        
        String cpf_txt = txt_cpf.getText();
        int cpf = Integer.parseInt(cpf_txt);
        String nome = txt_nome.getText();
        UUID uuid = UUID.randomUUID();
        int destino = 0;
        
        
        //Pega o resultado da radio de destinos
        RadioButton local =(RadioButton)destinos.getSelectedToggle();
        String destinos = local.getText();
       
        //Converte o resultado da radio de destino para o numero do local
        switch (destinos) {
            case "São Paulo":
                destino = 1;
                break;
            case "Fortaleza":
                destino = 2;
                break;
            case "Paraguai":
                destino = 3;
                break;
            default:
                break;
        }
         //Pega o resultado da radio de transporte
        RadioButton transp = (RadioButton)transporte.getSelectedToggle();
        String transporte = transp.getText();
        
        //Pega o resultado do radio de empresa
        RadioButton empresa = (RadioButton)this.empresa.getSelectedToggle();
        String empresaEscolhida = empresa.getText();
        
        switch(empresaEscolhida){
            case "União":
                switch (transporte) {
                    case "Ônibus":
                        //Cria uma passagem de onibus
                       p = empC.criarPassagemOnibus(1,destino, nome, cpf);
                        break;
                    case "Avião":
                        //Cria uma passagem de aviao
                        p = empC.criarPassagemAviao(1,destino, nome, cpf);
                        break;
                    case "Barco":
                        //Cria uma passagem de barco
                        p = empC.criarPassagemBarco(1,destino, nome, cpf);
                        break;
                    default:
                        break;
                 }
                break;
                
                
            case "Cometa":
                switch (transporte) {
                    case "Ônibus":
                        //Cria uma passagem de onibus
                        p = empU.criarPassagemOnibus(2,destino, nome, cpf);
                        break;
                    case "Avião":
                        //Cria uma passagem de aviao
                        p = empU.criarPassagemAviao(2,destino, nome, cpf);
                        break;
                    case "Barco":
                        //Cria uma passagem de barco
                         p = empU.criarPassagemBarco(2,destino, nome, cpf);
                        break;
                    default:
                        break;
        }
                break;
        }
        //ADICIONA AO ARRAY O NOVO REGISTRO
       ArraySingleton.getInstance().getArrayList().add(p);
       txt_resultado.setText("Tipo de passagem:  "+transporte+"\nEmpresa: "+empresaEscolhida+"\n\n"+p.toString());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
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
