package PassengerUser;

import PassengerUser.LoginService.*;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        UserInsertDataImpl userInsertDataImpl = new UserInsertDataImpl();


        while (run) {
            System.out.println("0. db연결 1. 회원가입 테스트 2. 회원 탈퇴 테스트 3.로그인 테스트, " +
                    "4. 로그아웃");
            int num = sc.nextInt();
            if (num == 0) {
                new PassengerMemberServiceImpl().jdbcConnection();
            }

            if (num == 1) { // 회원가입하기
                userInsertDataImpl.InsertPassengerMemberJoinData();
            }
                if (num == 2) { // 회원탈퇴하기
                    userInsertDataImpl.InsertPassengerDeleteData();
                }

                if (num == 3) { // 로그인하기
                    userInsertDataImpl.InsertPassengerLoginData();
                }

                if (num == 4) { // 로그아웃
                    userInsertDataImpl.InsertPassengerLogoutData();
                }
            }
        }
    }
