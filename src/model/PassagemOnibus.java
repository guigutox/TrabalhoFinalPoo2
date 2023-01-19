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
public class PassagemOnibus implements Passagem{

    private float preco;
    private float distancia;
    private int tempo;
    private String nome;
    private int rg;
    private UUID id;
    
    @Override
    //Gera uma passagem de onibus e retorna usando todos os parametros + dados gerados na classe
    public PassagemOnibus gerarPassagem(int destino, String nome, int rg){
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
               this.tempo = 5;
               break;
           //Fortaleza
           case 2:
               this.tempo = 52;
               break;
            //Paraguai:
           case 3:
               this.tempo = 24;
               break;
       } 
        
        
    }
    
    
   @Override
    //calcula o preço de viagem a partir do destino
    public void calcularPreco(int destino) {
            switch(destino){
           //Sao paulo
           case 1:
               this.preco = (float) 200.00 ;
               break;
           //Fortaleza
           case 2:
               this.preco = (float) 950.00;
               break;
            //Paraguai:
           case 3:
               this.preco = (float) 774;
               break;
       } 
    }

    @Override
    //calcula a distancia de viagem a partir do destino
    public void calcularDistancia(int destino) {
       switch(destino){
           //Sao paulo
           case 1:
               this.distancia = 434;
               break;
           //Fortaleza
           case 2:
               this.distancia = (float) 2900;
               break;
            //Paraguai:
           case 3:
               this.distancia = (float) 1230;
               break;
       } 
        
       
    }
    
    public PassagemOnibus getPassagem(){
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
