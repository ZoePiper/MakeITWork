package controller;

import com.sun.source.tree.TryTree;
import database.CirkelDAO;
import database.DBaccess;
import database.PuntDAO;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
//import model.Rechthoek;


public class MeetkundeLauncher {


    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("figuren", "userFiguren",
                "userFigurenPW");
        dBaccess.openConnection();

        PuntDAO puntDAO = new PuntDAO(dBaccess);
        puntDAO.slaPuntOp(new Punt(8, -12));
        ArrayList<Punt> puntenInDeDatabase = puntDAO.getPunten();
        for (Punt punt : puntenInDeDatabase) {
            System.out.println(punt);
        }
        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);
        cirkelDAO.slaCirkelOp(new Cirkel("paars", 6.5, new Punt(-2.3,-1.3)));
        dBaccess.closeConnection();

//        DBaccess dBaccess = new DBaccess("figuren", "userFiguren", "userFigurenPW");
//        dBaccess.openConnection();
//        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess); // niewu object met een connectie naar database
//        cirkelDAO.slaCirkelOp(new Cirkel("oranje",5,new Punt(3,7)));
//        dBaccess.closeConnection();


//        PuntDAO puntDAO = new PuntDAO(dBaccess);
//        puntDAO.slaPuntOp(new Punt(-4, -2));
//        ArrayList<Punt> puntenInDatabase = puntDAO.getPunten();
//        for (Punt punt : puntenInDatabase) {
//            System.out.println(punt);
//        }
//        dBaccess.closeConnection();


    }

}

