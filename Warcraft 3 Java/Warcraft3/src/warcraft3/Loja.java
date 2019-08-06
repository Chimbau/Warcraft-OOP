/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warcraft3;

import java.util.List;

/**
 *
 * @author Pichau
 */
public class Loja extends Estrutura {
    
    private List<Item> itens;

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    protected Loja(Jogador j){
        super(j);
    }
}
