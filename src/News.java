package news;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class News implements Comparable<News> {

    private String titre;
    private LocalDate date;
    private String auteur;
    private URL source;

    @Override
    public int compareTo(News o) {
        return this.titre.compareTo(o.titre);
    }

    public News(String titre, LocalDate date, String auteur, URL source) {
        this.titre = titre;
        this.date = date;
        this.auteur = auteur;
        this.source = source;
    }

    public News() {}

    //methods of class
    public void afficher() {
        System.out.println("Titre : " + titre + " le " + date
                + " auteur : " + auteur + " source : " + source);
    }

    @Override
    public String toString() {
        return "Titre :" + titre + " le " + date
                + " auteur : " + auteur + " source : " + source;
    }

    // Method pour entrer les infos
//    public void saisir() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entrez les informations necessaires pour les nouvelles");
//        System.out.println("Titre: ");
//        titre = sc.nextLine();
//        System.out.println("La date: ");
//        String reponse = sc.nextLine();
//        date = LocalDate.parse(reponse, FORMAT);
//        System.out.println("L'auteur: ");
//        auteur = sc.nextLine();
//        System.out.println("Source: ");
//        String temp = sc.nextLine();
//        try {
//            source = new URL(temp);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }

    //Setter and getters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public URL getSource() {
        return source;
    }

    public void setSource(URL source) {
        this.source = source;
    }
}