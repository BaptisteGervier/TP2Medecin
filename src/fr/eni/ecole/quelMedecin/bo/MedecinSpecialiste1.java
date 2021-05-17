package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste1 extends Medecin {
    private String specialite;
    private int tarif;

    public MedecinSpecialiste1(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse, creneaux);
        this.specialite = specialite;
        this.tarif = tarif;
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.printf("Specialité : %s%nTarif : %d€%n",
                this.specialite, this.tarif);
        this.afficherAdresseEtCreneaux();
    }
}
