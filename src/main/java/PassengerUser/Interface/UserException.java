package PassengerUser.Interface;

import PassengerUser.LoginService.AuthenException;

public interface UserException {



    public void idFormat(String str) throws AuthenException;

    public void pwCheck(String pw1, String pw2) throws AuthenException;

    public void genderCheck(String gender) throws AuthenException;

    public void nameCheck(String name) throws AuthenException;

    public void phoneNumCheck(String PhoneNum) throws AuthenException;

    public void studentIdCheck(String studentID) throws AuthenException;

    public void placeCheck(String place) throws AuthenException;
}
