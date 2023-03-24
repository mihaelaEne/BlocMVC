package controllers;

import model.Bloc;

import java.util.ArrayList;

public class BlocController {

    private ArrayList<Bloc> blocuri;

    public BlocController(){

        this.blocuri= new ArrayList<>();

        this.load();
    }

    public void load(){
        Bloc b1=new Bloc("Panselelor 12", " Popescu", 8, 100);
        Bloc b2=new Bloc("Martisor 15", " Maria", 4, 20);
        Bloc b3=new Bloc("Vacaresti 5", " Ioana", 12, 25);

        blocuri.add(b1);
        blocuri.add(b2);
        blocuri.add(b2);


    }

    public void afisareBloc(){
        for(int i=0; i<blocuri.size(); i++){
            System.out.println(this.blocuri.get(i).descriereBloc());
            System.out.println("\n");
        }
    }


    public void addBloc(Bloc bloc){
        this.blocuri.add(bloc);
    }

    public void removeBloc(Bloc bloc){
        this.blocuri.remove(bloc);
    }



    public Bloc findBlocByAdmin(String nume){
        for(int i=0; i<this.blocuri.size(); i++){
            if(blocuri.get(i).getAdministrator().equals(nume)){
                if(blocuri.get(i).getAdministrator().equals(nume)){
                    return blocuri.get(i);
                }
            }
        }
        return null;
    }

    public void update(Bloc bloc){
        Bloc deUpdatat=findBlocByAdmin(bloc.getAdministrator());

        if(bloc.getAdministrator()!=null){
            deUpdatat.setAdministrator(bloc.getAdministrator());
        }
        if(bloc.getNrLocuitori()!=0){
            deUpdatat.setNrLocuitori(bloc.getNrLocuitori());
        }
    }



}
