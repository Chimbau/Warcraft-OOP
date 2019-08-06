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
public abstract class UnidadeJogavel extends Unidade {
    private int precoOuro;
    private int precoMadeira;
    private int suprimentosUsados;
    private Jogador jogador;

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    UnidadeJogavel(Jogador j){
        this.jogador = j;
    }

    public int getPrecoOuro() {
        return precoOuro;
    }

    public void setPrecoOuro(int precoOuro) {
        this.precoOuro = precoOuro;
    }

    public int getPrecoMadeira() {
        return precoMadeira;
    }

    public void setPrecoMadeira(int precoMadeira) {
        this.precoMadeira = precoMadeira;
    }

    public int getSuprimentosUsados() {
        return suprimentosUsados;
    }

    public void setSuprimentosUsados(int suprimentosUsados) {
        this.suprimentosUsados = suprimentosUsados;
    }
    
    public void ConfirmarMorte(){
        if(this.getVida() <= 0){
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais() - this.getSuprimentosUsados());
        }
    }
    
    
}
