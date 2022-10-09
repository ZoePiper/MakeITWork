package database;

import model.GeslotenSession;
import model.Muzikant;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GeslotenSessionDAO extends AbstractDAO {
    private DBaccess dBaccess;

    public GeslotenSessionDAO(DBaccess dBaccess, DBaccess dBaccess1) {
        super(dBaccess);
        this.dBaccess = dBaccess1;
    }

    public void slaGeslotenSessionOp (GeslotenSession geslotenSession) { //willekeurige muzikanten opslaan
        String sql = "INSERT INTO Session VALUES (?,?,?,?,?,?) ;";
        try {
            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, geslotenSession.getId());
            preparedStatement.setDate(2, Date.valueOf(geslotenSession.getDatum()));
            preparedStatement.setDouble(3,  geslotenSession.getDuur());
            preparedStatement.setBoolean(4, geslotenSession.isOpgenomen());
            preparedStatement.setDouble(5, geslotenSession.getKosten());
            preparedStatement.setString(6,geslotenSession.getOrganisator().getNaamMuzikant());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlFout) {
            System.out.println("SQL fout " + sqlFout.getMessage());
        }
    }
}
