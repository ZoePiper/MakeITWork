//package database;
//
//import model.Session;
//
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class SessionDAO {
//    private DBaccess dBaccess;
//
//    public SessionDAO(DBaccess dBaccess) {
//        this.dBaccess = dBaccess;
//    }
//
//    public void slaSessionOp(Session session) { //willekeurige items opslaan
//        String sql = "INSERT INTO Session VALUES (?,?,?,?,?,?) ;";
//        try {
//            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
//            preparedStatement.setInt(1, session.getId());
//            preparedStatement.setDate(2, Date.valueOf(session.getDatum()));
//            preparedStatement.setDouble(3, Session.getDuur());
//            preparedStatement.setBoolean(4, session.isOpgenomen());
//            preparedStatement.setDouble(5, session.getKosten);
//            preparedStatement.setString(6,session.getOrganisator().getNaamMuzikant());
//            preparedStatement.executeUpdate();
//        } catch (SQLException sqlFout) {
//            System.out.println("SQL fout " + sqlFout.getMessage());
//        }
//    }
//}

