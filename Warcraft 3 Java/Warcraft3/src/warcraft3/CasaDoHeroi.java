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
public class CasaDoHeroi extends Estrutura {
    
    protected CasaDoHeroi(Jogador j){
        super(j);
    }
     
   public Heroi CriarHeroiForca(){
        if ((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 5){
            Heroi h = new Heroi(this.getJogador());
            h.setTipo(AtributoPrimarioEnum.forte);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+5);
            return h;
        }
        else{
            System.out.println("Nao ha recursos para criar um Heroi");
            return null;
        }
    }
   
   public Heroi CriarHeroiInteligencia(){
        if ((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 5){
            Heroi h = new Heroi(this.getJogador());
            h.setTipo(AtributoPrimarioEnum.inteligente);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+5);
            return h;
        }
        else{
            System.out.println("Nao ha recursos para criar um Heroi");
            return null;
        }
    }
   
   public Heroi CriarHeroiAgilidade(){
        if ((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 5){
            Heroi h = new Heroi(this.getJogador());
            h.setTipo(AtributoPrimarioEnum.agil);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+5);
            return h;
        }
        else{
            System.out.println("Nao ha recursos para criar um Heroi");
            return null;
        }
    }
}
