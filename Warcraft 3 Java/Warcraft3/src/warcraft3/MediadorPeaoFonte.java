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
public class MediadorPeaoFonte extends Mediador {
    
    private Peao peao;
    private Mina mina;
    private Floresta floresta;

    public Peao getPeao() {
        return peao;
    }

    public void setPeao(Peao peao) {
        this.peao = peao;
    }

    public Mina getMina() {
        return mina;
    }

    public void setMina(Mina mina) {
        this.mina = mina;
    }

    public Floresta getFloresta() {
        return floresta;
    }

    public void setFloresta(Floresta floresta) {
        this.floresta = floresta;
    }
    
    @Override
    public void Mineracao(int qtde){
        peao.Minerar(qtde);
        mina.Extracao(qtde);
    }
    @Override
    public void CortarMadeira(int qtde){
        peao.PegarMadeira(qtde);
        floresta.extracao(qtde);
    }
}
