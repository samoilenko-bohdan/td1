package news;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class MesNews {
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {
        System.out.println("Premiere jour");
        System.out.println("Choisissez un element de menu");
        action();
    }

    public static void creer() {
        BaseDeNews.initialise();
        System.out.println("Creer");
    }

    public static void ouvrir() {
        System.out.println("Ouvrir");
    }

    public static void sauvegarder() {
        System.out.println("Savegarder");
    }

    public static void afficher() {
        TreeSet<News> base = BaseDeNews.getNewsSet();
        Iterator<News> iterator = base.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void inserer() {
        System.out.println("Inserer");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez les informations necessaires pour les nouvelles");
        System.out.println("Titre: ");
        String titre = sc.nextLine();
        System.out.println("La date: ");
        String reponse = sc.nextLine();
        LocalDate date = LocalDate.parse(reponse, FORMAT);
        System.out.println("L'auteur: ");
        String auteur = sc.nextLine();
        System.out.println("Source: ");
        String temp = sc.nextLine();
        URL source = null;
        try {
            source = new URL(temp);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        News news = new News(titre, date, auteur, source);
        news.afficher();
        BaseDeNews.ajoute(news);
    }

    public static void supprimer() {
        System.out.println("Supprimer");
    }

    public static void rechercher() {
        System.out.println("Rechercher");
    }

    public static void quitter() {
        System.out.println("Quitter");
    }

    public static void action() {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    creer();
                    break;
                case 2:
                    ouvrir();
                    break;
                case 3:
                    sauvegarder();
                    break;
                case 4:
                    afficher();
                    break;
                case 5:
                    inserer();
                    break;
                case 6:
                    supprimer();
                    break;
                case 7:
                    rechercher();
                    break;
                case 8:
                    quitter();
                    break;
                default:
                    System.out.print("Choisissez un numero entre 1 et 7");
            }
        }
        while (choice != 8);
    }
}