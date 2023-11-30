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

        Dipendente luca = new Dipendente("Bc-248", 1100, 1200, 7, Livello.OPERAIO, Dipartimento.VENDITE);
        luca.stampaDatiDipendente();
        luca.promuovi();
        System.out.println(luca.getLivello());
        System.out.println(Dipendente.calcolaPagaMensile(luca));
        System.out.println(Dipendente.calcolaPagaConStraord(luca, 12));

        Dipendente giovanni = new Dipendente("Ab-456", 1300, 1500, 12, Livello.QUADRO, Dipartimento.AMMINISTRAZIONE);
        giovanni.stampaDatiDipendente();
        giovanni.promuovi();
        System.out.println(giovanni.getLivello());
        System.out.println(Dipendente.calcolaPagaMensile(giovanni));
        System.out.println(Dipendente.calcolaPagaConStraord(giovanni, 12));

        Dipendente antonio = new Dipendente("De-456", 1600, 1800, 15, Livello.DIRIGENTE, Dipartimento.AMMINISTRAZIONE);
        antonio.stampaDatiDipendente();
        antonio.promuovi();
        System.out.println(antonio.getLivello());
        System.out.println(Dipendente.calcolaPagaMensile(antonio));
        System.out.println(Dipendente.calcolaPagaConStraord(antonio, 8));
    }
}