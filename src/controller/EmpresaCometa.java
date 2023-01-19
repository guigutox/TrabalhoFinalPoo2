/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Passagem;
import model.PassagemOnibus;

/**
 *
 * @author guilh
 */
public class EmpresaCometa implements Empresa{

    @Override
    public Passagem criarPassagemOnibus(int empresa, int destino, String nome, int rg) {
         PassagemOnibus x = new PassagemOnibus();
        return(x.gerarPassagem(empresa, destino, nome, rg));
    }

    @Override
    public Passagem criarPassagemAviao(int empresa ,int destino, String nome, int rg) {
         PassagemOnibus x = new PassagemOnibus();
        return(x.gerarPassagem(empresa,destino, nome, rg));
    }

    @Override
    public Passagem criarPassagemBarco(int empresa, int destino, String nome, int rg) {
         PassagemOnibus x = new PassagemOnibus();
        return(x.gerarPassagem(empresa, destino, nome, rg));
    }
    
}
