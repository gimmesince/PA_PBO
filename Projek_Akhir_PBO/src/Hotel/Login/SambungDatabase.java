
package Hotel.Login;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SambungDatabase {

    private Connection koneksi;
    private Statement stmt;
    private String KodeSQL;
    private final String JDBC = "jdbc:mysql://localhost/fltr_hotel";
    private final String USERS = "root";
    private final String PASSWORD = "";


    public Statement STATMENT() throws SQLException {
        koneksi = DriverManager.getConnection(getJDBC(),getUSERS(),getPASSWORD());
        stmt = koneksi.createStatement();
        return stmt;
    }





    public String getJDBC() {
        return JDBC;
    }

    public String getUSERS() {
        return USERS;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }



    public Connection getKoneksi() {
        return koneksi;
    }

    public void setKoneksi(Connection koneksi) {
        this.koneksi = koneksi;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public String getKodeSQL() {
        return KodeSQL;
    }

    public void setKodeSQL(String KodeSQL) {
        this.KodeSQL = KodeSQL;
    }
}
