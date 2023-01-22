/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author guilh
 */
public abstract class Passagem {
    
    
    protected float preco;
    protected float distancia;
    protected int tempo;
    protected String nome;
    protected int cpf;
    protected UUID id;
    
    public abstract void calcularPreco(int destino, int empresa);
    public  abstract void calcularDistancia(int destino);
    public abstract void calcularTempo(int destino);
    public abstract UUID gerarId();
    public abstract Passagem gerarPassagem(int empresa,int destino, String nome, int cpf);
    public abstract UUID getId();
    public abstract String getNome();
    public abstract int getCpf();
    public abstract int getTempo();
    public abstract float getDistancia();
    public abstract float getPreco();
    
    
}
