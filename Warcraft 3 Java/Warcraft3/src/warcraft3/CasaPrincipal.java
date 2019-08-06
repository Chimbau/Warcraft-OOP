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
public class CasaPrincipal extends Estrutura{
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    protected CasaPrincipal(Jogador j){
        super(j);
    }
    
    public void Aprimorar(){
        this.nivel = this.nivel + 1;
    }
    
    public Peao CriarPeao(){
        if ((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 1){
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+1);
            return new Peao(this.getJogador());
        }
        else{
            System.out.println("Nao ha recursos para criar um peao");
            return null;
        }
    }
    
}
