package PassengerUser.LoginService;

import PassengerUser.Interface.UserException;

import java.util.regex.Pattern;



public class UserExceptionImpl  {

    public void idFormat(String str) throws AuthenException {

        // 아이디 길이 지정하기
        if (str.length() < 6 || str.length() > 12) {
            throw new AuthenException("아이디는 6~12자 이내로만 가능합니다.");
        }

        int cnt1 = 0;
        int cnt2 = 0;

        // 아이디 형식 지정하기
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // 원하는 위치의 변수 가져옴
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                cnt1++;
            else if (ch >= '0' && ch <= '9')
                cnt2++;
        }

        if (cnt1 == 0 || cnt2 == 0)
            throw new AuthenException("아이디는 영어와 숫자를 섞어 만들어주세요");

    }

    public void pwCheck(String pw1, String pw2) throws AuthenException {

        int cnt1 = 0;
        int cnt2 = 0;


        // 비밀번호 형식 지정하기
        for (int i = 0; i < pw1.length(); i++) {
            char ch = pw1.charAt(i); //
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                cnt1++;
            else if (ch >= '0' && ch <= '9')
                cnt2++;
        }

        if (cnt1 == 0 || cnt2 == 0)
            throw new AuthenException("비밀번호는 영문자와 숫자를 혼용해 만들어주세요");

        if (!pw1.equals(pw2))
            throw new AuthenException("비밀번호가 다릅니다 다시 확인해주세요");
    }

    //성별확인
    public void genderCheck(String gender) throws AuthenException {

        if (gender.equals("남") && gender.equals("여"))
            throw new AuthenException("성별은 남과 여 둘중에 하나로 입력해주세요!");

    }

    // 이름 확인
    public void nameCheck(String name) throws AuthenException {
        boolean check = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name); // 한글 양식

        if (!check)
            throw new AuthenException("이름은 한글로 입력해주세요");
    }

    // 전화번호 확인
    public void phoneNumCheck(String PhoneNum) throws AuthenException {
        boolean check = Pattern.matches(
                "(010)-(\\d{4})-(\\d{4})", PhoneNum);

        if (!check)
            throw new AuthenException("※전화번호 입력 형식은 [010-XXXX-XXXX]입니다");

    }

    public void birthCheck(String birth) throws AuthenException {
        if(birth.length() < 8) {
            throw new AuthenException("생년월일 입력 양식은 YYYYMMDD 입니다.");
        }
        else {
            boolean check = Pattern.matches(
                    "(\\d{8})", birth);
            if(!check)
                throw new AuthenException("생년월일 입력 양식은 YYYYMMDD 입니다");


        }

    }
    }


