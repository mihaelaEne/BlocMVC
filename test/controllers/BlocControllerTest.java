package controllers;

import model.Bloc;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

class BlocControllerTest {
    @Test
    public void testFindByAdmin() {
        ArrayList<Bloc> blocuri = new ArrayList();
        Bloc b1 = new Bloc(01,"adresa1", "admin1",1,10);
        blocuri.add(b1);
        Bloc b2 = new Bloc(02,"adresa2", "admin2",2,20);
        blocuri.add(b2);
        Bloc b3 = new Bloc(03,"adresa3", "admin3",3,30);
        blocuri.add(b3);
        Bloc b4 = new Bloc(04,"adresa4", "admin4",4,40);
        blocuri.add(b4);

        BlocController blocController = new BlocController(blocuri);
        assertEquals("admin1", blocController.findBlocByAdmin("admin1").getAdministrator());
    }

    @Test
    public void testFindById() {
        ArrayList<Bloc> blocuri = new ArrayList();
        Bloc b1 = new Bloc(01,"adresa1", "admin1",1,10);
        blocuri.add(b1);
        Bloc b2 = new Bloc(02,"adresa2", "admin2",2,20);
        blocuri.add(b2);
        Bloc b3 = new Bloc(03,"adresa3", "admin3",3,30);
        blocuri.add(b3);
        Bloc b4 = new Bloc(04,"adresa4", "admin4",4,40);
        blocuri.add(b4);

        BlocController blocController = new BlocController(blocuri);
        assertEquals("admin1", blocController.findBlocByID(01).getAdministrator());
    }
    @Test
    public void testUpdate() {
        ArrayList<Bloc> blocuri = new ArrayList();
        Bloc b1 = new Bloc(01,"adresa1", "admin1",1,10);
        blocuri.add(b1);
        Bloc b2 = new Bloc(02,"adresa2", "admin2",2,20);
        blocuri.add(b2);
        Bloc b3 = new Bloc(03,"adresa3", "admin3",3,30);
        blocuri.add(b3);
        Bloc b4 = new Bloc(04,"adresa4", "admin4",4,40);
        blocuri.add(b4);

        BlocController blocController = new BlocController(blocuri);
        Bloc bnou = new Bloc(01,"adresaNoua", "admin1", 100, 200);

        blocController.update(bnou);


        assertEquals("adresaNoua", blocController.findBlocByAdmin("admin1").getAdresa());
    }




    @Test
    public void testAdd(){
        ArrayList<Bloc> blocuri = new ArrayList();
        Bloc b1 = new Bloc(01,"adresa1", "admin1",1,10);
        blocuri.add(b1);
        Bloc b2 = new Bloc(02,"adresa2", "admin2",2,20);
        blocuri.add(b2);
        Bloc b3 = new Bloc(03,"adresa3", "admin3",3,30);
        blocuri.add(b3);
        Bloc b4 = new Bloc(04,"adresa4", "admin4",4,40);

        BlocController blocController = new BlocController(blocuri);

        blocController.addBloc(b4);
        assertNotNull(blocController.findBlocByAdmin("admin4"));
    }


    @Test
    public void testRemove(){
        ArrayList<Bloc> blocuri = new ArrayList();
        Bloc b1 = new Bloc(01,"adresa1", "admin1",1,10);
        blocuri.add(b1);
        Bloc b2 = new Bloc(02,"adresa2", "admin2",2,20);
        blocuri.add(b2);
        Bloc b3 = new Bloc(03,"adresa3", "admin3",3,30);
        blocuri.add(b3);
        Bloc b4 = new Bloc(04,"adresa4", "admin4",4,40);
        blocuri.add(b4);

        BlocController blocController = new BlocController(blocuri);

        blocController.removeBloc(b4);
        assertEquals(null, blocController.findBlocByAdmin("admin4"));
    }

}