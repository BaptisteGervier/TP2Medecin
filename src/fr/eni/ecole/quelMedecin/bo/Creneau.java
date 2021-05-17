package fr.eni.ecole.quelMedecin.bo;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Creneau {
    private Medecin medecin;
    private LocalTime heureDebut;
    private int duree;

    public Creneau(LocalTime heureDebut, int duree, Medecin medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;
        this.medecin.ajouterCreneau(this);
    }

    public void afficher(){
        System.out.printf("%s - %s (%d minutes)%n",
                this.heureDebut,
                this.heureDebut.plusMinutes(this.duree),
                this.duree
                );
    }

    public Medecin getMedecin() {
        return medecin;
    }
}
