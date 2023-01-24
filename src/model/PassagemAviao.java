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
public class PassagemAviao extends Passagem {


    @Override
    //calcula o tempo de viagem a partir do destino
    public void calcularTempo(int destino) {
        switch (destino) {
            //Sao paulo
            case 1:
                this.tempo = 1;
                break;
            //Fortaleza
            case 2:
                this.tempo = 8;
                break;
            //Paraguai:
            case 3:
                this.tempo = 4;
                break;
        }
    }

    @Override
    //calcula o preço de viagem a partir do destino
    public void calcularPreco(int destino, int empresa) {

        switch (empresa) {
            case 1:
                switch (destino) {
                    //Sao paulo
                    case 1:
                        this.preco = (float) 400;
                        break;
                    //Fortaleza
                    case 2:
                        this.preco = (float) 1140;
                        break;
                    //Paraguai:
                    case 3:
                        this.preco = (float) 928;
                        break;
                }
                break;
            case 2:
                switch (destino) {
                    //Sao paulo
                    case 1:
                        this.preco = (float) 256;
                        break;
                    //Fortaleza
                    case 2:
                        this.preco = (float) 1300;
                        break;
                    //Paraguai:
                    case 3:
                        this.preco = (float) 572;
                        break;
                }

                break;
        }
    }

    @Override
    //calcula a distancia de viagem a partir do destino
    public void calcularDistancia(int destino) {
        switch (destino) {
            //Sao paulo
            case 1:
                this.distancia = 434;
                break;
            //Fortaleza
            case 2:
                this.distancia = (float) 2364;
                break;
            //Paraguai:
            case 3:
                this.distancia = (float) 1159;
                break;
        }

    }

    public PassagemAviao getPassagem() {
        return this;
    }

    @Override
    public UUID gerarId() {
        return (UUID.randomUUID());
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nCPF: " + cpf + "\nNome: " + nome + "\nTempo: " + tempo + "hrs\nDistancia: " + distancia + " km\nPreco: R$" + preco;
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

    public int getCpf() {
        return cpf;
    }

    @Override
    public UUID getId() {
        return id;
    }
}
