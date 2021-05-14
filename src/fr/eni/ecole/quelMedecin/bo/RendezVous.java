package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;

public class RendezVous {

    private Creneau creneau;
    private Patient patient;
    private LocalDate date;

    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }


    public void afficher(){
            System.out.printf("%s %s %s%n", this.creneau, this.patient, this.date);
    }




}
