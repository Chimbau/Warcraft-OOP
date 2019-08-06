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
public class Area {
    private String nome;
    private int quantidadeMinas;
    private int quantidadeFontes;
    private int pontosVerdes;
    private int pontosLaranjas;
    private int pontosVermelhos;
    private float horaDoDia;
    private List<Mina> minas = new ArrayList<>();
    private List<Floresta> florestas = new ArrayList<>();
    private List<FonteDeVida> fontes = new ArrayList<>();

    public List<Mina> getMinas() {
        return minas;
    }

    public void setMinas(List<Mina> minas) {
        this.minas = minas;
    }

    public List<Floresta> getFlorestas() {
        return florestas;
    }

    public void setFlorestas(List<Floresta> florestas) {
        this.florestas = florestas;
    }

    public List<FonteDeVida> getFontes() {
        return fontes;
    }

    public void setFontes(List<FonteDeVida> fontes) {
        this.fontes = fontes;
    }  

    public float getHoraDoDia() {
        return horaDoDia;
    }

    public void setHoraDoDia(float horaDoDia) {
        this.horaDoDia = horaDoDia;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeMinas() {
        return quantidadeMinas;
    }

    public void setQuantidadeMinas(int quantidadeMinas) {
        this.quantidadeMinas = quantidadeMinas;
    }

    public int getQuantidadeFontes() {
        return quantidadeFontes;
    }

    public void setQuantidadeFontes(int quantidadeFontes) {
        this.quantidadeFontes = quantidadeFontes;
    }

    public int getPontosVerdes() {
        return pontosVerdes;
    }

    public void setPontosVerdes(int pontosVerdes) {
        this.pontosVerdes = pontosVerdes;
    }

    public int getPontosLaranjas() {
        return pontosLaranjas;
    }

    public void setPontosLaranjas(int pontosLaranjas) {
        this.pontosLaranjas = pontosLaranjas;
    }

    public int getPontosVermelhos() {
        return pontosVermelhos;
    }

    public void setPontosVermelhos(int pontosVermelhos) {
        this.pontosVermelhos = pontosVermelhos;
    }
    
    
}
