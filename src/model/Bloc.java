package model;

public class Bloc {
    private String adresa;
   private  String administrator;
   private  int nrEtaje;
   private  int nrLocuitori;


    public Bloc(){}
    public Bloc(String adresa, String administrator, int nrEtaje, int nrLocuitori){
        this.adresa=adresa;
        this.administrator=administrator;
        this.nrEtaje=nrEtaje;
        this.nrLocuitori=nrLocuitori;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public int getNrEtaje() {
        return nrEtaje;
    }

    public void setNrEtaje(int nrEtaje) {
        this.nrEtaje = nrEtaje;
    }

    public int getNrLocuitori() {
        return nrLocuitori;
    }

    public void setNrLocuitori(int nrLocuitori) {
        this.nrLocuitori = nrLocuitori;
    }


    public String descriereBloc(){
        String text="";
        text+="Adresa blocului este "+ this.adresa+"\n";
        text+="Administratorul este : "+this.administrator+"\n";
        text+="Nr de etaje este de: "+ this.nrEtaje+"\n";
        text+="Nr de locatari activi este de: "+ this.nrLocuitori+"\n";
        return text;
    }




}
