import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> sviStudenti = new ArrayList<>(); // Lista za sve studente
        List<Student> studentiKojiSuPolozili = new ArrayList<>(); // Lista za studente koji su položili ispit

        while (true) {
            System.out.println("Unesite ime studenta (ili 'quit' za prekid):");
            String ime = scanner.nextLine();
            if (ime.equalsIgnoreCase("quit")) break;

            System.out.println("Unesite prezime studenta (ili 'quit' za prekid):");
            String prezime = scanner.nextLine();
            if (prezime.equalsIgnoreCase("quit")) break;

            System.out.println("Unesite ocenu studenta (5, 6, 7, 9) (ili 'quit' za prekid):");
            String ocenaInput = scanner.nextLine();
            if (ocenaInput.equalsIgnoreCase("quit")) break;

            int ocena;
            try {
                ocena = Integer.parseInt(ocenaInput);
                if (ocena != 5 && ocena != 6 && ocena != 7 && ocena != 9) {
                    System.out.println("Uneli ste nevažeću ocenu. Dozvoljene ocene su 5, 6, 7, 9.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Neispravan unos. Molimo unesite brojnu ocenu.");
                continue;
            }

            // Kreiraj studenta i dodaj ga u listu svih studenata
            Student student = new Student(ime, prezime, ocena);
            sviStudenti.add(student);

            // Ako student ima ocenu veću od 5, dodaj ga u listu položenih studenata
            if (ocena > 5) {
                studentiKojiSuPolozili.add(student);
            }
        }

        // Ispis svih studenata
        System.out.println("\nUneti studenti:");
        for (Student student : sviStudenti) {
            System.out.println(student);
        }

        // Ispis studenata koji su položili
        System.out.println("\nStudenti koji su položili:");
        for (Student student : studentiKojiSuPolozili) {
            System.out.println(student);
        }

        scanner.close();
    }

    }
