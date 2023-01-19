/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author guilh
 */
public class Empresa{
    
    //Retorna a instancia de uma passagem de Onibus
    public Passagem passagemOnibus(int destino, int rg, String nome){
        PassagemOnibus x = new PassagemOnibus();
        return(x.gerarPassagem(destino, nome, rg));
    }
    //Retorna a instancia de uma passagem de Aviao
    public Passagem passagemAviao(int destino, int rg, String nome){
        PassagemAviao x = new PassagemAviao();
        return(x.gerarPassagem(destino, nome, rg));
    }
    //Retorna a instancia de uma passagem de barco
    public Passagem passagemBarco(int destino, int rg, String nome){
        PassagemBarco x = new PassagemBarco();
        return(x.gerarPassagem(destino, nome, rg));
    }
    
    
}
