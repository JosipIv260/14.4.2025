import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kreiranje ArrayListe koja može sadržavati objekte klase Polaznik
        ArrayList<Polaznik> listaPolaznika = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        // Dodavanje polaznika u listu
        listaPolaznika.add(new Polaznik("Ana","Babic","Babic@gmail.com"));

        System.out.println("Upisi DA ako zelis unjet novog polaznika");
       String a1=sc.nextLine().toLowerCase().trim();
        if(a1.equals("da")) {
            String odgovor;
            do {
                System.out.println("Upisi ime");
                String ime=sc.nextLine();
                System.out.println("Upisi Prezime");
                String Prezime=sc.nextLine();
                System.out.println("Upisi E-mail");
                String Email=sc.nextLine().toLowerCase().trim();
                listaPolaznika.add(new Polaznik(ime,Prezime,Email));

                // Pitamo korisnika želi li nastaviti
                System.out.print("Želiš li nastaviti? (da/ne): ");
                odgovor = sc.nextLine().trim().toLowerCase();

            } while (!odgovor.equals("ne"));
        }
        for (Polaznik polaznik : listaPolaznika) {
            System.out.println("Polaznik: " +polaznik.UcitajPolaznik() );
        }
        System.out.println("Nađi polaznika preko meila da/ne");
        String Nađi=sc.nextLine().toLowerCase().trim();
        if (Nađi.equals("da")){
            System.out.println("Upisi trazeni meil");
         String  meil= sc.nextLine().toLowerCase().trim();
         int Brojac=0;
         for (Polaznik Meilovi:listaPolaznika){
             Brojac++;
            if (Meilovi.getEmail().equals(meil)){
               System.out.println( "meil "+meil+" postoji");
               System.out.println("Ime polaznika je "+Meilovi.getIme()+" prezime je "+Meilovi.getPrezime());
            }else{
                if (Brojac==(listaPolaznika.size())){
                    System.out.println("Meil "+meil+" nije nađen");
                }
            }
         }
        }
    }
}