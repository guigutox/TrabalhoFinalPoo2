/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import model.Passagem;

/**
 *
 * @author guilh
 */
public interface Empresa {
    
    public Passagem criarPassagemOnibus(int passagem, int destino, String nome, int cpf);
    public Passagem criarPassagemAviao(int passagem, int destino, String nome, int cpf);
    public Passagem criarPassagemBarco(int passagem, int destino, String nome, int cpf);
    
    
}
