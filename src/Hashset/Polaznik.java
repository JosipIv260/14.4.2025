package Hashset;
import java.util.Objects;

public class Polaznik {
    private String Ime;
    private String Prezime;
    private String Email;

    public Polaznik(String ime, String prezime, String emailmail) {
        this.Email = emailmail;
        this.Ime = ime;
        this.Prezime = prezime;
    }

    public String getIme() {
        return Ime;
    }

    public String getPrezime() {
        return Prezime;
    }

    public String getEmail() {
        return Email;
    }

    public String UcitajPolaznik() {
        return Ime + " " + Prezime + " " + Email;
    }

    public boolean equals(Object o) {
        if (this == o) return true;                     // ako su isti objekt
        if (!(o instanceof Polaznik)) return false;        // ako nije tip Osoba, nije isto
        Polaznik polaznik = (Polaznik) o;                        // pretvori u Osoba objekt
        return Email.equals(polaznik.Email);
    }
    public  int hashCode(){
        return  Email.hashCode();
    }
}


