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
public class Peao extends UnidadeJogavel {
    
    private int CapacidadeOuro;
    private int CapacidadeMadeira;
    private Mediador mediador;

    public Mediador getMediador() {
        return mediador;
    }

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }
   
    public int getCapacidadeOuro() {
        return CapacidadeOuro;
    }

    public void setCapacidadeOuro(int CapacidadeOuro) {
        this.CapacidadeOuro = CapacidadeOuro;
    }

    public int getCapacidadeMadeira() {
        return CapacidadeMadeira;
    }

    public void setCapacidadeMadeira(int CapacidadeMadeira) {
        this.CapacidadeMadeira = CapacidadeMadeira;
    } 
    
    protected Peao(Jogador j){
        super(j);
    }
       
    public void Minerar(int qtde){
        this.getJogador().setOuro(this.getJogador().getOuro() + qtde);      
    }
    
    public void PegarMadeira(int qtde){
        this.getJogador().setMadeira(this.getJogador().getMadeira() + qtde);
    }
    
    public void OperacaoMina(int qtde){
        mediador.Mineracao(qtde);
    }
    
    public void OperacaoFloresta(int qtde){
        mediador.CortarMadeira(qtde);
    }
    
    public CasaPrincipal ConstruirCasaPricipal(){
        if ((this.getJogador().getOuro() >= 450) && (this.getJogador().getMadeira() >= 150)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 450);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 150);
            return new CasaPrincipal(this.getJogador());
        }
        else{
            System.out.println("Nao ha recursos suficientes para construir uma Casa Principal");
            return null;           
        }
    }
    
    public CasaDeAlimento ConstruirCasaDeAlimento(){
        if ((this.getJogador().getOuro() >= 80) && (this.getJogador().getMadeira() >= 20)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 80);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 20);
            return new CasaDeAlimento(this.getJogador());
        }
        else{
            System.out.println("Nao ha recursos suficientes para construir uma Casa de Alimento");
            return null;           
        }
    }
    
    public Torre ConstruirTorre(){
        if ((this.getJogador().getOuro() >= 80) && (this.getJogador().getMadeira() >= 20)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 80);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 20);
            return new Torre(this.getJogador());
        }
        else{
            System.out.println("Nao ha recursos suficientes para construir uma Torre");
            return null;           
        }
    }
    
    public Loja ConstruirLoja(){
        if ((this.getJogador().getOuro() >= 200) && (this.getJogador().getMadeira() >= 100)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 200);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 100);
            return new Loja(this.getJogador());
        }
        else{
            System.out.println("Nao ha recursos suficientes para construir uma Loja");
            return null;           
        }
    }
    
    public CasaMilitar ConstruirCasaMilitar(){
         if ((this.getJogador().getOuro() >= 240) && (this.getJogador().getMadeira() >= 80)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 240);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 80);
            return new CasaMilitar(this.getJogador());
        }
        else{
            System.out.println("Nao ha recursos suficientes para construir uma Casa Militar");
            return null;           
        }
    }
    
    public CasaDoHeroi ConstruirCasaDoHeroi(){
        if ((this.getJogador().getOuro() >= 300) && (this.getJogador().getMadeira() >= 100)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 300);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 100);
            return new CasaDoHeroi(this.getJogador());
        }
        else{
            System.out.println("Nao ha recursos suficientes para construir uma Casa do Heroi");
            return null;           
        }
    }
    
    public CasaDeArmas ConstruirCasaDeArmas(){
         if ((this.getJogador().getOuro() >= 240) && (this.getJogador().getMadeira() >= 50)){
            this.getJogador().setOuro(this.getJogador().getOuro() - 240);
            this.getJogador().setMadeira(this.getJogador().getMadeira() - 50);
            return new CasaDeArmas(this.getJogador());
        }
        else{
            System.out.println("Nao ha recursos suficientes para construir uma Casa de Armas");
            return null;           
        }
    }
       
    
}
