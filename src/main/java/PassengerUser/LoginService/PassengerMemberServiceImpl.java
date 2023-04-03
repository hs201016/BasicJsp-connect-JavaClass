package PassengerUser.LoginService;


import java.sql.SQLException;
import java.util.Scanner;

public class PassengerMemberServiceImpl extends
        PassengerMemberSQL implements PassengerUser.Interface.PassengerMemberService {

    @Override
    public void PassengerJoin(PassengerMember passengerMember) { // 캡슐화를 위해 member

        jdbcConnection(); // con 초기화 하기 위해서
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String sql = "INSERT INTO Passengerdatabase VALUES(?,?,?,?,?,?,?)";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, passengerMember.getId());
            pstmt.setString(2, passengerMember.getPw());
            pstmt.setString(3, passengerMember.getName());
            pstmt.setString(4, passengerMember.getPhoneNum());
            pstmt.setString(5, passengerMember.getGender());
            pstmt.setString(6, passengerMember.getStudentId());
            pstmt.setString(7, passengerMember.getPlace());

            result = pstmt.executeUpdate(); // 영향을 미친 수 만큼 올라감

        } catch (SQLException e) {
            e.printStackTrace(); //예외 상황을 분석하기 위한 용도로 사용 성능이 중요하면 잘 사용 x
        }

        if (result == 1) {
            System.out.println("회원가입 되었습니다.");
        } else if (result == 0) {
            System.out.println("회원가입에 실패하였습니다");
        }

    }

    @Override
    public void PassengerDeleteData(PassengerLoginRepository passengerLoginRepository) {
        jdbcConnection(); // con 초기화하기
        Scanner sc = new Scanner(System.in);
        int result = 0;

        try {
            String sql = "delete from Passengerdatabase where id=? and pw=?";
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, passengerLoginRepository.id);
            pstmt.setString(2, passengerLoginRepository.pw);

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (result > 0) {
            System.out.println("회원탈퇴가 완료되었습니다.");
        } else if (result == 0) {
            System.out.println("회원탈퇴가 실패하였습니다.");
        }
    }
}








