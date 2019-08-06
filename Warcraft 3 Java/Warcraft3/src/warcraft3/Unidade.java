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
public abstract class Unidade {
    private String nome;
    private int vida = 100;
    private int mana;
    private int ataque;
    private int armadura;
    private int alcance;
    private int velocidadeMovimento;
    private int velDeAtaque;
    private boolean vivo = true;
    private List<Habilidade> habilidades = new ArrayList<>();

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida){
        if (this.getVida() <= 0){
            this.setVivo(false);
        }
        this.vida = vida;
    }
    
    
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getVelocidadeMovimento() {
        return velocidadeMovimento;
    }

    public void setVelocidadeMovimento(int velocidadeMovimento) {
        this.velocidadeMovimento = velocidadeMovimento;
    }

    public int getVelDeAtaque() {
        return velDeAtaque;
    }

    public void setVelDeAtaque(int velDeAtaque) {
        this.velDeAtaque = velDeAtaque;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    public void AtacarEstrutura(Estrutura e){
        if (this.getAtaque() > e.getArmadura() && (this.isVivo() == true)){
            e.setVida(e.getVida() - (this.getAtaque() - e.getArmadura()));
        }
        else{
            System.out.println("Nao eh possivel fazer isso");
        }
    }
    
    public void AtacarUnidade(Unidade u){
        if (this.getAtaque() > u.getArmadura() && (this.isVivo() == true)){
            u.setVida(u.getVida() - (this.getAtaque() - u.getArmadura()));           
        }
         else{
            System.out.println("Nao eh possivel fazer isso");
        }
    }
    
   
    
    
            
}
