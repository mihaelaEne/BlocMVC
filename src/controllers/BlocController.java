package controllers;

import model.Bloc;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BlocController {

  private ArrayList<Bloc>blocuri=new ArrayList();


  public BlocController(){
      this.blocuri=new ArrayList<>();
      this.load();
  }

  public BlocController(ArrayList<Bloc>blocuri){
      this.blocuri=blocuri;
  }

    public void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\incapsularea\\Bloc\\src\\data\\bloc.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Bloc bloc = new Bloc(scanner.nextLine());
                this.blocuri.add(bloc);
            }
        }
            catch (Exception e){
            e.printStackTrace();
            }

    }

    public void afisareBloc() {
        for (int i = 0; i < blocuri.size(); i++) {
            System.out.println(this.blocuri.get(i).descriereBloc());
            System.out.println("\n");
        }
    }


    public void addBloc(Bloc bloc) {
        this.blocuri.add(bloc);
    }

    public void removeBloc(Bloc bloc) {
        this.blocuri.remove(bloc);
    }


    public Bloc findBlocByAdmin(String nume) {
        for (int i = 0; i < this.blocuri.size(); i++) {
            if (blocuri.get(i).getAdministrator().equals(nume)) {
                if (blocuri.get(i).getAdministrator().equals(nume)) {
                    return blocuri.get(i);
                }
            }
        }
        return null;
    }
    public Bloc findBlocByID(int id) {
        for (int i = 0; i < this.blocuri.size(); i++) {
            if (blocuri.get(i).getId()==id) {
                if (blocuri.get(i).getId()==id) {
                    return blocuri.get(i);
                }
            }
        }
        return null;
    }

    public void update(Bloc bloc) {
        Bloc deUpdatat = findBlocByID(bloc.getId());

        if (bloc.getAdministrator() != null) {
            deUpdatat.setAdministrator(bloc.getAdministrator());
        }
        if(bloc.getAdresa()!=null){
            deUpdatat.setAdresa(bloc.getAdresa());
        }
        if(bloc.getNrEtaje()!=0){
            deUpdatat.setNrEtaje(bloc.getNrEtaje());
        }
        if(bloc.getNrLocuitori()!=0){
            deUpdatat.setNrLocuitori(bloc.getNrLocuitori());
        }

    }


}
