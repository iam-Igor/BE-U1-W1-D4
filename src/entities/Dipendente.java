package entities;

public class Dipendente {

    static double stipendioBase = 1000;
    private double importoOrarioStraord;
    private double stipendio;
    private String matricola;
    private Livello livello;

    private Dipartimento dipartimento;


//    constructors

    public Dipendente(String matricola, Dipartimento dipartim) {
        this.matricola = matricola;
        this.dipartimento = dipartim;
        this.stipendio = stipendioBase;
        this.importoOrarioStraord = 30;
        this.livello = Livello.OPERAIO;
    }


    public Dipendente(String matric, double stipBase, double stip, double impOrar, Livello liv, Dipartimento dipart) {
        this.matricola = matric;
        stipendioBase = stipBase;
        this.stipendio = stip;
        this.importoOrarioStraord = impOrar;
        this.livello = liv;
        this.dipartimento = dipart;

    }

    public static double calcolaPagaConStraord(Dipendente user, int hours) {
        return (stipendio + (hours * importoOrarioStraord));
    }

    public double setImportoOrario(double importo) {

        return importoOrarioStraord = importo;

    }

//    calcola stipendio

    public double calcolaPagaMensile(Dipendente user) {
        return stipendio;
    }

    //    getter and setter
    public double getImportoOrarioStraord() {
        return importoOrarioStraord;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Livello getLivello() {
        return livello;
    }


//    setter

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public Dipartimento setDipartimento(Dipartimento dipartim) {
        return dipartimento = dipartim;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Livello: " + livello);
        System.out.println("Stipendio base: " + stipendioBase);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo orario straordinario: " + importoOrarioStraord);
        System.out.println("Dipartimento: " + dipartimento);
    }

    public Livello promuovi() {
        System.out.println("Matricola" + matricola);
        if (livello == Livello.OPERAIO) {
            System.out.println("Promosso a livello impiegato");
            System.out.println("Stipendio:" + stipendioBase * 1.2);
            return livello = Livello.IMPIEGATO;
        } else if (livello == Livello.IMPIEGATO) {
            System.out.println("Promosso a livello quadro");
            System.out.println("Stipendio:" + stipendioBase * 1.5);
            return livello = Livello.QUADRO;
        } else if (livello == Livello.QUADRO) {
            System.out.println("Promosso a livello dirigente");
            System.out.println("Stipendio:" + stipendioBase * 2);
            return livello = Livello.DIRIGENTE;
        } else if (livello == Livello.DIRIGENTE) {
            System.out.println("Errore, nessuna promozione disponibile per te!");
            return livello = Livello.DIRIGENTE;
        }
        return livello;

    }
}
