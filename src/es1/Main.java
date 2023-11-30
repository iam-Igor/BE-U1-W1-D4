package es1;

import entities.Dipartimento;
import entities.Dipendente;
import entities.Livello;

public class Main {
    public static void main(String[] args) {

        Dipendente mario = new Dipendente("Ab-123", 1000, 1200, 8, Livello.IMPIEGATO, Dipartimento.PRODUZIONE);
        mario.stampaDatiDipendente();
        mario.promuovi();
        System.out.println(mario.getLivello());
        System.out.println(Dipendente.calcolaPagaMensile(mario));
        System.out.println(Dipendente.calcolaPagaConStraord(mario, 10));
    }
}