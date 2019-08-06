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
public class Heroi extends UnidadeJogavel {
    private int nivel;
    private int expNivel;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private AtributoPrimarioEnum tipo;
    private List<Item> inventario = new ArrayList<>();

    public List<Item> getInventario() {
        return inventario;
    }

    public void setInventario(List<Item> inventario) {
        this.inventario = inventario;
    }
    

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExpNivel() {
        return expNivel;
    }

    public void setExpNivel(int expNivel) {
        this.expNivel = expNivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if(this.getTipo() == AtributoPrimarioEnum.forte){
             this.setAtaque(this.getAtaque() + (forca - this.getForca()));
        }
        this.setVida(this.getVida() + (forca - this.getForca())*10);
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        if(this.getTipo() == AtributoPrimarioEnum.inteligente){
            this.setAtaque(this.getAtaque() + (inteligencia - this.getInteligencia()));
        }
        this.setMana(this.getMana() + (inteligencia - this.getInteligencia()*10));
        this.inteligencia = inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        if(this.getTipo() == AtributoPrimarioEnum.agil){
            this.setAtaque(this.getAtaque() + (agilidade - this.getAgilidade()));
        }
        this.setArmadura(this.getArmadura() + (agilidade - this.getAgilidade())*2);
        this.agilidade = agilidade;
    }

    public AtributoPrimarioEnum getTipo() {
        return tipo;
    }

    public void setTipo(AtributoPrimarioEnum tipo) {
        this.tipo = tipo;
    }
    
    protected Heroi(Jogador j){
        super(j);
    }
    
    public void ObterEquipamento(Equipamento e){
        if (this.inventario.size() < 6){
            this.getInventario().add(e);
            this.setForca(forca + e.getAumentaForca());
            this.setInteligencia(inteligencia + e.getAumentaInteligencia());
            this.setAgilidade(agilidade + e.getAumentaAgilidade());
        }
        else{
            System.out.println("Nao ha espaco no seu inventario");
        }
    }
    
    public void Reviver(){
        if ((this.isVivo() == false) && (this.getJogador().getOuro() >= 500)){
            this.setVivo(true);
            this.getJogador().setOuro(this.getJogador().getOuro() - 500);
            
        }
    }
    
    public void Evoluir(){
        this.setAtaque(this.getAtaque()+1);
        this.setArmadura(this.getArmadura()+1);
        this.setVida(this.getVida()+50);
        this.setMana(this.getMana()+50);
        
    }
}
