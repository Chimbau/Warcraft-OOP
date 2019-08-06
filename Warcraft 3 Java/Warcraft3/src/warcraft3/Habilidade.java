/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warcraft3;

/**
 *
 * @author Pichau
 */
public abstract class Habilidade {
    private String nome;
    private String efeito;
    private int dano;
    private int areaAfetada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getAreaAfetada() {
        return areaAfetada;
    }

    public void setAreaAfetada(int areaAfetada) {
        this.areaAfetada = areaAfetada;
    }
    
    
}
