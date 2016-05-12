package Challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;



public class Challenge {
	protected static java.sql.Connection con;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println(connect("127.0.0.1", "3306", "root", ""));
			System.out.println(dbAnlegen());
			System.out.println(TabellenAnlegen());
			System.out.println(datenEingeben());
			System.out.println(spielplan());
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

	public static String datenEingeben()  {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("spiele_test.txt"));
			
			Statement stmt = con.createStatement();
			
			String readedLine = "";
			String sql = "INSERT INTO spiele (spielbezeichnung, spielort, datumuhrzeit, heimmannschaft, gastmannschaft) \n"
					+ "VALUES \n";
			
			while((readedLine = rd.readLine()) != null) {
				String[] str = readedLine.replaceAll("endOfLine", "").split(";");
				str = Arrays.copyOfRange(str, 1, str.length);
				
				sql += "('";
				sql += String.join("','", str);
				sql += "')\n,";
			}
			sql = sql.substring(0, sql.length()-1);
			
			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			return e.getMessage();
		}
		return "";
	}
	
	public static String spielplan() {
		ResultSet rs;
		try {
			Statement stmt = con.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM spiele ORDER BY datumuhrzeit");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "Konnte die Spiele nicht auslesen";
		}
		
		try {
			System.out.println(new String(new char[130]).replace("\0", "="));
			System.out.println("Gruppe\t\tDatum\t\tAnstoss\t\tHeimmannschaft\t\t-\t\tGastmannschaft\t\tSpielort");
			System.out.println(new String(new char[130]).replace("\0", "="));

			SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY");
			
			while(rs.next()) {
				System.out.print(rs.getString("spielbezeichnung") + "\t");
				System.out.print(dateFormat.format(rs.getDate("datumuhrzeit")) + "\t");
				System.out.print(timeFormat.format(rs.getTime("datumuhrzeit")) + "\t\t");
				System.out.print(rs.getString("heimmannschaft") + space(rs.getString("heimmannschaft").length(),24) + "-");
				System.out.print(space(rs.getString("gastmannschaft").length(), 29 ) + rs.getString("gastmannschaft") + space(0, 10));
				System.out.print(rs.getString("spielort") + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Spielplan erfolgreich ausgegeben";
	}
	
	protected static String space(int length, int size) {
		if (size - length < 0) return "";
		return new String(new char[size - length]).replace("\0", " ");
	}
}