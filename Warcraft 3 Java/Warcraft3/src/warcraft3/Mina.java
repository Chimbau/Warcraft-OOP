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
public class Mina{
    private int quantidadeOuro;

    public int getQuantidadeOuro() {
        return quantidadeOuro;
    }

    public void setQuantidadeOuro(int quantidadeOuro) {
        this.quantidadeOuro = quantidadeOuro;
    }
    
    public void Extracao(int qtde){
        if (quantidadeOuro >= qtde){
            this.setQuantidadeOuro(this.getQuantidadeOuro() - qtde);
        }
        else{
            System.out.println("A Mina nao tem mais essa quantidade de ouro");
        }
    }
    
    public void VerQuantidadeAtual(){
        System.out.println("Ouro atual da mina = " +this.getQuantidadeOuro());
    }
}
