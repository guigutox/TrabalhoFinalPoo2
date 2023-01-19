/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.UUID;

/**
 *
 * @author guilh
 */
public interface Passagem {
    public void calcularPreco(int destino);
    public void calcularDistancia(int destino);
    public void calcularTempo(int destino);
    public UUID gerarId();
    public Passagem gerarPassagem(int destino, String nome, int rg);
    public UUID getId();
    public String getNome();
    public int getRg();
    public int getTempo();
    public float getDistancia();
    public float getPreco();
}
