package DriverUser;

import DriverUser.LoginService.*;

import java.util.Scanner;

public class DriverTest {

    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        DriverMemberSQL driverMemberSQL = new DriverMemberSQL();
        DriverUserInsertDataImpl driverUserInsertData = new DriverUserInsertDataImpl();

        while (run) {
            System.out.println("0.DB connection  1. 회원가입 테스트, 2.로그인 테스트 3.로그아웃 테스트 " +
                    ", 4.회원탈퇴 테스트");
            int num = sc.nextInt();
            if (num == 0) {
                driverUserInsertData.InsertDriverJDBCConnection();
            }

            if (num == 1) {
                driverUserInsertData.InsertDriverMemberJoinData();
            }

            if(num == 2) {
                driverUserInsertData.InsertDriverLoginData();
            }

            if(num == 3) {
                driverUserInsertData.InsertDriverLogoutData();
            }
            if(num == 4) {
                driverUserInsertData.InsertDriverDeleteData();
            }

        }

    }
}
