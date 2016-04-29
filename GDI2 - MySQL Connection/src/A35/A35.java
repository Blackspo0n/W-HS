package A35;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;


public class A35 {
	protected static java.sql.Connection con;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println(connect("127.0.0.1", "3306", "root", ""));
			System.out.println(dbAnlegen());
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
	
}