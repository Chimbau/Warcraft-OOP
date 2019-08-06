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
public abstract class Estrutura {
    private String nome;
    private int vida;
    private int armadura;
    private int precoOuro;
    private int precoMadeira;
    private Jogador jogador;
    private boolean construida = true;
        
    
    Estrutura(Jogador j){
        this.jogador = j;
    }

    public boolean isConstruida() {
        return construida;
    }

    public void setConstruida(boolean construida) {
        this.construida = construida;
    }

    
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
      
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if(this.vida <= 0){
            this.setConstruida(false);
        }
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
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
    
    
}
