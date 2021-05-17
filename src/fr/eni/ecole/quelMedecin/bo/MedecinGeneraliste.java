package fr.eni.ecole.quelMedecin.bo;

/**
 * classe qui represente un medecin generaliste
 * @date 12/05/2021
 * @version 1.0
 * @author Baptiste Gervier
 * */
public class MedecinGeneraliste extends Medecin {
    public static int tarif = 25;


    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux) {
        super(nom, prenom, numeroDeTelephone, adresse, creneaux);
    }

    public static int getTarif() {
        return tarif;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNom() {
        return nom;
    }

    /**
     * Affiche sous la forme :
     * NOM Prénom
     * Telephone : XXXXX
     * Tarif : XXX€
     * */

    public void afficher(){
        super.afficher();
        System.out.printf("Tarif : %d€%n", MedecinGeneraliste.tarif);
        this.afficherAdresseEtCreneaux();
    }


}
