package edu.victor.java.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("volume: "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("volume: "+volume);
    }

    public void escolherCanal (int canalEscolhido){
        canal = canalEscolhido;
        System.out.println("canal atual: "+canal);
    }
    public void avancarCanal(){
        canal++;
        System.out.println("canal atual: "+canal);
    }
    public void regredirCanal(){
        canal--;
        System.out.println("canal atual: "+canal);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}