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
public class Militar extends UnidadeJogavel {
    private EspecializacaoEnum tipo;

    public EspecializacaoEnum getTipo() {
        return tipo;
    }

    public void setTipo(EspecializacaoEnum tipo) {
        this.tipo = tipo;
    }
    
    protected Militar(Jogador j){
        super(j);
    }
    
}
