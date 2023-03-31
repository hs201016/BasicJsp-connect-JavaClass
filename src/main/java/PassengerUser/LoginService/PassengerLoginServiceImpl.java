package PassengerUser.LoginService;

import PassengerUser.Interface.PassengerLoginService;

import java.sql.SQLException;

public class PassengerLoginServiceImpl extends PassengerMemberSQL implements PassengerLoginService {

    boolean session = false;


    @Override
    public int login(PassengerLoginRepository PassengerLoginRepository) {
        jdbcConnection(); // con 초기화
        String sql = "select pw from Passengerdatabase where id = ?";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, PassengerLoginRepository.id);
            rs = pstmt.executeQuery(); // 여기부터 공부하기
            if (rs.next()) { // 다음행으로 넘기는 쿼리
                if (rs.getString(1).equals(PassengerLoginRepository.pw)) {
                    System.out.println("로그인에 성공하였습니다.");
                    session = true;
                    return 1; // 로그인 성공

                } else {
                    System.out.println("비밀번호가 올바르지 않습니다.");
                    return 0; // 로그인 실패

                }
            }
            System.out.println("아이다가 존재하지 않습니다.");
            return -1; // 아이디가 없음 if문 밖에 있는 경우는 id가 존재하지 않을 때 즉시 리턴하기 위함.
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("시스템에 문제가 발생하였습니다.");
        return -2;  // 아예 오류

    }

    @Override
    public void logout() {
        jdbcConnection(); // con 초기화
        if (session == true) {
            session = false;
            System.out.println("로그아웃 되었습니다.");
        } else {
            System.out.println("로그인이 되어 있지 않습니다.");
        }
    }
}
