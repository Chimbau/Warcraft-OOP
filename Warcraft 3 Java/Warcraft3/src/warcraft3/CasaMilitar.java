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
public class CasaMilitar extends Estrutura {
    
    protected CasaMilitar(Jogador j){
        super(j);
    }
     
    public Militar CriarGuerreiro(){
         if (((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 2) && (this.getJogador().getOuro() >= 160) && (this.getJogador().getMadeira() >= 20)){         
            Militar m = new Militar(this.getJogador());
            m.setTipo(EspecializacaoEnum.guerreiro);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+2);
            this.getJogador().setOuro(this.getJogador().getOuro() - 160);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 20);
            return m;
                     
        }
        else{
            System.out.println("Nao ha recursos para criar um Guerreiro");
            return null;
        }
    }
    
    public Militar CriarSentinela(){
         if (((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 3) && (this.getJogador().getOuro() >= 240) && (this.getJogador().getMadeira() >= 30)){         
            Militar m = new Militar(this.getJogador());
            m.setTipo(EspecializacaoEnum.sentinela);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+3);
            this.getJogador().setOuro(this.getJogador().getOuro() - 240);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 30);
            return m;
                     
        }
        else{
            System.out.println("Nao ha recursos para criar um Sentinela");
            return null;
        }
    }
    
    public Militar CriarCatapulta(){
         if (((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 4) && (this.getJogador().getOuro() >= 290) && (this.getJogador().getMadeira() >= 60)){         
            Militar m = new Militar(this.getJogador());
            m.setTipo(EspecializacaoEnum.catapulta);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+4);
            this.getJogador().setOuro(this.getJogador().getOuro() - 290);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 60);
            return m;
                     
        }
        else{
            System.out.println("Nao ha recursos para criar uma Catapulta");
            return null;
        }
    }
    
    public Militar CriarMago(){
         if (((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 2) && (this.getJogador().getOuro() >= 180) && (this.getJogador().getMadeira() >= 20)){         
            Militar m = new Militar(this.getJogador());
            m.setTipo(EspecializacaoEnum.mago);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+2);
            this.getJogador().setOuro(this.getJogador().getOuro() - 180);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 20);
            return m;
                     
        }
        else{
            System.out.println("Nao ha recursos para criar um Mago");
            return null;
        }
    }
    
    public Militar CriarVoador(){
         if (((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 4) && (this.getJogador().getOuro() >= 330) && (this.getJogador().getMadeira() >= 70)){         
            Militar m = new Militar(this.getJogador());
            m.setTipo(EspecializacaoEnum.voador);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+4);
            this.getJogador().setOuro(this.getJogador().getOuro() - 330);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 70);
            return m;
                     
        }
        else{
            System.out.println("Nao ha recursos para criar um Voador");
            return null;
        }
    }
    
    public Militar CriarCavaleiro(){
         if (((this.getJogador().getMantimentosMaximos() - this.getJogador().getMantimentosAtuais()) >= 5) && (this.getJogador().getOuro() >= 350) && (this.getJogador().getMadeira() >= 80)){         
            Militar m = new Militar(this.getJogador());
            m.setTipo(EspecializacaoEnum.cavaleiro);
            this.getJogador().setMantimentosAtuais(this.getJogador().getMantimentosAtuais()+5);
            this.getJogador().setOuro(this.getJogador().getOuro() - 350);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 80);
            return m;
                     
        }
        else{
            System.out.println("Nao ha recursos para criar um Cavaleiro");
            return null;
        }
    }
    
    
    }
    
   
    

