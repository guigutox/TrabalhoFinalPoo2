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
public class EmpresaUniao implements Empresa{
     @Override
    public Passagem criarPassagemOnibus(int empresa,int destino, String nome, int cpf) {
         PassagemOnibus x = new PassagemOnibus();
        return(x.gerarPassagem(empresa,destino, nome, cpf));
    }

    @Override
    public Passagem criarPassagemAviao(int empresa, int destino, String nome, int cpf) {
         PassagemOnibus x = new PassagemOnibus();
        return(x.gerarPassagem(empresa,destino, nome, cpf));
    }

    @Override
    public Passagem criarPassagemBarco(int empresa,int destino, String nome, int cpf) {
         PassagemOnibus x = new PassagemOnibus();
        return(x.gerarPassagem(empresa, destino, nome, cpf));
    }
}
