package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Muzikant;

public class MuzikantDAO extends AbstractDAO{

	private DBaccess dBaccess;

	public MuzikantDAO(DBaccess dBaccess) {
		super(dBaccess);
	}

	public void slaOpMuzikant (Muzikant muzikant) { //willekeurige muzikanten opslaan
		String sql = "INSERT INTO Muzikant VALUES (?,?,?);";
		try {
			PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, muzikant.getNaamMuzikant());
			preparedStatement.setInt(2, muzikant.getJaarErvaring());
			preparedStatement.setString(3, muzikant.getInstrument());
			preparedStatement.executeUpdate();
		} catch (SQLException sqlFout) {
			System.out.println("SQL fout " + sqlFout.getMessage());
		}
	}
	public  ArrayList<Muzikant> getMuzikanten() {
		ArrayList<Muzikant> resultaatLijst = new ArrayList<>();
		String sql = "SELECT * FROM Muzikant";
		Muzikant muzikant ;
		try {
			PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String naam = resultSet.getString("naam");
				String instrument = resultSet.getString("instrument");
				int jaarErvaring = resultSet.getInt("jaarErvaring");
				muzikant = new Muzikant(naam, instrument,jaarErvaring);
				resultaatLijst.add(muzikant);
			}
		}
		catch (SQLException sqlFout){
			System.out.println("SQL fout " + sqlFout.getMessage());
		}
		return resultaatLijst;
	}
	
//	public Klant getKlantById(int klantnummer) {
//		String sql = "SELECT * FROM Klant WHERE klantnr = ?";
//		Klant result = null;
//		try {
//			PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
//			preparedStatement.setInt(1, klantnummer);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			if (resultSet.next()) {
//				String voorletters = resultSet.getString("voorletters");
//				String voorvoegsels = resultSet.getString("voorvoegsels");
//				String achternaam = resultSet.getString("achternaam");
//				String telefoon = resultSet.getString("telefoon");
//				result = new Klant(klantnummer, voorletters, voorvoegsels, achternaam,  telefoon);
//			} else {
//				System.out.println("Klant met dit klantnummer bestaat niet");
//			}
//		}
//		catch (SQLException sqlFout){
//			System.out.println("SQL fout " + sqlFout.getMessage());
//		}
//		return result;
//	}
 //array met gegevens

}
