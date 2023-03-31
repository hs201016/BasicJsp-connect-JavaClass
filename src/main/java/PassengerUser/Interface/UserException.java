package PassengerUser.Interface;

public interface UserException {

    // 흠 상속이 안되네

    public void idFormat(String str);

    public void pwCheck(String pw1, String pw2);

    public void genderCheck(String gender);

    public void nameCheck(String name);

    public void phoneNumCheck(String PhoneNum);

    public void birthCheck(String birth);
}
