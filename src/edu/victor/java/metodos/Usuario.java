package edu.victor.java.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Geral: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV ligada? "+smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status - TV ligada? "+smartTv.ligada);

        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("Volume geral: "+smartTv.volume);

        smartTv.avancarCanal();
        smartTv.escolherCanal(6);
        smartTv.escolherCanal(18);
    }
}
