package fr.eni.ecole.quelMedecin.bo;

import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient extends Personne{

    private char sexe;
    private long numSecu;
    private LocalDate dateDeNaissance;
    private String commentaires;

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public void setNumSecu(long numSecu) {
        this.numSecu = numSecu;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Patient(String nom, String prenom, String numeroDeTelephone, Adresse adresse, char sexe, long numSecu, LocalDate dateDeNaissance, String commentaires) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.sexe = sexe;
        this.numSecu = numSecu;
        this.dateDeNaissance = dateDeNaissance;
        this.commentaires = commentaires;
    }

    public void afficher() {
        super.afficher();
        System.out.printf("Sexe : %s%nSécurité sociale : %d%n" +
                        "Date de naissance : %s%nCommentaires : %s%n" +
                        "Adresse : %n",
                this.sexe == 'F' ? "Féminin" : "Masculin",
                this.numSecu,
                this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                this.commentaires == null ? "[Aucun commentaires]" : this.commentaires);
        this.adresse.afficher();
    }
}

