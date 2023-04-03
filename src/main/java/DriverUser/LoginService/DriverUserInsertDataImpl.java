package DriverUser.LoginService;

import DriverUser.Interface.DriverUserInsertData;

import java.util.Scanner;

public class DriverUserInsertDataImpl implements DriverUserInsertData {


    Scanner sc = new Scanner(System.in);

    DriverMemberServiceImpl driverMemberService = new DriverMemberServiceImpl();
    DriverLoginServiceImpl driverLoginService = new DriverLoginServiceImpl();

    DriverMemberSQL driverMemberSQL = new DriverMemberSQL();

    @Override
    public void InsertDriverJDBCConnection() {
        driverMemberSQL.JDBConnection();
    }

    @Override
    public void InsertDriverMemberJoinData() {

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

    @Override
    public void InsertDriverDeleteData() {
        System.out.println("아이디를 입력하세요");
        String id = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String pw = sc.next();

        DriverLoginRepository driverLoginRepository = new DriverLoginRepository(id, pw);
        driverLoginService.DriverLogin(driverLoginRepository);

    }

    @Override
    public void InsertDriverLoginData() {
        driverLoginService.DriverLogout();
    }

    @Override
    public void InsertDriverLogoutData() {

        System.out.println("아이디를 입력하세요");
        String id = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String pw = sc.next();

        DriverLoginRepository driverLoginRepository = new DriverLoginRepository(id, pw);
        driverMemberService.DriverMemberDeleteData(driverLoginRepository);
    }
}
