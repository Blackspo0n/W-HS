package A36;

import java.sql.*;


public class A36 {
	protected static java.sql.Connection con;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println(connect("127.0.0.1", "3306", "root", ""));
			System.out.println(dbAnlegen());
			System.out.println(TabellenAnlegen());
		}
		catch(ClassNotFoundException err) {
			System.err.println("Treiber konnten nicht geladen werden.");
			
		}

	}
	public static String connect(String ipAdresse, String port, String benutzerName, String passwort) {
		System.out.println("Connecting to database...");
		try {
			con = DriverManager.getConnection("jdbc:mysql://" + ipAdresse + ":" + port + "/", benutzerName, passwort);
			return "Verbindung erfolgreich";
		}
		catch(Exception err) {
			System.out.println("Cannot connect to " + ipAdresse + " with user" + benutzerName);
			return err.getMessage();
		}
	}
	
	public static String dbAnlegen() {
		Statement stmt;
		boolean recreate = false;
		
		try {
			stmt = con.createStatement();
			stmt.execute("DROP DATABASE EM2016");
			recreate = true;
		}
		catch(SQLException err) {
		}
		
		try {
			stmt = con.createStatement();
			stmt.execute("CREATE DATABASE EM2016");
			
			stmt.execute("use EM2016");
			
			return "Datenbank wurde angelegt" + (recreate == true ? ", und Datenbank wurde neu angelegt." : "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
	
	public static String TabellenAnlegen() {
		Statement stmt;
		boolean recreate = false;
		
		try {
			stmt = con.createStatement();
			stmt.execute("DROP TABLE spiele");
			recreate = true;
		}
		catch(SQLException err) {
		}
		
		try {
			System.out.println("CREATE TABLE spiele (\n"
					+ "`spieleid` INT(10) NOT NULL AUTO_INCREMENT,\n"
					+ "`spielbezeichnung` VARCHAR(20) NULL DEFAULT NULL,\n"
					+ "`spielort` VARCHAR(20) NULL DEFAULT NULL, \n"
					+ "`datumuhrzeit` DATETIME NULL DEFAULT NULL, \n"
					+ "`heimmannschaft` VARCHAR(20) NULL DEFAULT NULL, \n"
					+ "`gastmannschaft` VARCHAR(20) NULL DEFAULT NULL\n "
					+ ");");
			stmt = con.createStatement();
			stmt.execute("CREATE TABLE spiele (\n"
					+ "`spieleid` INT(10) NOT NULL AUTO_INCREMENT,\n"
					+ "`spielbezeichnung` VARCHAR(20) NULL DEFAULT NULL,\n"
					+ "`spielort` VARCHAR(20) NULL DEFAULT NULL, \n"
					+ "`datumuhrzeit` DATETIME NULL DEFAULT NULL, \n"
					+ "`heimmannschaft` VARCHAR(20) NULL DEFAULT NULL, \n"
					+ "`gastmannschaft` VARCHAR(20) NULL DEFAULT NULL, \n"
					+ " PRIMARY KEY (spieleid)\n "
					+ ");");
			
			return "Tabelle spiele wurde angelegt" + (recreate == true ? " und voher gelöscht." : "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
}