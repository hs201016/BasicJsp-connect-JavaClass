package DriverUser;

import java.util.Scanner;

public class DriverTest {

    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        DriverMemberServiceImpl driverMemberService = new DriverMemberServiceImpl();
        DriverLoginServiceImpl driverLoginService = new DriverLoginServiceImpl();
        DriverMemberSQL driverMemberSQL = new DriverMemberSQL();

        while (run) {
            System.out.println("0.DB connection  1. 회원가입 테스트, 2.로그인 테스트 3.로그아웃 테스트 " +
                    ", 4.회원탈퇴 테스트");
            int num = sc.nextInt();
            if (num == 0) {
                driverMemberSQL.JDBConnection();
            }

            if (num == 1) {
                System.out.println("id");
                String id = sc.next();
                System.out.println("pw");
                String pw = sc.next();
                System.out.println("name");
                String name = sc.next();
                System.out.println("gender");
                String gender = sc.next();
                System.out.println("phoneNum");
                String phoneNum = sc.next();
                System.out.println("place");
                String place = sc.next();

                DriverMember driverMember = new DriverMember(id, pw, name, gender, phoneNum, place);
                driverMemberService.DriverMemberJoin(driverMember);
            }

            if(num == 2) {
                System.out.println("아이디를 입력하세요");
                String id = sc.next();
                System.out.println("비밀번호를 입력하세요");
                String pw = sc.next();

                DriverLoginRepository driverLoginRepository = new DriverLoginRepository(id,pw);
                driverLoginService.DriverLogin(driverLoginRepository);
            }

            if(num == 3) {
                driverLoginService.DriverLogout();
            }
            if(num == 4) {
                System.out.println("아이디를 입력하세요");
                String id = sc.next();
                System.out.println("비밀번호를 입력하세요");
                String pw = sc.next();

                DriverLoginRepository driverLoginRepository = new DriverLoginRepository(id,pw);
                driverMemberService.DriverMemberDeleteData(driverLoginRepository);
            }

        }

    }
}
