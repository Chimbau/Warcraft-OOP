/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppWarcraft3;

import warcraft3.Area;
import warcraft3.CasaDeArmas;
import warcraft3.CasaDoHeroi;
import warcraft3.CasaMilitar;
import warcraft3.CasaPrincipal;
import warcraft3.Consumivel;
import warcraft3.Equipamento;
import warcraft3.Esquadrao;
import warcraft3.Floresta;
import warcraft3.FonteDeVida;
import warcraft3.HabilidadeAtiva;
import warcraft3.HabilidadePassiva;
import warcraft3.Heroi;
import warcraft3.Jogador;
import warcraft3.MediadorPeaoFonte;
import warcraft3.Militar;
import warcraft3.Mina;
import warcraft3.Peao;
import warcraft3.RacaEnum;
import warcraft3.UnidadeSelvagem;


/** Tabela de Custos   Ouro   Madeira    Alimento
 * Casa Principal      450    150
 * Casa Militar        240    80
 * Casa de Alimento    80     20
 * Casa do Heroi       300    100
 * Torre               80     20
 * Casa de Armas       240    50
 * Loja                200    100
 * 
 * 
 * Guerreiro           160    20         2
 * Sentinela           240    30         3
 * Cataputla           290    60         4
 * Mago                180    20         2
 * Voador              330    70         4
 * Cavaleiro           350    80         5
 */



public class App {
    public static void main(String[] args) {
        Area area  = new Area();
        Jogador jogador1 = new Jogador(area);
        jogador1.setRaca(RacaEnum.humano);
        Peao peao1 = jogador1.PeaoInicial();
        CasaPrincipal casaPrincipal = jogador1.CasaInicial();
               
        Mina mina = new Mina();
        mina.setQuantidadeOuro(5000);
        Floresta floresta = new Floresta();
        floresta.setQuantidadeMadeira(3000);
        FonteDeVida fonte = new FonteDeVida();
        area.getMinas().add(mina);
        area.getFlorestas().add(floresta);
        area.getFontes().add(fonte);
        
        
        MediadorPeaoFonte mediador = new MediadorPeaoFonte();
        mediador.setPeao(peao1);
        mediador.setFloresta(floresta);
        mediador.setMina(mina);
        peao1.setMediador(mediador);
        System.out.println("");
        
        System.out.println("Suprimentos Iniciais do jogador e quantidade nas fontes");
        jogador1.VerSuprimentos();
        mina.VerQuantidadeAtual();
        floresta.VerQuantidadeAtual();
        System.out.println("\n");
        
        CasaMilitar casaMilitar = peao1.ConstruirCasaMilitar();
        CasaDeArmas casaDeArmas = peao1.ConstruirCasaDeArmas(); 
        peao1.ConstruirCasaDeAlimento();
        System.out.println("Suprimentos Apos construir tres casas");       
        jogador1.VerSuprimentos();
        System.out.println("\n");
        
        System.out.println("Suprimentos apos coletar ouro e madeira");
        peao1.OperacaoMina(1500);
        peao1.OperacaoFloresta(400);
        jogador1.VerSuprimentos();
        mina.VerQuantidadeAtual();
        floresta.VerQuantidadeAtual();
        System.out.println("\n");     
        
        peao1.ConstruirLoja();
        peao1.ConstruirTorre();
        CasaDoHeroi casaDoHeroi = peao1.ConstruirCasaDoHeroi(); 
                
        Militar guerreiro1 = casaMilitar.CriarGuerreiro();
        guerreiro1.setAtaque(5);
        Militar sentinela1 = casaMilitar.CriarSentinela();
        sentinela1.setAtaque(10);
        Peao peao2 = casaPrincipal.CriarPeao();
        Heroi heroi1 = casaDoHeroi.CriarHeroiForca();
        heroi1.setForca(15);
        
        HabilidadeAtiva habilidadeAtiva1 = new HabilidadeAtiva();
        HabilidadePassiva habilidadePassiva1 = new HabilidadePassiva();
        habilidadeAtiva1.setNome("Terremoto");
        habilidadeAtiva1.setDano(40);
        habilidadePassiva1.setEfeito("Mais dano nos ataques basicos");
        heroi1.getHabilidades().add(habilidadeAtiva1);
        heroi1.getHabilidades().add(habilidadePassiva1);
        
        System.out.println("Suprimentos Apos construir algumas casas e fazer algumas unidades :");
        jogador1.VerSuprimentos();
        
        System.out.println("Ataque do guerreiro = "+guerreiro1.getAtaque());
        System.out.println("Ataque do sentinela = "+sentinela1.getAtaque());
        casaDeArmas.getExercito().add(guerreiro1);
        casaDeArmas.getExercito().add(sentinela1);
        casaDeArmas.AumentarAtaque();
        System.out.println("\nAtaque apos o uso da Casa de Armas : ");
        System.out.println("Ataque do guerreiro = "+guerreiro1.getAtaque());
        System.out.println("Ataque do sentinela = "+sentinela1.getAtaque());
        System.out.println("Ataque do heroi = "+heroi1.getAtaque());
        
        Esquadrao esquadrao = new Esquadrao();
        esquadrao.getUnidades().add(guerreiro1);
        esquadrao.getUnidades().add(sentinela1);
        esquadrao.getUnidades().add(heroi1);
        System.out.println("Ataque do esquadrao = "+esquadrao.getAtaqueTotal());
        
        
        UnidadeSelvagem unidadeInimiga = new UnidadeSelvagem();
        unidadeInimiga.setArmadura(3);
        unidadeInimiga.setVida(100);
        System.out.println("\nVida da unidade inimiga antes de atacar = "+unidadeInimiga.getVida());
        esquadrao.AtacarUnidade(unidadeInimiga);
        System.out.println("Vida da unidade inimiga depois de atacar = "+unidadeInimiga.getVida());
        
        Equipamento machado = new Equipamento();
        Consumivel consumivel = new Consumivel();
        machado.setAumentaForca(5);
        System.out.println("\nAtributos do heroi antes do item : ");
        System.out.println("Forca do Heroi = "+heroi1.getForca());
        System.out.println("Ataque do Heroi = "+heroi1.getAtaque());
        System.out.println("Vida do Heroi = "+heroi1.getVida());
        
        heroi1.getInventario().add(consumivel);
        heroi1.ObterEquipamento(machado);
        System.out.println("\nAtributos depois : ");
        System.out.println("Forca do Heroi = "+heroi1.getForca());
        System.out.println("Ataque do Heroi = "+heroi1.getAtaque());
        System.out.println("Vida do Heroi = "+heroi1.getVida());
        
              
    }
}
