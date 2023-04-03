package DriverUser.LoginService;

import DriverUser.Interface.DriverMemberService;

import java.sql.SQLException;
import java.util.Scanner;

public class DriverMemberServiceImpl extends DriverMemberSQL implements DriverMemberService {

    DriverLoginServiceImpl driverLoginService = new DriverLoginServiceImpl();
    @Override
    public void DriverMemberJoin(DriverMember driverMember) {

        JDBConnection(); // con 초기화
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String sql = "INSERT INTO Driverdatabase VALUES(?,?,?,?,?,?)";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, driverMember.getDriverId());
            pstmt.setString(2, driverMember.getDriverPw());
            pstmt.setString(3, driverMember.getDriverName());
            pstmt.setString(4, driverMember.getDriverGender());
            pstmt.setString(5, driverMember.getDriverPhoneNum());
            pstmt.setString(6, driverMember.getDriverPlace());

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result == 1) {
            System.out.println("회원가입이 완료되었습니다.");
        } else if (result == 0) {
            System.out.println("회원가입에 실패하였습니다.");
        }
    }

    @Override
    public void DriverMemberDeleteData(DriverLoginRepository driverLoginRepository) {

        JDBConnection();
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String sql = "delete from Driverdatabase Where DriverId = ? and DriverPw = ?";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, driverLoginRepository.DriverId);
            pstmt.setString(2, driverLoginRepository.DriverPw);

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

            if (result > 0) {
                System.out.println("회원탈퇴에 성공하였습니다.");
            } else if (result == 0) {
                System.out.println("회원탈퇴에 실패하였습니다. 아이디와 비밀번호를 확인해주세요");
            }
        }

}