package view;

import controllers.BlocController;
import model.Bloc;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewBloc {

    private BlocController blocController;
    private Scanner scanner;


    public ViewBloc() {
        blocController=new BlocController();
        scanner = new Scanner(System.in);
        play();
    }

    public void meniu() {
        System.out.println("Apasa 1 pt a afisa toate blocurile");
        System.out.println("Apasa 2 pt a adauga un bloc");
        System.out.println("Apasa 3 pt a sterge un bloc");
        System.out.println("Apasa 4 pt a modifica un bloc");


    }


    public void play() {
        blocController.load();
        int alegere = 0;
        boolean running = true;
        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {

                case 1:
                    blocController.afisareBloc();
                    break;
                case 2:
                    adaugareBloc();
                    break;
                case 3:
                    stergereBloc();
                    break;
                case 4:
                    updateBloc();
                default:
                    System.out.println("Alegere gresita");
                    break;

            }
        }
    }

    private void adaugareBloc() {
        System.out.println("Introduceti id-ul:");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti adresa blocului:");
        String adresa = scanner.nextLine();
        System.out.println("Introduceti numele administratorului:");
        String admin = scanner.nextLine();
        System.out.println("Introduceti nr de etaje:");
        int nrEtaje = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti nr de locatari activi: ");
        int nrLocuitori = Integer.parseInt(scanner.nextLine());

        Bloc bloc = blocController.findBlocByAdmin(admin);
        if (bloc == null) {
            Bloc bNou = new Bloc(id,adresa,admin,nrEtaje,nrLocuitori );
            blocController.addBloc(bNou);
        } else {
            System.out.println("Blocul exista deja");
        }
    }

    private void stergereBloc() {
        System.out.println("Introduceti numele administratorului");
        String admin = scanner.nextLine();

        Bloc bloc = blocController.findBlocByAdmin(admin);
        if (bloc == null) {
            System.out.println("Nu exista un bloc cu acest admin");
        } else {
            blocController.removeBloc(bloc);
            System.out.println("Blocul a fost sters");
        }

    }

    private void updateBloc() {
        System.out.println("Introduceti numele adminului");
        String admin = scanner.nextLine();

        Bloc bloc = blocController.findBlocByAdmin(admin);

        if (bloc == null) {
            System.out.println("Nu exista un bloc cu acest admin");
        } else {
            System.out.println("Introdu cu virgula ce doresti sa modifici:admin,adresa,nrEtaje,nrLocuitori");

            String[] upd = scanner.nextLine().split(",");

            Bloc nou = new Bloc();

            nou.setAdministrator(bloc.getAdministrator());

            for (int i = 0; i < upd.length; i++) {
                switch (upd[i]) {
                    case "admin":
                        System.out.println("Introduceti noul admin:");
                        String administrator=scanner.nextLine();
                        break;
                    case "adresa":
                        System.out.println("Intr noua adresa");
                        String adresa= scanner.nextLine();
                        break;

                    case "nrEtaje":
                        System.out.println("intr noul nr de etaje");
                        int nrEtaje=Integer.parseInt(scanner.nextLine());
                        break;
                    case "nrLocuitori":
                        System.out.println("Intr noul nr de etaje ");
                        int nrLocuitori=Integer.parseInt(scanner.nextLine());
                        break;
                    default:
                        System.out.println("Alegere gresita");

                }
            }
            blocController.update(nou);
        }

    }

}
