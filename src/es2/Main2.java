package es2;

import entities.Dipartimento;
import entities.Dipendente;
import entities.GestioneDipendenti;
import entities.Livello;

public class Main2 {
    public static void main(String[] args) {

//        produzione

        Dipendente francesco = new Dipendente("Ab-123", 1000, 1200, 8, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        francesco.stampaDatiDipendente();
        francesco.promuovi();


        Dipendente alex = new Dipendente("Af-223", 1000, 1200, 8, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        alex.stampaDatiDipendente();


//        amministrazione
        Dipendente andrea = new Dipendente("Ab-456", 1300, 1500, 12, Livello.QUADRO, Dipartimento.AMMINISTRAZIONE);
        andrea.stampaDatiDipendente();


//        vendite

        Dipendente alessia = new Dipendente("Bh-228", 1100, 1200, 7, Livello.IMPIEGATO, Dipartimento.VENDITE);
        alessia.stampaDatiDipendente();
        alessia.promuovi();


        Dipendente[] dipendenti = {francesco, alex, andrea, alessia};


        System.out.println("Paga totale dovuta ai dipendenti: " + GestioneDipendenti.getAllStipendi(dipendenti));


    }
}
