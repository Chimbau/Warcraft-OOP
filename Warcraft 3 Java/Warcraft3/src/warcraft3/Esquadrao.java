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
public class Esquadrao {
    private int ataqueTotal;
    private List<Unidade> unidades = new ArrayList<>();
    

    public List<Unidade> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<Unidade> unidades) {
        this.unidades = unidades;
    }
    

    public int getAtaqueTotal() {
        this.AtaqueTotal();
        return ataqueTotal;
    }

    public void setAtaqueTotal(int ataqueTotal) {
        this.ataqueTotal = ataqueTotal;
    }
    
    public void AtaqueTotal(){
        int i;
        ataqueTotal = 0;
        for(i=0;i<unidades.size();i++){
            if (unidades.get(i).isVivo() == true){
                this.setAtaqueTotal(ataqueTotal + unidades.get(i).getAtaque());
            }
        }
    }
    
    public void AtacarEstrutura(Estrutura e){
        if (this.getAtaqueTotal() > e.getArmadura()*this.getUnidades().size()){
            e.setVida(e.getVida() - (this.getAtaqueTotal() - e.getArmadura()*this.getUnidades().size()));
        }
        else{
            System.out.println("O ataque nao resultou em nada");
        }
    }
    
    public void AtacarUnidade(Unidade u){
        if (this.getAtaqueTotal() > u.getArmadura()*this.getUnidades().size()){
            u.setVida(u.getVida() - (this.getAtaqueTotal() - u.getArmadura()*this.getUnidades().size()));
        }
        else{
            System.out.println("O ataque nao resultou em nada");
        }
    }
    
    
}
