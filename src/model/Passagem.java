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
public abstract class Passagem {
    
    public abstract void calcularPreco(int destino, int empresa);
    public  abstract void calcularDistancia(int destino);
    public abstract void calcularTempo(int destino);
    public abstract UUID gerarId();
    public abstract Passagem gerarPassagem(int empresa,int destino, String nome, int rg);
    public abstract UUID getId();
    public abstract String getNome();
    public abstract int getRg();
    public abstract int getTempo();
    public abstract float getDistancia();
    public abstract float getPreco();
    
    
}
