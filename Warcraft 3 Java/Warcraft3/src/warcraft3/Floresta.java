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
public class Floresta {
    private int quantidadeMadeira;

    public int getQuantidadeMadeira() {
        return quantidadeMadeira;
    }

    public void setQuantidadeMadeira(int quantidadeMadeira) {
        this.quantidadeMadeira = quantidadeMadeira;
    }
    
    public void extracao(int qtde){
        if (quantidadeMadeira >= qtde){
            this.setQuantidadeMadeira(this.getQuantidadeMadeira() - qtde);
        }
        else{
            System.out.println("A floresta nao tem mais essa quantidade de madeira");
        }
    }
    
     public void VerQuantidadeAtual(){
        System.out.println("Quantidade de madeira atual da floresta = " +this.getQuantidadeMadeira());
    }
}
