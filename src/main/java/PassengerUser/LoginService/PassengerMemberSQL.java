package PassengerUser.LoginService;

import database.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PassengerMemberSQL {

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public void jdbcConnection() {
        con = DBConn.makeConnection();
    }


}
