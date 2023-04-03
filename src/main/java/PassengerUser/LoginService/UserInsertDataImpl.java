package PassengerUser.LoginService;

import PassengerUser.Interface.UserInsertData;

import java.util.Scanner;

public class UserInsertDataImpl implements UserInsertData { // 사용자에게 입력을 받는 클래스

    UserExceptionImpl userExceptionImpl = new UserExceptionImpl();
    Scanner sc = new Scanner(System.in);
    PassengerMemberServiceImpl passengerMemberService = new PassengerMemberServiceImpl();
    PassengerLoginServiceImpl login1 = new PassengerLoginServiceImpl();

    PassengerMemberSQL passengerMemberSQL = new PassengerMemberSQL();

    @Override
    public void InsertUserDataJDBCConnection() {
        passengerMemberSQL.jdbcConnection();
    }

    @Override
    public void InsertPassengerMemberJoinData() {


        try {

            System.out.println("id");
            String id = sc.next();
            userExceptionImpl.idFormat(id);

            System.out.println("pw");
            String pw = sc.next();
            System.out.println("pw2");
            String pw2 = sc.next();
            userExceptionImpl.pwCheck(pw, pw2);

            System.out.println("name");
            String name = sc.next();
            userExceptionImpl.nameCheck(name);

            System.out.println("gender");
            String gender = sc.next();
            userExceptionImpl.genderCheck(gender);

            System.out.println("phoneNum");
            String phoneNum = sc.next();
            userExceptionImpl.phoneNumCheck(phoneNum);

            System.out.println("studentId");
            String studentId = sc.next();
            userExceptionImpl.studentIdCheck(studentId);

            System.out.println("place");
            String place = sc.next();

            PassengerMember passengerMember = new PassengerMember(id, pw, name, gender, phoneNum, studentId, place);
            passengerMemberService.PassengerJoin(passengerMember);

        } catch (AuthenException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void InsertPassengerDeleteData() {

        System.out.println("id");
        String id = sc.next();
        System.out.println("pw");
        String pw = sc.next();

        PassengerLoginRepository PassengerLoginRepository = new PassengerLoginRepository(id, pw);
        passengerMemberService.PassengerDeleteData(PassengerLoginRepository);
    }

    @Override
    public void InsertPassengerLoginData() {

        System.out.println("id");
        String id = sc.next();
        System.out.println("pw");
        String pw = sc.next();

        PassengerLoginRepository PassengerLoginRepository = new PassengerLoginRepository(id, pw);
        login1.login(PassengerLoginRepository);

    }

    @Override
    public void InsertPassengerLogoutData() { // Insert 는 아니지만 일단 여기둠
        login1.logout();
    }

}

