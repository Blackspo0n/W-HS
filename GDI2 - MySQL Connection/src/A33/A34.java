package A33;

import java.sql.*;


public class A34 {
	protected static java.sql.Connection con;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println(connect("127.0.0.1", "3306", "root", ""));
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
}