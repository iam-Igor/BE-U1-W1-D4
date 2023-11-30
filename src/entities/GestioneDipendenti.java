package entities;

public class GestioneDipendenti {


    public static double getAllStipendi(Dipendente[] user) {

        double pagaTotale = 0;

        for (int i = 0; i < user.length; i++) {
            double pagaConStraord = Dipendente.calcolaPagaConStraord(user[i], 5);
            pagaTotale += pagaConStraord;
        }
        return pagaTotale;
    }

}
