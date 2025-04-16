
public class Polaznik {
   private String Ime;
    private String Prezime;
    private String Email;

    public Polaznik(String ime,String prezime,String emailmail) {
        this.Email=emailmail;
        this.Ime = ime;
        this.Prezime=prezime;
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
    public  String UcitajPolaznik (){
      return Ime+" "+Prezime+" "+Email;
    }
}
