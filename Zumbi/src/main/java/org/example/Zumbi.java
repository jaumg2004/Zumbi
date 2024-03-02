package org.example;

public class Zumbi {

    public double vida;
    public String nome;

    public double mostrarVida(){
        return vida;
    }

    public boolean transfereVida( Zumbi zumbiAlvo, double quantia){
        if(zumbiAlvo.vida < 700){
            zumbiAlvo.vida += quantia;
            vida -= quantia;
            return true;
        }
        else
            return false;
    }
}
