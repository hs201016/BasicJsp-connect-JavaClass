package PassengerUser.LoginService;

public class PassengerMember {

    private String id;

    private String pw;

    private String name;

    private String gender;

    private String phoneNum;

    private String birth;

    public PassengerMember(String id, String pw, String name, String gender, String phoneNum, String birth) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.birth = birth;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {

        String str = String.format("아이디:%s \n이름:%s \n성별:%s \n생일:%s \n",

                id, name, gender, birth);


        return str;
    }

}
