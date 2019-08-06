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
public class Torre extends Estrutura {
    private int ataque;
    private int alcance;
    private int velocidadeDeAtaque;

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getVelocidadeDeAtaque() {
        return velocidadeDeAtaque;
    }

    public void setVelocidadeDeAtaque(int velocidadeDeAtaque) {
        this.velocidadeDeAtaque = velocidadeDeAtaque;
    }
    
    protected Torre(Jogador j){
        super(j);
    }
}
