package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome="Janderson";
        zumbi1.vida=1000;

        zumbi2.nome="Crepper";
        zumbi2.vida=616;

        System.out.println(zumbi1.mostrarVida());
        System.out.println(zumbi2.mostrarVida());
        if(zumbi1.transfereVida( zumbi2, 192)) {
            System.out.println(zumbi1.nome + " transfere " + 192 + " para " + zumbi2.nome);
        }
        else {
            System.out.println("Não foi possível ransferir a vida do " + zumbi1.nome + " para " + zumbi2.nome);
        }
        System.out.println(zumbi1.mostrarVida());
        System.out.println(zumbi2.mostrarVida());

    }
}