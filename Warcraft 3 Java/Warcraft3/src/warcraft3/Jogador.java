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
public class Jogador {
    private String nome;
    private int ouro;
    private int madeira;
    private int mantimentosAtuais;
    private int mantimentosMaximos;
    private RacaEnum raca;
    private Area area;
    private boolean obteveCasaInicial;
    private boolean obtevePeaoInicial;
    
    public Jogador(Area a){
        this.area = a;
        this.setMadeira(200);
        this.setOuro(750);
        this.setMantimentosMaximos(12);
        this.setObteveCasaInicial(false);
        this.setObtevePeaoInicial(false);
        
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public boolean isObteveCasaInicial() {
        return obteveCasaInicial;
    }

    public void setObteveCasaInicial(boolean obteveCasaInicial) {
        this.obteveCasaInicial = obteveCasaInicial;
    }

    public boolean isObtevePeaoInicial() {
        return obtevePeaoInicial;
    }

    public void setObtevePeaoInicial(boolean obtevePeaoInicial) {
        this.obtevePeaoInicial = obtevePeaoInicial;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public int getMadeira() {
        return madeira;
    }

    public void setMadeira(int madeira) {
        this.madeira = madeira;
    }

    public int getMantimentosAtuais() {
        return mantimentosAtuais;
    }

    public void setMantimentosAtuais(int mantimentosAtuais) {
        this.mantimentosAtuais = mantimentosAtuais;
    }

    public int getMantimentosMaximos() {
        return mantimentosMaximos;
    }

    public void setMantimentosMaximos(int mantimentosMaximos) {
        this.mantimentosMaximos = mantimentosMaximos;
    }

    public RacaEnum getRaca() {
        return raca;
    }

    public void setRaca(RacaEnum raca) {
        this.raca = raca;
    }
    
    public Peao PeaoInicial(){
        if (this.isObtevePeaoInicial() == false){
            this.setMantimentosAtuais(mantimentosAtuais + 1);
            this.setObtevePeaoInicial(true);
            return new Peao(this);
        }
        else{
            System.out.println("Nao eh possivel criar outro peao inicial");
            return null;
        }
    }
    
    public CasaPrincipal CasaInicial(){
        if (this.isObteveCasaInicial() == false){
            this.setObteveCasaInicial(true);
            return new CasaPrincipal(this);
        }
        else{
            System.out.println("Nao eh possivel criari outra casa inicial");
            return null;
        }
    }
    
    public void VerSuprimentos(){
        System.out.println("Ouro = "+this.getOuro());
        System.out.println("Madeira = "+this.getMadeira());
        System.out.println("Alimentos "+this.getMantimentosAtuais()+"/"+this.getMantimentosMaximos());
        //System.out.println("\n");
    }
}
