package fr.eni.ecole.quelMedecin.bo;

public class Personne{
    protected String nom;
    protected String prenom;
    protected String numeroDeTelephone;
    protected Adresse adresse;


    public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }

    public void afficher(){
        System.out.printf("%s %s %nTéléphone : %s%n",
                this.nom.toUpperCase(),
                this.prenom,
                this.numeroDeTelephone);
    }
}
