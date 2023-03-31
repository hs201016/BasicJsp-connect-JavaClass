package DriverUser;

import database.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DriverMemberSQL {

    Connection con = null;

    PreparedStatement pstmt = null;

    ResultSet rs = null;

    public void JDBConnection() {
        con = DBConn.makeConnection();
    }
}
