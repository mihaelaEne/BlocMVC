package model;

public class Bloc {
    private int id;
    private String adresa;
   private  String administrator;
   private  int nrEtaje;
   private  int nrLocuitori;


    public Bloc(){}
    public Bloc(int id,String adresa, String administrator, int nrEtaje, int nrLocuitori){
        this.id=id;
        this.adresa=adresa;
        this.administrator=administrator;
        this.nrEtaje=nrEtaje;
        this.nrLocuitori=nrLocuitori;


    }

    public Bloc(String prop){
        String [] split=prop.split(",");
        this.id=Integer.parseInt(split[0]);
        this.adresa=split[1];
        this.administrator=split[2];
        this.nrEtaje=Integer.parseInt(split[3]);
        this.nrLocuitori=Integer.parseInt(split[4]);

    }

    public int getId() {
        return id;
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
        text+="Id:"+this.id+"\n";
        text+="Adresa blocului este "+ this.adresa+"\n";
        text+="Administratorul este : "+this.administrator+"\n";
        text+="Nr de etaje este de: "+ this.nrEtaje+"\n";
        text+="Nr de locatari activi este de: "+ this.nrLocuitori+"\n";
        text+="Acestea sunt toate detaliile disponibile";
        return text;
    }




}
