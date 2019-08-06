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
public class CasaDeAlimento extends Estrutura {
    private int capacidadeAlimento = 5;

    public int getCapacidadeAlimento() {
        return capacidadeAlimento;
    }

    public void setCapacidadeAlimento(int capacidadeAlimento) {
        this.capacidadeAlimento = capacidadeAlimento;
    }
    
    protected CasaDeAlimento(Jogador j){
        super(j);
        j.setMantimentosMaximos(j.getMantimentosMaximos() + 5);
    }
    
    public void ConfirmarDestruicao(){
        if(this.getVida() <= 0){
            this.getJogador().setMantimentosMaximos(this.getJogador().getMantimentosMaximos() - this.getCapacidadeAlimento());
        }
    }
    
    
}
