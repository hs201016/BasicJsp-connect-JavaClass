package DriverUser.LoginService;

import java.sql.SQLException;

public class DriverLoginServiceImpl extends DriverMemberSQL implements DriverUser.Interface.DriverLoginService {

    boolean
            DriverSession = false;

    public void Test(DriverLoginRepository driverLoginRepository) {
        JDBConnection(); // con초기화
        int result = 0;
        String sql = "select DriverPw from Driverdatabase Where DriverId = ?";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, driverLoginRepository.DriverId);
            rs = pstmt.executeQuery();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int DriverLogin(DriverLoginRepository driverLoginRepository) {

        JDBConnection(); // con초기화
        int result = 0;
        String sql = "select DriverPw from Driverdatabase Where DriverId = ?";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, driverLoginRepository.DriverId); // 1번쨰 값에 Driver id를 넣어줌
            rs = pstmt.executeQuery(); // result 객체로 반환함
            System.out.println(rs);
            if (rs.next()) {  // 다음행으로 넘기면서 비교
                if (rs.getString(1).equals(driverLoginRepository.DriverPw)) {
                    System.out.println("로그인에 성공하였습니다.");
                    DriverSession = true;
                    return 1;
                } else {
                    System.out.println("비밀번호가 다릅니다.");
                    return 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("존재하지 않는 아이디입니다.");
        return -1;

    }

    @Override
    public void DriverLogout() {
        if(DriverSession == true) {
            DriverSession = false;
            System.out.println("로그아웃 되었습니다.");
        }   else
            System.out.println("로그인 상태가 아닙니다.");
    }

}
