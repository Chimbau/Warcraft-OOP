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
public class Consumivel extends Item {
    private int cargas;
    private String efeito;

    public int getCargas() {
        return cargas;
    }

    public void setCargas(int cargas) {
        this.cargas = cargas;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
    
}
