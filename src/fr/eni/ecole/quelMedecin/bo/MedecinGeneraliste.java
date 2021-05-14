package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

/**
 * classe qui represente un medecin generaliste
 * @date 12/05/2021
 * @version 1.0
 * @author Baptiste Gervier
 * */
public class MedecinGeneraliste {

    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresseMedecin;
    private Creneau[] creneaux = new Creneau[15];
    public static int tarif = 25;


    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresseMedecin) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresseMedecin = adresseMedecin;
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
        System.out.printf("%s %s%nTelephone : %s%nTarif : %d€%n",
            this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone, MedecinGeneraliste.tarif);
            this.adresseMedecin.afficher();
        for (int i = 0; i < this.creneaux.length; i++) {
            if (this.creneaux[i] != null){
                this.creneaux[i].afficher();
            }

        }
    }

        public void ajouterCreneau(Creneau creneauAajouter){
            //for (int i = 0; i < this.creneaux.length; i++) {//
            for (Creneau chaqueCase : this.creneaux){
                if (chaqueCase == null){
                    chaqueCase = creneauAajouter;
                    break;
                }
            }
        }
}
