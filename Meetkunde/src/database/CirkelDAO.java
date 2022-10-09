package database;

import model.Cirkel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CirkelDAO extends AbstractDAO {


    public CirkelDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaCirkelOp(Cirkel cirkel) {
        int primaryKey = slaFiguurOp(cirkel.getKleur());
        String sql = "INSERT INTO cirkel VALUES(?, ?, ?, ?);";
        try {
            setupPreparedStatement(sql);
            preparedStatement.setInt(1, primaryKey);
            preparedStatement.setDouble(2, cirkel.getStraal());
            preparedStatement.setDouble(3,
                    cirkel.getMiddelpunt().getxCoordinaat());
            preparedStatement.setDouble(4,
                    cirkel.getMiddelpunt().getyCoordinaat());
            executeManipulateStatement();
        } catch (SQLException sqlFout) {
            System.out.println(sqlFout);
        }
//        String sql = "INSERT INTO figuur(kleur) VALUE(?);";
//        int primarykey = 0;
//        try {
//            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            preparedStatement.setString(1, cirkel.getKleur());
//            preparedStatement.executeUpdate();
//            ResultSet resultSet = preparedStatement.getGeneratedKeys();
//            while (resultSet.next()) {
//                primarykey = resultSet.getInt(1);
//                System.out.printf("De toegevoegde sleutel is %d\n", primarykey);
//            }
//        } catch (SQLException sqlFout) {
//            System.out.println(sqlFout);
//        }
//        String sql2 = "INSERT INTO cirkel VALUES (?,?,?,?);";
//        try {
//            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql2); // connectie maken
//            preparedStatement.setInt(1, primarykey); // locaties toekennen in de tabel
//            preparedStatement.setDouble(2, cirkel.getStraal());
//            preparedStatement.setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
//            preparedStatement.setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());
//            preparedStatement.executeUpdate();// alles uitvoeren
//        } catch (SQLException sqlFout) {
//            System.out.println(sqlFout);
//        }
    }
    private int slaFiguurOp(String kleur){
        String sql = "INSERT INTO figuur (kleur) VALUES (?);";
        int primarykey = 0;
        try{
            setupPreparedStatementWithKey(sql);
            preparedStatement.setString(1,kleur);
            primarykey = executeInsertStatementWithKey();
        }catch (SQLException sqlFout){
            System.out.println(sqlFout);
        }return primarykey;
    }
}
