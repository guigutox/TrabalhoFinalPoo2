/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.UUID;

/**
 *
 * @author guilh
 */
public class PassagemBarco implements Passagem{
         private float preco;
    private float distancia;
    private int tempo;
    private String nome;
    private int rg;
    private UUID id;
    
    @Override
    //Gera uma passagem de onibus e retorna usando todos os parametros + dados gerados na classe
    public PassagemBarco gerarPassagem(int destino, String nome, int rg){
        this.nome = nome;
        this.rg = rg;
        calcularTempo(destino);
        calcularPreco(destino);
        calcularDistancia(destino);
        this.id = gerarId();
        return this;
    }
    
    
    @Override
    //calcula o tempo de viagem a partir do destino
    public void calcularTempo(int destino){
           switch(destino){
           //Sao paulo
           case 1:
               this.tempo = 3;
               break;
           //Fortaleza
           case 2:
               this.tempo = 30;
               break;
            //Paraguai:
           case 3:
               this.tempo = 18;
               break;
       } 
        
        
    }
    
    
   @Override
    //calcula o preço de viagem a partir do destino
    public void calcularPreco(int destino) {
            switch(destino){
           //Sao paulo
           case 1:
               this.preco = (float) 600 ;
               break;
           //Fortaleza
           case 2:
               this.preco = (float) 1300.00;
               break;
            //Paraguai:
           case 3:
               this.preco = (float) 1100.0;
               break;
       } 
    }

    @Override
     //calcula a distancia de viagem a partir do destino
    public void calcularDistancia(int destino) {
       switch(destino){
           //Sao paulo
           case 1:
               this.distancia = 600;
               break;
           //Fortaleza
           case 2:
               this.distancia = (float) 2600;
               break;
            //Paraguai:
           case 3:
               this.distancia = (float) 1400;
               break;
       } 
        
       
    }
    
    public PassagemBarco getPassagem(){
        return this;
    }
    
    @Override
    public UUID gerarId(){
        return(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nRG: "+rg+"\nNome: "+nome+"\nTempo: "+tempo+"\nDistancia"+distancia+" km\nPreco: R$"+preco;
    }
    
   
    public float getPreco() {
        return preco;
    }

    public float getDistancia() {
        return distancia;
    }

    public int getTempo() {
        return tempo;
    }

    public String getNome() {
        return nome;
    }

    public int getRg() {
        return rg;
    }

    @Override
    public UUID getId() {
        return id;
    }
    
}
