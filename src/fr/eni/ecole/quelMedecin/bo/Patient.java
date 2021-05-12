package fr.eni.ecole.quelMedecin.bo;

import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private long numSecu;
    private LocalDate dateDeNaissance;
    private String commentaires;
    private Adresse adressePatient;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu, LocalDate dateDeNaissance, String commentaires, Adresse adressePatient) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numSecu = numSecu;
        this.dateDeNaissance = dateDeNaissance;
        this.commentaires = commentaires;
        this.adressePatient = adressePatient;
    }

    public void afficher(){

        System.out.printf("%s %s%nTéléphone : %s%nSexe : %s%n" +
                "Numéro de sécu : %d%nDate de naissance : %s%nCommentaires : %s%n",
                this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone,
                this.sexe == 'F' ? "Féminin" : "Masculin",
                this.numSecu,
                this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                this.commentaires == null ? "[Aucun comm]" : this.commentaires);
                this.adressePatient.afficher();
        /*if (this.commentaires == null){
           "[Aucun commentaire]";
        } else {
            this.commentaires;
        }*/
    }


}

