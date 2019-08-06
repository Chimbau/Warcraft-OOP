/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warcraft3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pichau
 */
public class CasaDeArmas extends Estrutura {
    
    private List<Militar> exercito = new ArrayList<>();

    public List<Militar> getExercito() {
        return exercito;
    }

    public void setExercito(List<Militar> exercito) {
        this.exercito = exercito;
    }
    
    
    
    protected CasaDeArmas(Jogador j){
        super(j);
    }
    
    public void AumentarAtaque(){
        int i;
        if ((this.getJogador().getOuro() >= 100) && (this.getJogador().getMadeira() >= 100)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 100);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 100);
            for(i=0;i<exercito.size();i++){
            exercito.get(i).setAtaque(exercito.get(i).getAtaque() + 5);
            }
        }        
    }
    
    public void AumentarDefesa(){
        int i;
        if ((this.getJogador().getOuro() >= 100) && (this.getJogador().getMadeira() >= 100)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 100);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 100);
            for(i=0;i<exercito.size();i++){
                exercito.get(i).setArmadura(exercito.get(i).getArmadura()+ 5);
            }
        }
    }
    
}
